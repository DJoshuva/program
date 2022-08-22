package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webelements_Methods {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop.demoqa.com/product/tokyo-talkies/");
WebElement Add = driver.findElement(By.xpath("//i[@class=\"icon_plus\"]"));
	Thread.sleep(2000);
		Add.click();

	WebElement addtocart = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
	addtocart.click();
	Thread.sleep(2000);
	driver.navigate().to("https://shop.demoqa.com/cart/");
	
	WebElement nextprocess = driver.findElement(By.xpath("//a[@class=\"checkout-button button alt wc-forward\"]"));
	nextprocess.click();
	Thread.sleep(2000);
	
	WebElement firstname = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
	firstname.sendKeys("suriya");
	Thread.sleep(2000);
	
	WebElement ln = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
	ln.sendKeys("D");
	Thread.sleep(2000);
	
	WebElement address = driver.findElement(By.xpath("(//input[@type=\"text\"])[6]"));
	address.sendKeys("no.07");
	Thread.sleep(2000);
	
	WebElement COUNTRY = driver.findElement(By.xpath("//span[@class=\"select2-selection__rendered\"]"));
	COUNTRY.click();
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	
	WebElement city = driver.findElement(By.xpath("(//input[@type=\"text\"])[8]"));
	city.sendKeys("chennai");
	Thread.sleep(2000);
		
	
	
	WebElement pincode = driver.findElement(By.xpath("(//input[@type=\"text\"])[9]"));
	pincode.sendKeys("654321");
	Thread.sleep(2000);
	
	WebElement phonenos = driver.findElement(By.xpath("(//input[@class=\"input-text \"])[8]"));
	phonenos.sendKeys("1234567890");
	Thread.sleep(2000);
	
	WebElement email = driver.findElement(By.xpath("(//input[@class=\"input-text \"])[9]"));
	email.sendKeys("kiran007@gmail.com");
	Thread.sleep(2000);
	
	Actions Ac=new Actions(driver);
Thread.sleep(2000);
WebElement Accept = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
Ac.click(Accept).perform();
WebElement place = driver.findElement(By.id("place_order"));
Ac.click(place).perform();

}
	} 


	
	
	
	
	

