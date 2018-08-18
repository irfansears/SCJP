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

import junit.framework.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generated.vos.userinput.UserinputPost;
import com.generated.vos.userinput.UserinputResponse2;
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
	
//	@Test // marshalling jackson api
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
	
	@Test // marshalling jackson api
	public void postTest() throws ClientProtocolException, IOException {

//		create object
		RestClient restclient= new RestClient();// create object
		url=prop.getProperty("URL")+prop.getProperty("serviceURL"); // url
//		create response body
		UserinputPost body= new UserinputPost();
		body.setName("Irfan1");body.setJob("tech leader");
//		convert java body to string by using gson
		Gson gson = new Gson();
		String json= gson.toJson(body);
		HashMap<String , String> hashmap= new HashMap<String,String>();
		hashmap.put("content-Type", "application/json");
		String response =restclient.post(url, json, hashmap);
		
		UserinputResponse2 f= gson.fromJson(response, UserinputResponse2.class);
		System.out.println("inside aray: "+f.getName());
		System.out.println("inside aray: "+f.getJob());
		System.out.println("inside aray: "+f.getId());
		System.out.println(f.getCreatedAt());
		Assert.assertEquals(body.getName(), f.getName());
		Assert.assertEquals(body.getJob(), f.getJob());
	}
}
