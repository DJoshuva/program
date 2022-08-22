package com.selenium;



//import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Australia']"));
	WebElement scrollup = driver.findElement(By.xpath("(//span [@class='a-color-base'])[2]"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",scrollup);
	Thread.sleep(9000);
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].scrollIntoView();",scrolldown);
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-700)");
	Thread.sleep(2000);
	
	//TakesScreenshot ts=(TakesScreenshot)driver;
	//File source = ts.getScreenshotAs(OutputType.FILE);
	//File destinate=new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Screenshot\\img.png");
	//FileUtils.copyFileToDirectory(source, destinate);
	
	}
	
	
	
}
