package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concepts {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
driver.manage().window().maximize();
 
WebElement course = driver.findElement(By.linkText("COURSES"));
Thread.sleep(2000);

Actions ac=new Actions(driver);
ac.moveToElement(course).perform();
Thread.sleep(2000);
course.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);
course.sendKeys(Keys.ARROW_DOWN);

WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
ac.moveToElement(oracle).perform();
Thread.sleep(3000);
WebElement certificate = driver.findElement(By.xpath("//span[text()='Automation Anywhere Training']"));
ac.click(certificate).perform();

//drag and drop concept
//WebElement Bank = driver.findElement (By.xpath("(//a [@class=\"button button-orange\"])[5]"));
//Thread.sleep(2000);
//WebElement Acount= driver.findElement( By.xpath("(//h3 [@align=\"center\"])[2]"));

//Actions ac1 = new Actions (driver);
//ac1.dragAndDrop(Bank, Acount).perform();
//Thread.sleep(2000);

//WebElement cash= driver.findElement (By.xpath("(//a [@class=\"button button-orange\"])[4]"));
//Thread.sleep(3000);
//WebElement Amount = driver.findElement (By.xpath("(//h3 [@align=\"center\"])[3]"));
//Thread.sleep(3000);
//Actions ac2=new Actions(driver);
//ac2.dragAndDrop(cash, Amount);
}

}
