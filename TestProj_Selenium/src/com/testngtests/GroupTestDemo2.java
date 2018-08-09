package com.testngtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumsessions.Browser;

public class GroupTestDemo2 {
	WebDriver driver;
	
	@BeforeMethod 
	public void setUp() {

		System.out.println("before method");
	}
	
	@Test(priority=1,groups="smoke")
	public void test1() {

		System.out.println("Test1");
	}
	
	@Test(priority=3,groups="sanity")
	public void test2() {

		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="regression")
	public void test3() {

		System.out.println("Test3");
	}

	
	@Test(priority=4,groups="sanity")
	public void test4() {

		System.out.println("Test4");
	}

	@Test(priority=5,groups="funtional")
	public void test6() {

		System.out.println("Test6");
	}
	@Test(priority=2,groups="smoke")
	public void test5() {
		
		System.out.println("Test5");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("tear down");
		
	}

}
