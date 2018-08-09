package com.testngtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumsessions.Browser;

public class PriorityTestDemo {
	WebDriver driver;
	
	@BeforeMethod 
	public void setUp() {

		System.out.println("before method");
	}
	
	@Test(priority=1)
	public void test1() {

		System.out.println("Test1");
	}
	
	@Test(priority=1)
	public void test2() {

		System.out.println("Test2");
	}
	
	@Test(priority=10)
	public void test3() {

		System.out.println("Test3");
	}

	
	@Test(priority=-111)
	public void test4() {

		System.out.println("Test4");
	}

	@Test(priority=-11)
	public void test6() {

		System.out.println("Test6");
	}
	@Test(priority=-1)
	public void test5() {
		
		System.out.println("Test5");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("tear down");
		
	}

}
