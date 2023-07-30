package com.naveen.SpringBootDemo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before( "execution(public * AlianController.getalians())")
	public void logBefore() {
		logger.info("before logger message from logging Aspect......to file....");
	}

	@AfterReturning( "execution(public * AlianController.getalians())")
	public void logAfter() {
		logger.info("after logger message from logging Aspect......to file....");
	}
	
	@AfterThrowing( "execution(public * AlianController.getalians())")
	public void logthrowing() {
		logger.info("######################   Issue at logging Aspect. ...");
	}
}
