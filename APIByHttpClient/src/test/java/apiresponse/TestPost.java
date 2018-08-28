package apiresponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestPost {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		String body="{\n    \"name\": \"morpheus1\",\n    \"job\": \"leader1\"\n}";
		System.out.println("-----");
		String url= "https://reqres.in/api/users";
		
		HttpPost post = new HttpPost(url);
		post.addHeader("content-Type","application/json"); // set headers
		post.setEntity(new StringEntity(body)); //set payload or body
		
		CloseableHttpClient client = HttpClients.createDefault();
		CloseableHttpResponse response= client.execute(post);

		
System.out.println("-----");
		
		System.out.println("getStatusCode : "+response.getStatusLine().getStatusCode());
		System.out.println("getReasonPhrase : "+response.getStatusLine().getReasonPhrase());
		System.out.println("getProtocolVersion : "+response.getStatusLine().getProtocolVersion());

		
		
		Header [] header= response.getAllHeaders();
		for (int i = 0; i < header.length; i++) {
			System.out.println(i+" header is : "+header[i]);
		}
		
		System.out.println("entity.getContent : "+response.getEntity().getContent());
		System.out.println("entity.getContentLength : "+response.getEntity().getContentLength());
		System.out.println("entity.getContentEncoding : "+response.getEntity().getContentEncoding());
		System.out.println("entity.getContentType : "+response.getEntity().getContentType());
		System.out.println("entity.isChunked : "+response.getEntity().isChunked());
		System.out.println("entity.isRepeatable : "+response.getEntity().isRepeatable());
		System.out.println("entity.isStreaming : "+response.getEntity().isStreaming());
//		System.out.println("entity.getContentLength : "+response.getEntity().consumeContent());
		
		System.out.println("get first header : "+response.getFirstHeader("Content-Type: application/json; charset=utf-8"));
		System.out.println("get first header : "+response.getLastHeader("Content-Type: application/json; charset=utf-8"));
		System.out.println("get first header : "+response.getLocale());
		System.out.println("get first header : "+response.getParams());

		Iterator itr=response.headerIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		System.out.println("without utf :"+EntityUtils.toString(response.getEntity()));
//		System.out.println("with utf :"+EntityUtils.toString(response.getEntity(),"UTF-8"));
//		System.out.println(EntityUtils.toString(response.getEntity().getContent()));
		BufferedReader br= new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		System.out.println("buff : "+br.readLine());
	}

}
