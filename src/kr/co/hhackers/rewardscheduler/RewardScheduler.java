package kr.co.hhackers.rewardscheduler;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import kr.co.hhackers.rewardscheduler.job.FlagDBConnectionInstance;
import kr.co.hhackers.rewardscheduler.job.RewardJobs;

public class RewardScheduler {

	public static void main(String[] args) {
		System.out.println("Reward Unlock Scheduler ");
		try {
			System.out.println("Start Cron Scheduler");
			SchedulerFactory schedulerFactory = new StdSchedulerFactory();
			
			Scheduler scheduler = schedulerFactory.getScheduler();

			JobDetail joblogparser = JobBuilder.newJob(RewardJobs.class).withIdentity("logparserjobName", Scheduler.DEFAULT_GROUP).requestRecovery(true).build();
			Trigger triggerlogparser = TriggerBuilder.newTrigger().withIdentity("logparsertrggerName", Scheduler.DEFAULT_GROUP)
					.withSchedule(CronScheduleBuilder.cronSchedule("0 30 0/1 * * ?")).build();		//한 시간 단위로 스케쥴러를 가동한다. 매시 30분에 실행
				  //.withSchedule(CronScheduleBuilder.cronSchedule("10 0 0/1 * * * ?")).build();		//테스트를 위하여 초단위로 스케쥴러를 가동한다.
			
			scheduler.scheduleJob(joblogparser, triggerlogparser);

			scheduler.start();
			
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		} 
	}
}
