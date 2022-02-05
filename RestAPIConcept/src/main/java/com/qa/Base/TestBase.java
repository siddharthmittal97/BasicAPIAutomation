package com.qa.Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class TestBase 
{
	 public Properties pro;	
	 public TestBase()
	 {
		//A File object is created by passing in a String that represents the name of a file, or a String or another File object 
		File src = new File("C:\\Users\\idea\\Automation\\RestAPIConcept\\src\\main\\java\\com\\qa\\config\\config.properties");
		try {
			 //FileInputStream class obtains input bytes from a file .It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	 }
}

