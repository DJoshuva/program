package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/search?q=jesus&client=firefox-b-d&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiTzOiWiOb3AhVnS2wGHdm8C7YQ_AUoAXoECAIQAw&biw=1536&bih=731&dpr=1.25");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destinate=new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Screenshot");
	FileUtils.copyFileToDirectory(source, destinate);
	Thread.sleep(2000);
	}
}
