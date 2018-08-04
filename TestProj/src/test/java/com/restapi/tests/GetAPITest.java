package com.restapi.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.restapi.base.TestBase;
import com.restapi.client.RestClient;
import com.restapi.data.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.generated.vos.userinput.UserinputPost;
import com.google.gson.Gson;


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

//	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
	
		RestClient restclient= new RestClient();
//		restclient.get(url);
		System.out.println("------------------------");
		restclient.getResponse(url);
	}
	
	@Test // marshalling jackson api
	public void postAPITest() throws ClientProtocolException, IOException {
	
		RestClient restclient= new RestClient();
		HashMap<String , String> hashmap= new HashMap<String,String>();
		hashmap.put("content-Type", "application/json");

//		jackson api
		ObjectMapper mapper= new ObjectMapper();
		Users user = new Users("irfan","architect");
//		System.out.println("E:\\MyWorkSpace\\TestProj\\src\\main\\java\\com\\restapi\\data\\users.json");

//		object to json
		mapper.writeValue(new File ("E:\\MyWorkSpace\\TestProj\\src\\main\\java\\com\\restapi\\data\\users.json"),user);
		
		UserinputPost body= new UserinputPost();
		body.setName("Irfan");body.setJob("tech lead");
		Gson gson = new Gson();
		String json= gson.toJson(body);
		System.out.println(json);
		url=prop.getProperty("URL")+prop.getProperty("serviceURL");
		restclient.postRequest(url, json, hashmap);
		
	}
}
