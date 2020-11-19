package com.pregopower.provider.pages;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;

	public WebDriver intializeDriver() throws IOException{
		
		Properties pro =new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\com\\pregopower\\provider\\pages\\data.properties");
		pro.load(fis);
		
		String BrowserName = pro.getProperty("browser");
		
		if (BrowserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		
		else if  (BrowserName=="fireFox"){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
}
