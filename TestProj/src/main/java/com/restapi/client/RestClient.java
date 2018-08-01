package com.restapi.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestClient {
	
//	1. GET
	public void get(String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet= new HttpGet(url);
		
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);

//		1. status code	
		int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("statusCode : "+statusCode);
		
//		2. response in json
		String respString= EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		JSONObject jsonResponse= new JSONObject(respString);
		System.out.println("jsonResponse : "+jsonResponse);
		
//		3. allheaders
		Header[] headerArr=closeableHttpResponse.getAllHeaders();
		HashMap<String,String> allHeaders = new HashMap<String,String>();
		for(Header header: headerArr)
		{
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println(allHeaders);
	}

}
