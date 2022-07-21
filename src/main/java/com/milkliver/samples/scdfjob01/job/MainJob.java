package com.milkliver.samples.scdfjob01.job;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainJob {

	private static final Logger log = LoggerFactory.getLogger(MainJob.class);

	@PostConstruct
	public void run() {

		log.info("2022,07,21 16:09");
		log.info("this is java sample");

	}

}
