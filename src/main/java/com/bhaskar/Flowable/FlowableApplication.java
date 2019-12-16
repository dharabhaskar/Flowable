package com.bhaskar.Flowable;

import lombok.extern.log4j.Log4j2;
import org.flowable.engine.ProcessEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FlowableApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowableApplication.class, args);
	}

}

@Component
@Log4j2
class ProcessDemo{
	private final ProcessEngine processEngine;

	ProcessDemo(ProcessEngine processEngine){
		this.processEngine=processEngine;
	}

	String beginCustomerEnrollmentProcess(String custID, String email){
		return null;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void enrollUser()throws Exception{
		//log.info("Process info ID:",beginCustomerEnrollmentProcess("1","bhaskar@gmail.com"));
	}

}
