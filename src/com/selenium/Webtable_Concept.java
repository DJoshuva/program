package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Concept {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/html/html_tables.asp");
List<WebElement> Alldata = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td"));
for (WebElement data : Alldata) {
	System.out.println(data.getText());
}
List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]"));
for (WebElement rows : row) {
	System.out.println(rows.getText());
}


}
}
