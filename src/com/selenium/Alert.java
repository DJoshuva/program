package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	WebElement simple = driver.findElement(By.xpath("//button [@class='btn btn-danger']"));
	simple.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();

	WebElement select = driver.findElement(By.xpath("(//a [@class=\"analystic\"])[2]"));	
select.click();
Thread.sleep(2000);

WebElement confrim = driver.findElement(By.xpath("//button [@class=\"btn btn-primary\"]"));
  confrim.click();
Thread.sleep(2000);
driver.switchTo().alert().dismiss();
Thread.sleep(3000);

WebElement select1 = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]"));
select1.click();
Thread.sleep(9000);

WebElement Enter = driver.findElement(By.xpath("//button [@class=\"btn btn-info\"]"));
Enter.click();
Thread.sleep(3000);

driver.switchTo().alert().sendKeys("suriya");
Thread.sleep(9000);
driver.switchTo().alert().accept();
}
}








