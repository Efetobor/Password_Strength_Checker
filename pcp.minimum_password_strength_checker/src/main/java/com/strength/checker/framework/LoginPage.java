package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends Base {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//*[@id=\"UserName\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By loginButton = By.xpath("//*[@id=\"frmLogin\"]/div/div[1]/div[1]/div[3]/input");

	public void enterUsername(String text) {
		System.out.println("Attempting to enter Username");
		driver.findElement(username).sendKeys(text);
		System.out.println("Username Entered");
	}
	public void enterPassword(String text) {
		System.out.println("Attempting to enter Password");
		driver.findElement(password).sendKeys(text);
		System.out.println("Password Entered");
	}
	public void clearPassword() {
		System.out.println("Attempting to clear Password field");
		driver.findElement(password).clear();
		System.out.println("Password Cleared");
	}
	public void clickOnLoginButton() {
		System.out.println("Attempting to click Login Button");
		driver.findElement(loginButton).click();
		System.out.println("Login Button Clicked");
	}
	
}

