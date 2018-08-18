package com.dataprovidertests;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.utility.TestUtils;

public class HalfEbayTest {

	@BeforeTest
	private void setUp() {

		System.out.println("in Before Method");
	}

	@Test(dataProvider="getTestData")
	public void halfEbayTest(String name, String age) {

		System.out.println("in test");
		System.out.println(name+" : "+age);
	}
	
	@Test(dataProvider="getTestDataFromExcel")
	public void halfEbay1Test(String name, String age,String phoneNumber) {

		System.out.println("in test");
		System.out.println(name+" : "+age +" : "+phoneNumber);
	}
	
	@DataProvider
	public Iterator<Object[]>  getTestData() {
		ArrayList<Object[]> al= new ArrayList<Object[]>();
		for (int j = 0; j < 10; j++) {

			Object[] objarr= new Object[2];
				objarr[0] = "A";
				objarr[1] = "B";
			al.add(objarr);
		}
		System.out.println(al);
		return al.iterator();
	}
	
	@DataProvider
	public Iterator<Object[]>  getTestDataFromExcel() {
		
		ArrayList<Object[]> al= TestUtils.getDataFromExcel();
		return al.iterator();
	}
	

	@AfterMethod
	public void tearDown() {

		System.out.println("in After Method");
	}

}
