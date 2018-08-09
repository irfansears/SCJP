package com.testngtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumsessions.Browser;

public class ExceptionTimeOutTestDemo {

//	@Test(groups="smoke",timeOut=2,inv)
	public void test1() {

		int count=0;
		while(true){
			
			System.out.println(++count);
		}
	}
	
	

}
