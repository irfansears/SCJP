package com.restapi.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RestClient2 {

	
//	1.Get Method
	
	public void get(String URL) throws ClientProtocolException, IOException {
		String url= "https://reqres.in/api/users";
		HttpGet get= new HttpGet(url);
		CloseableHttpClient client= HttpClients.createDefault();
		CloseableHttpResponse resposne= client.execute(get);
		
		
		System.out.println("status code : "+resposne.getStatusLine().getStatusCode());
		BufferedReader br= new BufferedReader(new InputStreamReader(resposne.getEntity().getContent()));
		System.out.println(br.readLine());
		String response_string=EntityUtils.toString(resposne.getEntity(),"UTF-8");
	}
}
