package com.strength.checker.framework;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.github.bonigarcia.wdm.WebDriverManager;
import logger.Log;


public class Base {

	
	public WebDriver driver;
	Properties configFile ;
	protected static Properties lobConfigProp = new Properties();
	protected static Properties localeConfigProp = new Properties();
	protected FileInputStream configFis, lobConfigFis, localeConfigFis;	
	public Properties testDataFile;
	private final String CONFIG_FILE_PATH="//src//main//java//config//config.properties";
	protected File file = new File("");
	Properties configProp = new Properties();

	//  @Rule
	// public WireMockRule wireMockRule = new WireMockRule(8089);
	
	@BeforeClass
	public static void prepareWebDriver() {
	    WebDriverManager.chromedriver().setup();
	  }

	  @Before
	  public void setUp() {
	    createWebDriver();
	  }

	  @After
	  public void afterEachBaseSeleniumTest() {
	    if (driver != null) {
	      driver.quit();
	    }
	  }


	  private void createWebDriver() {
	    ChromeOptions options = new ChromeOptions();
	    //options.addArguments("--headless");
	    options.addArguments("--disable-gpu");
	    options.addArguments("--no-sandbox");
	    options.addArguments("--window-size=1920,1200");

	    driver = new ChromeDriver(options);
	  }
	  
	  public String propertiesFileLoad(String text) throws Exception{
		  
		  File propertiesFile = new File(file.getAbsoluteFile() + "//src//main//java//log4j.properties");
			PropertyConfigurator.configure(propertiesFile.toString());
			Log.info("--------------------------------------");  
		  
		  
		configFis = new FileInputStream(file.getAbsoluteFile()
					+ CONFIG_FILE_PATH);
		configProp.load(configFis);

		File f = new File(file.getAbsoluteFile() + "//src//main//java//config//" + "config.properties");


		if (f.exists() && !f.isDirectory()) {
			  lobConfigFis = new FileInputStream(file.getAbsoluteFile()
						+ "/src//main//java//config//" + "config.properties");
			  lobConfigProp.load(lobConfigFis);
		} 
		else {
				throw new Exception("Properties files loading failed ");
			}
		String  value = configProp.getProperty(text);
		return value;
	  }
	  
	  public void writePasswordStrengthResultToFile(String text) throws IOException{
		  
		  FileWriter testResult = new FileWriter(file.getAbsoluteFile() + "//src//main//java//config//" + "output.txt", true);
	  
		  testResult.write(text);
		  testResult.write("\n");
		  
		  testResult.close();
		  System.out.println("Password Strength Generated in Output File");
	  }


}







