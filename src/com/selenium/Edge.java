//browser launch


package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Edge {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

//name,id,login,Xpath
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("1234");

WebElement password = driver.findElement(By.name("pass"));
password.sendKeys("sdfg");

WebElement login = driver.findElement(By.name("login"));
login.click();
}
}
