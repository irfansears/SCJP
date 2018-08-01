package com.restapi.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.restapi.base.TestBase;
import com.restapi.client.RestClient;


public class GetAPITest extends TestBase 
{
	TestBase testBase;
	String url;
	
	@BeforeMethod
	public void setUp() 
	{
		testBase= new TestBase();
		url=prop.getProperty("URL")+prop.getProperty("serviceURL");
	}

	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
	
		RestClient restclient= new RestClient();
		restclient.get(url);
	}
}
