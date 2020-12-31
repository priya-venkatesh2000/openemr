package com.openemr.businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.openemr.configuration.Prop;

public class Baseutil {

	public static WebDriver driver=null;
	
	public static void openApp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-framework\\com.openemr\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Prop.get("url"));
	}
	
	
}
