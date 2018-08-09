package com.testngtests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*set chrome driver path
launchBrowser
login
enter URL
google title test
logout
closeBrowser
deleteAllCookies*/
public class TestngBasics {
//	pre conditions
	@BeforeSuite //1
	public void setUp() {

		System.out.println("1 set chrome driver path");
	}
	
	@BeforeTest //2
	public void lauchBrowser() {
		System.out.println("2 launchBrowser");
		
	}
	@BeforeClass //3
	public void login() {

		System.out.println("3 login");
	}
	
	@BeforeMethod //4
	public void enterURL() {
		
		System.out.println("4 enter URL");
	}

//	Test case
	@Test //5
	public void googleTitleTest() {
		System.out.println("5 google title test");
		
	}
	
	@Test //5
	public void searchTest() {
		System.out.println("searchTest");
		
	}

	@Test //5
	public void googleLogoTest() {
		System.out.println("googleLogoTest");
		
	}

	
//	post conditions
	@AfterMethod //6
	public void logOut() {

		System.out.println("6 logout");
		
	}
	
	@AfterClass //7
	public void closeBrowser() {

		System.out.println("7 closeBrowser");
		
	}
	@AfterTest //8
	public void deleteAllCookies() {
		
		System.out.println("8 deleteAllCookies");
		
	}
	
	
	@AfterSuite //9
	public void generateTestReport() {

		System.out.println("9 generateTestReport");
		
	}
}

