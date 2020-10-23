package com.qa.ispeakbetter.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ispeakbetter.Pages.AboutPage;
import com.qa.ispeakbetter.Pages.ContactPage;
import com.qa.ispeakbetter.base.BasePage;

public class AboutPageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	AboutPage Aboutpage;
	
	@BeforeTest
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.int_properties();
		String browserName= prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		
Aboutpage	= new AboutPage(driver);
}
	 @Test
	  public void getAboutListTest() throws InterruptedException {
		  Aboutpage.coursesList();
	   
	  }
	  @Test
	  public void verifyMyVideoTest() throws InterruptedException {
		  Aboutpage.clickOnVideo();
	  
	  }
	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	  
}  
	  