package com.qa.test;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.RestClient.RestClient;
public class MainTest extends TestBase
{
	TestBase tb;
	String apiurl;
	String serviceurl;
	String url;
	
	@BeforeMethod
	public void Setup() throws ClientProtocolException, IOException
	{
		tb = new TestBase();
		apiurl = pro.getProperty("URL");
		serviceurl = pro.getProperty("serviceurl");
		url = apiurl + serviceurl;
	}
	
	@Test 
	public void Testing() throws ClientProtocolException, IOException
	{
		RestClient rs = new RestClient();
		rs.get(url);
	}
}
