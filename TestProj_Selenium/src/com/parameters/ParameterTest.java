package com.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	@Parameters({"url","email","password"})
	private void yahooLoginTest(String url, String email, String password) {

		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
		
	}
}
