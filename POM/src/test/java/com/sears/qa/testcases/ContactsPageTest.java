package com.sears.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sears.qa.base.TestBase;
import com.sears.qa.pages.ContactsPage;
import com.sears.qa.pages.HomePage;
import com.sears.qa.pages.LoginPage;
import com.sears.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	String sheetName = "contacts";
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage =loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		TestUtil.swithToMainPanelFrame();
		contactsPage=homePage.clickOnContactsLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
//	@Test(priority=1)
	public void verifyContactsLabelTest() {

		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contact label is mising on the page");
	}
	
//	@Test(priority=2)
	public void selectSingleContactsTest() {
		contactsPage.selectContactByName("Arun S");
	
	}
	
//	@Test(priority=3)
	public void selectMultipleContactsTest() {
		contactsPage.selectContactByName("Amit Thakur");
		contactsPage.selectContactByName("12345.0 ");
	
	}
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstName, String lastName, String company){
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactsPage.createNewContact(title, firstName, lastName, company);
		
	}
	
}
