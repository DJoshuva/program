package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
	
}
}
