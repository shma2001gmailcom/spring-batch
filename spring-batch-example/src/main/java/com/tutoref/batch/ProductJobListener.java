package com.tutoref.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class ProductJobListener implements JobExecutionListener {

	
	public void beforeJob(JobExecution job) {
		System.out.println("Before processing job : " + job.getId() );
	}
	
	public void afterJob(JobExecution job) {
		System.out.println("After processing job : " + job.getId() );
	}

}
