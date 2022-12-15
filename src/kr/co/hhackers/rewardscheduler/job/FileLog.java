package kr.co.hhackers.rewardscheduler.job;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileLog {

	public FileLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void CreateDir(String path) {
		File Folder = new File(path);
		// ?��?�� ?��?��?��리�? ?��?��경우 ?��?��?��리�?? ?��?��?��?��?��.
		if (!Folder.exists()) {
			try {
				Folder.mkdir(); // ?��?�� ?��?��?��?��?��.
				// System.out.println("?��?���? ?��?��?��?��?��?��?��.");
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			// System.out.println("?���? ?��?���? ?��?��?��?�� ?��?��?��?��.");
		}
	}
	
	public static synchronized void WriteLog(String log) {
		CreateDir("logs");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyyMMdd");
		String sToday = formatter.format(cal.getTime());
		String sDate = formatter2.format(cal.getTime());
		String sFileName = "logs/WastMqttScheduler_" + sDate +"_log.txt";
		log = "[" + sToday + "]:" + log;
		System.out.println(log);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(sFileName, true));
			bw.write(log);
			bw.newLine();
			bw.close();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}

