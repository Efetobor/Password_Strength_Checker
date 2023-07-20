package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class GmailScreens extends GenericMethods {
	
	
	public GmailScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By createAccountButton = By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span");
	public By forMyPersonalUseOption = By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]");
	By firstNameField = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/input");
	By nextButton = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button/span");
	By dayField = By.xpath("//*[@id=\"day\"]");
	By monthDropdownButton = By.xpath("//*[@id=\"month\"]");
	By januaryOption = By.xpath("//*[@id=\"month\"]/option[2]");
	By yearField = By.xpath("//*[@id=\"year\"]");
	By genderDropdown = By.xpath("//*[@id=\"gender\"]");
	By ratherNotSayOption = By.xpath("//*[@id=\"gender\"]/option[4]");
	By nextButtonOnBasicInfoScreen = By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span");
	By createYourOwnGmailAddressRadioButton = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div/div[2]/div/div");
	By createYourOwnEmailAddressField = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input");
	By nextButtonOnGmailAddressScreen = By.xpath("//*[@id=\"next\"]/div/button/span");
	By passwordField = By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input");
	By confirmPasswordField = By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input");
	public By nextOnCreatePasswordScreen = By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span");
	public By phoneNumberOnRobotScreen = By.xpath("//*[@id=\"phoneNumberId\"]");

	
	
	public void clickOnCreateAccountButton() {
		System.out.println("Attempting to click on createAccountButton");
		driver.findElement(createAccountButton).click();
		System.out.println("createAccountButton clicked");
	}
	
	public void selectForMyPersonalUseOption() {
		System.out.println("Attempting to select forMyPersonalUseOption");
		driver.findElement(forMyPersonalUseOption).click();
		System.out.println("forMyPersonalUseOption selected");
	}
	public void selectForMyPersonalUseOptionNew() {
		System.out.println("Attempting to select forMyPersonalUseOption");
		Select dropdown = new Select(driver.findElement(createAccountButton));
		dropdown.selectByIndex(0);
		driver.findElement(createAccountButton).click();
		System.out.println("forMyPersonalUseOption selected");
	}
	public void clickOnFirstNameField() {
		System.out.println("Attempting to clickOnFirstNameField");
		driver.findElement(firstNameField).click();
		System.out.println("FirstName clicked");
	}
	public void enterFirstName(String text) {
		System.out.println("Attempting to enter firstNameField");
		driver.findElement(firstNameField).sendKeys(text);
		System.out.println("firstName entered");
	}
	public void clickOnNextButton() {
		System.out.println("Attempting to click on nextButton");
		driver.findElement(nextButton).click();
		System.out.println("nextButton clickedOn");
	}
	public void enterDay(String text) {
		System.out.println("Attempting to enter Day");
		driver.findElement(dayField).sendKeys(text);
		System.out.println("Day entered");
	}
	public void clickOnMonthDropdownButton() {
		System.out.println("Attempting to click on monthDropdownButton");
		driver.findElement(monthDropdownButton).click();
		System.out.println("monthDropdownButton clickedOn");
	}
	public void selectJanuaryOption() {
		System.out.println("Attempting to select JanuaryOption");
		driver.findElement(januaryOption).click();
		System.out.println("januaryOption selected");
	}
	public void enterYear(String text) {
		System.out.println("Attempting to enter Day");
		driver.findElement(yearField).sendKeys(text);
		System.out.println("Year entered");
	}
	public void clickOnGenderDropdownButton() {
		System.out.println("Attempting to click on genderDropdown");
		driver.findElement(genderDropdown).click();
		System.out.println("genderDropdown clickedOn");
	}
	public void selectRatherNotSayOption() {
		System.out.println("Attempting to select ratherNotSayOption");
		driver.findElement(ratherNotSayOption).click();
		System.out.println("ratherNotSayOption selected");
	}
	public void clickOnNextButtonOnBasicInfoScreen() {
		System.out.println("Attempting to click on nextButtonOnBasicInfoScreen");
		driver.findElement(nextButtonOnBasicInfoScreen).click();
		System.out.println("nextButtonOnBasicInfoScreen clickedOn");
	}
	public void selectCreateYourOwnGmailAddressRadioButton() {
		System.out.println("Attempting to select createYourOwnGmailAddressRadioButton");
		driver.findElement(createYourOwnGmailAddressRadioButton).click();
		System.out.println("createYourOwnGmailAddressRadioButton selected");
	}
	public void enterEmailAddress(String text) {
		System.out.println("Attempting to enter Email Address");
		driver.findElement(createYourOwnEmailAddressField).sendKeys(text);
		System.out.println("Email Address entered");
	}
	public void clickOnNextButtonOnGmailAddressScreen() {
		System.out.println("Attempting to click on nextButtonOnGmailAddressScreen");
		driver.findElement(nextButtonOnGmailAddressScreen).click();
		System.out.println("nextButtonOnGmailAddressScreen clickedOn");
	}
	public void enterPassword(String text) {
		System.out.println("Attempting to enter Password");
		driver.findElement(passwordField).sendKeys(text);
		System.out.println("Password entered");
	}
	public void clearPasswordField() {
		System.out.println("Attempting to clear Password");
		driver.findElement(passwordField).clear();
		System.out.println("Password cleared");
	}
	public void enterPasswordInConfirmPasswordField(String text) {
		System.out.println("Attempting to enter Password InConfirmPasswordField");
		driver.findElement(confirmPasswordField).sendKeys(text);
		System.out.println("Password confirmation entered");
	}
	public void clearConfirmPasswordField() {
		System.out.println("Attempting to clear ConfirmPasswordField");
		driver.findElement(confirmPasswordField).clear();
		System.out.println("ConfirmPasswordField cleared");
	}

	public void clickOnNextOnCreatePasswordScreen() {
		System.out.println("Attempting to click on nextOnCreatePasswordScreen");
		driver.findElement(nextOnCreatePasswordScreen).click();
		System.out.println("nextOnCreatePasswordScreen clickedOn");
	}
	public String getAppId() {
		System.out.println("Attempting to retrieve APP ID");
		String APPID = driver.findElement(nextOnCreatePasswordScreen).getText();
		System.out.println("App ID retrieved");
		return APPID;
	}


	}

