package com.selenium;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Concept {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	Robot rb =new Robot();
	rb.keyPress(KeyEvent.VK_S);
	rb.keyPress(KeyEvent.VK_U);
	rb.keyPress(KeyEvent.VK_R);
	rb.keyPress(KeyEvent.VK_I);
	rb.keyPress(KeyEvent.VK_0);

	
	Thread.sleep(2000);

	//rb.keyPress(KeyEvent.VK_COPY);
	
//rb.keyPress(KeyEvent.VK_CUT);
WebElement fb = driver.findElement(By.id("pass"));
	Actions fb1=new Actions(driver);
	fb1.contextClick(fb).perform();
	
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_COPY);
	rb.keyPress(KeyEvent.VK_ENTER)
	rb.keyPress(KeyEvent.VK_PASTE);
	//rb.keyPress(KeyEvent.VK_0);
	
	}
	
	
}
