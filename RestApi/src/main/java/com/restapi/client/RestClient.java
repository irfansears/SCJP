//package com.restapi.client;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.http.Header;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import com.fasterxml.jackson.core.JsonParser;
//import com.generated.vos.offer.OfferSchema;
//import com.generated.vos.userinput.UserinputResponse2;
//import com.google.gson.Gson;
//
//public class RestClient {
//	
////	1. GET
//	public void get(String url) throws ClientProtocolException, IOException {
//		
//		CloseableHttpClient httpClient = HttpClients.createDefault();
//		HttpGet httpGet= new HttpGet(url);
//		
//		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
//
////		1. status code	
//		int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
//		System.out.println("statusCode : "+statusCode);
//		
////		2. response in json
//		String respString= EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
//		JSONObject jsonResponse= new JSONObject(respString);
//		System.out.println("jsonResponse : "+jsonResponse);
//		jsonResponse.get("per_page");
////		jsonResponse.get("[]per_page");
//		
//		
////		3. allheaders
//		Header[] headerArr=closeableHttpResponse.getAllHeaders();
//		HashMap<String,String> allHeaders = new HashMap<String,String>();
//		for(Header header: headerArr)
//		{
//			allHeaders.put(header.getName(), header.getValue());
//		}
//		System.out.println(allHeaders);
//	}
//	
////	GET returning string 
//	public void getResponse(String url)  {
//		String singleJsonObject;
//		CloseableHttpResponse response;
//		CloseableHttpClient httpClient= HttpClients.createDefault();
//		HttpGet httpget= new HttpGet(url);
//		httpget.addHeader("accept","application/json");
//		try {
//			 response= httpClient.execute(httpget);
//			 BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//			 singleJsonObject= br.readLine();
//			 System.out.println(singleJsonObject);
//			 
//			/* System.out.println(response.getEntity().getContentLength()); //-1
//			 System.out.println(response.getEntity().getContentType()); //Content-Type: application/json; charset=utf-8
//			 System.out.println(response.getEntity().getContentEncoding()); //null
//			 System.out.println(response.getStatusLine().getReasonPhrase()); //OK
//			 System.out.println(response.getStatusLine().getStatusCode());//200
//*/			 
//
//			 Gson gson = new Gson();
////			 JsonParser p = new JsonParser();
//			 OfferSchema f= gson.fromJson(singleJsonObject, OfferSchema.class);
//			System.out.println("ppage :"+f.getPage());
//			System.out.println(f.getPerPage());
//			System.out.println("inside aray: "+f.getData().get(0).getFirstName());
//			System.out.println("inside aray: "+f.getData().get(1).getFirstName());
//			System.out.println("inside aray: "+f.getData().get(2).getFirstName());
//			 
//		} catch (ClientProtocolException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
////	Header in hashmap
//	public void getResponse(String url, HashMap<String , String> hashmap)  {
//		String singleJsonObject;
//		CloseableHttpResponse response;
//		CloseableHttpClient httpClient= HttpClients.createDefault();
//		HttpGet httpget= new HttpGet(url);
//		
//		for(Map.Entry<String, String> entry:hashmap.entrySet())
//		{
////			httpget.addHeader("accept","application/json"); // or
//			httpget.addHeader(entry.getKey(),entry.getValue());
//		}
//		try {
//			 response= httpClient.execute(httpget);
//			 BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//			 singleJsonObject= br.readLine();
//			 System.out.println(singleJsonObject);
//			 
//			 System.out.println(response.getEntity().getContentLength()); //-1
//			 System.out.println(response.getEntity().getContentType()); //Content-Type: application/json; charset=utf-8
//			 System.out.println(response.getEntity().getContentEncoding()); //null
//			 System.out.println(response.getStatusLine().getReasonPhrase()); //OK
//			 System.out.println(response.getStatusLine().getStatusCode());//200
//			 
//			 
//		} catch (ClientProtocolException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public void postRequest(String url, String payload, HashMap<String , String> hashmap) throws ClientProtocolException, IOException {
//		String singleJsonObject;
//		CloseableHttpResponse response;
//		
//		CloseableHttpClient httpclient= HttpClients.createDefault();
//		
//		HttpPost httppost=new HttpPost(url);
//		httppost.setEntity(new StringEntity (payload));
//		for(Map.Entry<String, String> entry:hashmap.entrySet())
//		{
//			httppost.addHeader(entry.getKey(),entry.getValue());
//		}
//	
//		response =httpclient.execute(httppost);
//		 BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//		 singleJsonObject= br.readLine();
//		 System.out.println(singleJsonObject);
//	
//		 Gson gson = new Gson();
////		 JsonParser p = new JsonParser();
//		UserinputResponse2 f= gson.fromJson(singleJsonObject, UserinputResponse2.class);
//		System.out.println("inside aray: "+f.getName());
//		System.out.println("inside aray: "+f.getJob());
//		System.out.println("inside aray: "+f.getId());
//		System.out.println(f.getCreatedAt());
//	}
//	
//		
//	public String post(String url, String payload, HashMap<String , String> hashmap) throws ClientProtocolException, IOException {
//		String singleJsonObject;
//		CloseableHttpResponse response;
//		
//		CloseableHttpClient httpclient= HttpClients.createDefault();
//		
//		HttpPost httppost=new HttpPost(url);
//		httppost.setEntity(new StringEntity (payload));
//		for(Map.Entry<String, String> entry:hashmap.entrySet())
//		{
//			httppost.addHeader(entry.getKey(),entry.getValue());
//		}
//	
//		response =httpclient.execute(httppost);
//		 BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//		 singleJsonObject= br.readLine();
//		 System.out.println(singleJsonObject);
//		 return singleJsonObject;
//	}
//
//}
