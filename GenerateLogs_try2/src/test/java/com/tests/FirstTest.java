package com.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
//private static Logger logger=Logger.getLogger("");
	@BeforeMethod
	private void setup() {

		System.out.println("this is before method");
	}
	
	@Test
	private void testOne() {

		System.out.println("this is test method");
		
	}
}
