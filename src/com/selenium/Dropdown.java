package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

WebElement search = driver.findElement(By.xpath("(//a [@role=\"button\"])[2]"));
search.click();
Thread.sleep(3000);


WebElement Date = driver.findElement(By.id("day"));
Select S=new Select(Date);
S.selectByVisibleText("4");
Thread.sleep(4000);

WebElement month = driver.findElement(By.id("month"));
Select S1=new Select(month);
S1.selectByVisibleText("Jun");
Thread.sleep(4000);
 
WebElement year = driver.findElement(By.id("year"));
Select S2=new Select(year);
S2.selectByVisibleText("2019");
Thread.sleep(4000);

WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
gender.click();
}
}
