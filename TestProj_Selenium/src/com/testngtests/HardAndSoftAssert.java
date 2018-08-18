package com.testngtests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {
	
	@Test
	private void m1() {

		SoftAssert soft= new SoftAssert();
		soft.assertTrue(false);
		System.out.println("soft executed");
		soft.assertTrue(false);
		System.out.println("soft executed");
		soft.assertTrue(true);
		System.out.println("soft executed");
		soft.assertTrue(true);
		System.out.println("soft executed");
		soft.assertAll();
	}

}
