package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.automationtesting.in/Frames.html");

WebElement frameconcept= driver.findElement (By.name("SingleFrame"));
driver.switchTo().frame(frameconcept);

WebElement findElement = driver.findElement(By.xpath("//input [@type=\"text\"]"));
findElement.sendKeys("sk");
Thread.sleep(2000);
 
driver.switchTo().parentFrame();

WebElement Secondframe= driver.findElement (By.xpath("(//a[@class=\"analystic\"])[2]"));
Secondframe.click();
driver.switchTo().frame(1);
driver.switchTo().frame(0);
 
WebElement findElement2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
findElement2.sendKeys("Hi");

}
}
