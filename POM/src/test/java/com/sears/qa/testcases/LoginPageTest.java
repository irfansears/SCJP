package com.sears.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sears.qa.base.TestBase;
import com.sears.qa.pages.HomePage;
import com.sears.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {

		initialization();
		loginPage = new LoginPage();
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {

		String title= loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void crmLogoTest() {

		boolean flag= loginPage.validateCRMImage();
		Assert.assertTrue( flag);
	}
	
	@Test(priority=2)
	public void loginTest() {

		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
//		Assert.assertTrue( true);
	}
	
}
