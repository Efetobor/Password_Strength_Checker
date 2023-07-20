package com.strength.checker;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GmailScreens;




public class GmailPasswordStrengthChecker extends Base{

	String gmailUrl = "gmailUrl";
	String googleUsername;
	String googlePassword;
	int n = 8;
	String day ="26";
	String year ="2021";
	String gmailPasswordStrength;
	String scenarioOne = "scenarioOne";
	String scenarioTwo = "scenarioTwo";
	String scenarioThree = "scenarioThree";
	String scenarioFour = "scenarioFour";
	String scenarioFive = "scenarioFive";
	String scenarioSix = "scenarioSix";
	String scenarioSeven = "scenarioSeven";
	String scenarioEight = "scenarioEight";
	String scenarioNine = "scenarioNine";


	
	 static String getAlphaNumericString(int n)
	 {
	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         + "0123456789"
	         + "abcdefghijklmnopqrstuvxyz";
	  StringBuilder sb = new StringBuilder(n);
	  for (int i = 0; i < n; i++) {
	   int index
	    = (int)(AlphaNumericString.length()
	      * Math.random());
	   sb.append(AlphaNumericString
	      .charAt(index));
	  }
	  return sb.toString();
	 }
	 
/*	@BeforeMethod
	public void instantiateHelpers(String invokeDriver) throws Exception{
		//propertiesFileLoad(gmailUrl);
		//propertiesFileLoad(scenarioOne);
		gmailUrl = lobConfigProp.getProperty("gmailUrl");
		scenarioOne = lobConfigProp.getProperty("scenarioOne");

		}*/
	
	
	@Test
	public void gmailPasswordStrengthChecker() throws Exception {
		propertiesFileLoad(gmailUrl);
		 gmailUrl = lobConfigProp.getProperty("gmailUrl");
		 driver.get(gmailUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		GmailScreens executor = new GmailScreens(driver);
		
		//Click on Create Account
		executor.clickOnCreateAccountButton();
		//Select my personal use
		executor.selectForMyPersonalUseOption();
		//Enter first name
		googleUsername = "Jerry" + GmailPasswordStrengthChecker.getAlphaNumericString(n);
		executor.enterFirstName(googleUsername);
		//Click on Next
		executor.clickOnNextButton();
		//Enter Day
		executor.enterDay(day);
		//Select Month
		executor.clickOnMonthDropdownButton();
		executor.selectJanuaryOption();
		//Enter Year
		executor.enterYear(year);
		//DropDown Gender
		executor.clickOnGenderDropdownButton();
		//Select Rather not say
		executor.selectRatherNotSayOption();
		//Click on Next
		executor.clickOnNextButtonOnBasicInfoScreen();
		//Select Create your own Gmail address
		executor.selectCreateYourOwnGmailAddressRadioButton();
		//Enter an email
		executor.enterEmailAddress(googleUsername);
		//Click on Next
		executor.clickOnNextButtonOnGmailAddressScreen();
		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		executor.enterPasswordInConfirmPasswordField(scenarioOne);
		executor.clickOnNextOnCreatePasswordScreen();

		GmailScreens gmailScreenElements = new GmailScreens(driver);
		if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
			System.out.println("GMAIL Password Strength = 19.9");
			gmailPasswordStrength = "Gmail Password Strength is: 19.9";
			writePasswordStrengthResultToFile(gmailPasswordStrength);
		}
		else if (gmailScreenElements.isElementPresent(gmailScreenElements.nextOnCreatePasswordScreen)) {
			System.out.println("Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField();
			executor.enterPassword(scenarioTwo);
			executor.clearConfirmPasswordField();
			executor.enterPasswordInConfirmPasswordField(scenarioTwo);
			executor.clickOnNextOnCreatePasswordScreen();
			if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
				System.out.println("GMAIL Password Strength = 26.6");
				gmailPasswordStrength = "Gmail Password Strength is: 26.6";
				writePasswordStrengthResultToFile(gmailPasswordStrength);
			}	
		
		else if (gmailScreenElements.isElementPresent(gmailScreenElements.nextOnCreatePasswordScreen)) {
			System.out.println("Website does not accept scenario 2");
			
			//Scenario 3: 
			scenarioThree = propertiesFileLoad(scenarioThree);
			executor.clearPasswordField();
			executor.enterPassword(scenarioThree);
			executor.clearConfirmPasswordField();
			executor.enterPasswordInConfirmPasswordField(scenarioThree);
			executor.clickOnNextOnCreatePasswordScreen();
			if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
				System.out.println("GMAIL Password Strength = 28.2");
				gmailPasswordStrength = "Gmail Password Strength is: 28.2";
				writePasswordStrengthResultToFile(gmailPasswordStrength);
			}	
		
		else if (gmailScreenElements.isElementPresent(gmailScreenElements.nextOnCreatePasswordScreen)) {
			System.out.println("Website does not accept scenario 3");
			
			//Scenario 4: 
			scenarioFour = propertiesFileLoad(scenarioFour);
			executor.clearPasswordField();
			executor.enterPassword(scenarioFour);
			executor.clearConfirmPasswordField();
			executor.enterPasswordInConfirmPasswordField(scenarioFour);
			executor.clickOnNextOnCreatePasswordScreen();
			if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
				System.out.println("GMAIL Password Strength = 37.6");
				gmailPasswordStrength = "Gmail Password Strength is: 37.6";
				writePasswordStrengthResultToFile(gmailPasswordStrength);
			}	
		
		else if (gmailScreenElements.isElementPresent(gmailScreenElements.nextOnCreatePasswordScreen)) {
			System.out.println("Website does not accept scenario 4");
			
			//Scenario 5: 
			scenarioFive = propertiesFileLoad(scenarioFive);
			executor.clearPasswordField();
			executor.enterPassword(scenarioFive);
			executor.clearConfirmPasswordField();
			executor.enterPasswordInConfirmPasswordField(scenarioFive);
			executor.clickOnNextOnCreatePasswordScreen();
			if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
				System.out.println("GMAIL Password Strength = 45.6");
				gmailPasswordStrength = "Gmail Password Strength is: 45.6";
				writePasswordStrengthResultToFile(gmailPasswordStrength);
			}	
		
		else if (gmailScreenElements.isElementPresent(gmailScreenElements.nextOnCreatePasswordScreen)) {
			System.out.println("Website does not accept scenario 5");
			
			//Scenario 6: 
			scenarioSix = propertiesFileLoad(scenarioSix);
			executor.clearPasswordField();
			executor.enterPassword(scenarioSix);
			executor.clearConfirmPasswordField();
			executor.enterPasswordInConfirmPasswordField(scenarioSix);
			executor.clickOnNextOnCreatePasswordScreen();
			if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
				System.out.println("GMAIL Password Strength = 47.6");
				gmailPasswordStrength = "Gmail Password Strength is: 47.6";
				writePasswordStrengthResultToFile(gmailPasswordStrength);
			}	
		
		else if (gmailScreenElements.isElementPresent(gmailScreenElements.nextOnCreatePasswordScreen)) {
			System.out.println("Website does not accept scenario 6");
			
			//Scenario 7: 
			scenarioSeven = propertiesFileLoad(scenarioSeven);
			executor.clearPasswordField();
			executor.enterPassword(scenarioSeven);
			executor.clearConfirmPasswordField();
			executor.enterPasswordInConfirmPasswordField(scenarioSeven);
			executor.clickOnNextOnCreatePasswordScreen();
			Thread.sleep(2000);
			if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
				System.out.println("GMAIL Password Strength = 49.1");
				gmailPasswordStrength = "Gmail Password Strength is: 49.1";
				writePasswordStrengthResultToFile(gmailPasswordStrength);
			}
			
		
		else if (gmailScreenElements.isElementPresent(gmailScreenElements.nextOnCreatePasswordScreen)) {
			System.out.println("Website does not accept scenario 7");
			
			//Scenario 8: 
			scenarioEight = propertiesFileLoad(scenarioEight);
			executor.clearPasswordField();
			executor.enterPassword(scenarioEight);
			executor.clearConfirmPasswordField();
			executor.enterPasswordInConfirmPasswordField(scenarioEight);
			executor.clickOnNextOnCreatePasswordScreen();
			if (gmailScreenElements.isElementPresent(gmailScreenElements.phoneNumberOnRobotScreen)) {
				System.out.println("GMAIL Password Strength = 52.7");
				gmailPasswordStrength = "Gmail Password Strength is: 52.7";
				writePasswordStrengthResultToFile(gmailPasswordStrength);
			}	
		 }	
		else {
			gmailPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine GMAIL Password Strength";
			
			writePasswordStrengthResultToFile(gmailPasswordStrength);
		}
		
		}
		
	 }
 }

}
			}
			}
		
		}
	}
