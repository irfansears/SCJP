package com.tests;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	
	@Test
	private void Test1() {
		
		Assert.assertEquals(false, true);

	}
	
	@Test
	private void Test2() {

		Assert.assertEquals(false, true);
	}	

}
