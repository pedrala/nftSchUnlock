package kr.co.hhackers.rewardscheduler.job;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class RewardJobs implements Job {
	
	public Calendar CalendarFromString(String date, String formattype)
    {
		//yyyy-MM-dd
    	if(date == null || date == "" || date.isEmpty()==true) return null;
        Calendar cal = Calendar.getInstance();
        //System.out.println("CalendarFromString " + " : " + date);
        try
        {
            SimpleDateFormat formatter = new SimpleDateFormat(formattype);
            cal.setTime(formatter.parse(date));
        }
        catch(ParseException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return cal;
    }
	
	public String GetCurrentTime2String(String formattype) {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat(formattype);
		return formatter.format(now.getTime());
	}

	public String StringSimpleFromCalendar(Calendar cal, String formattype) {
		SimpleDateFormat formatter = new SimpleDateFormat(formattype);
		return formatter.format(cal.getTime());
	}
	
	public String StringFromCalendarSub(String formattype, int day, int hour) {
		Calendar pcal = Calendar.getInstance();
		pcal.add(Calendar.DATE, day * -1);
		pcal.add(Calendar.HOUR, hour);
		SimpleDateFormat formatter = new SimpleDateFormat(formattype);
		return formatter.format(pcal.getTime());
	}
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		final String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
		long beforeTime = 0; //
        long afterTime = 0; //
        long secDiffTime = 0;
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
        beforeTime = System.currentTimeMillis(); 
        
		System.out.println("Job2 Start Executed [" + new Date(System.currentTimeMillis()) + "]");
			
    	
    	FileLog.WriteLog(methodName + new Date().toString());
    	
    	int count = 0;
    	String from = StringFromCalendarSub("yyyy-MM-dd HH:mm:ss", 90, -6);
    	String to = StringFromCalendarSub("yyyy-MM-dd HH:mm:ss", 90, 0);
    	
		try {
			ProcessTrxUserWallet ptrxwallet = new ProcessTrxUserWallet();
			//동시 접근을 하지 못하도록 접근 권한을 얻어와야 한다.
			//당연히 이 스케쥴러의 동시 실행을 막기 위한 것이다.
			if(ptrxwallet.GetAccessRights() == true) {
				count = ptrxwallet.ProcessUnlock(from, to);
				/* 이 sleep은 테스트를 위해 넣어 둔것임.
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				ptrxwallet.SetAccessRights();
				//ptrxwallet.CloseProcessSession();
			} else {
				System.out.println("Lock 접근 권한을 얻을 수 없습니다.");
			}
			ptrxwallet.CloseProcessSession();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileLog.WriteLog(methodName + " from : " + from + " ~ to : " + to + " count : " + count);
		afterTime = System.currentTimeMillis();
		secDiffTime = (afterTime - beforeTime);
		System.out.println("execute Job End Executed [" + new Date(System.currentTimeMillis()) + "]");
		System.out.println("Executed (m) : " + secDiffTime);		
	}
}
