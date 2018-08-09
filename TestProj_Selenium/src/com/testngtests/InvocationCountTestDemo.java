package com.testngtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumsessions.Browser;

public class InvocationCountTestDemo {
	
	@Test(priority=3,groups="smoke")
	public void test1() {

		System.out.println("Test1");
//		int i=9/0;
	}
	
	@Test(priority=1,groups="sanity",dependsOnMethods="test1",invocationCount=10)
	public void test2() {

		System.out.println("Test2");
	}
	
	@Test(priority=1,groups="sanity",dependsOnMethods="test1")
	public void test3() {

		System.out.println("Test2");
	}
	
	
	/*@Test(priority=3,groups="regression")
	public void test3() {

		System.out.println("Test3");
	}
	
	@Test(priority=4,groups="sanity")
	public void test4() {

		System.out.println("Test4");
	}
*/
	

}
