package com.qa.ispeakbetter.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ispeakbetter.Pages.ContactPage;

import com.qa.ispeakbetter.base.BasePage;

public class ContantPageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	ContactPage contactPage;
	
	@BeforeTest
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.int_properties();
		String browserName= prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		
	contactPage = new ContactPage(driver);
	 
	  }
	@Test
	public void verifyContactPageTest() throws InterruptedException {
		contactPage.getContactPage();
	}
	@Test
	public void verifyContactwithUsTest() throws InterruptedException {
		contactPage.ContactwithUs();
	}


@AfterTest
public void tearDown() {
  driver.quit();
}
	
}
