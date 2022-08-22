package com.selenium;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	WebElement search = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	//search.sendKeys("iphones");
	Actions ac=new Actions(driver);
	ac.contextClick(search).perform();
	Thread.sleep(3000);


Robot rb=new Robot();
rb.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(3000);

Thread.sleep(3000);
rb.keyPress(KeyEvent.VK_ENTER);


String parent = driver.getWindowHandle();

Set<String> all_Id = driver.getWindowHandles();
Iterator<String> iterator = all_Id.iterator();

while (iterator.hasNext()) {
	String child = iterator.next();
driver.switchTo().window(child);
Thread.sleep(6000);

}

driver.switchTo().window(parent);


}
	
}
