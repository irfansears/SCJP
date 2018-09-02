package com.tests;

import org.apache.log4j.Logger;

public class TestWithMain {

	static Logger log = Logger.getLogger(TestWithMain.class);
	public static void main(String[] args) {

		log.info("inmain method");
		System.out.println("hello world");
		log.warn("warning..");
		log.debug("debug");
		log.fatal("fatal");
		log.info("complted the main method");
	}

}
