package com.qa.RestClient;
import java.io.IOException;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
public class RestClient 
{
public void get(String url) throws ClientProtocolException, IOException
  {
	CloseableHttpClient httpClient = HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url);
	CloseableHttpResponse res = httpClient.execute(httpget);
	int Status = res.getStatusLine().getStatusCode();
	System.out.println("Status Code"+Status);
	String responseString = EntityUtils.toString(res.getEntity(),"UTF-8");
	JSONObject responsejson = new JSONObject(responseString);
	System.out.println("Response Body"+responsejson);
	
	Header[] headerArray = res.getAllHeaders();
	HashMap<String,String> allHeaders = new HashMap<String,String>();
	
	for(Header header:headerArray)
	{
		allHeaders.put(header.getName(), header.getValue());
	}
	System.out.println("Headers"+allHeaders);
  }
}
