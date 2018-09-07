package com.sears.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sears.qa.base.TestBase;
import com.sears.qa.pages.ContactsPage;
import com.sears.qa.pages.HomePage;
import com.sears.qa.pages.LoginPage;
import com.sears.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {

		initialization();
		loginPage = new LoginPage();
		homePage =loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {

		String homePageTitle= homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home page title is not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {

		TestUtil.swithToMainPanelFrame();
		boolean flag= homePage.verifyCorrectUserName();
		Assert.assertTrue( flag);
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest() {
		TestUtil.swithToMainPanelFrame();
		contactsPage=homePage.clickOnContactsLink();
//		Assert.assertTrue( true);
	}
//	
}
