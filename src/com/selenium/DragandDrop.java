package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	
	WebElement Bank = driver.findElement (By.xpath("(//a [@class=\"button button-orange\"])[5]"));
	Thread.sleep(2000);
	WebElement Acount= driver.findElement( By.xpath("(//h3 [@align=\"center\"])[2]"));

	Actions ac1 = new Actions (driver);
	ac1.dragAndDrop(Bank, Acount).perform();
	Thread.sleep(2000);
}

}




