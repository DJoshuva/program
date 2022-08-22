package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc_Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			    "C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
driver.switchTo().frame(0);
WebElement Id = driver.findElement(By.xpath("//input[@type=\"text\"]"));

Id.sendKeys("12345");

WebElement findElement = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
findElement.click();

}
}
