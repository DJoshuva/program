package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
public static WebDriver driver;
	
    @FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
private WebElement login;
 
	public Pom_Class(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
}
