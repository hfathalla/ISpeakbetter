package com.qa.ispeakbetter.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ispeakbetter.Pages.AboutPage;
import com.qa.ispeakbetter.Pages.BlogPage;
import com.qa.ispeakbetter.base.BasePage;

public class BlogPageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	BlogPage Blogpage;
	
	@BeforeTest
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.int_properties();
		String browserName= prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		
Blogpage	= new BlogPage(driver);
}
	 @Test
	  public void getBlogListTest() throws InterruptedException {
		  Blogpage.coursesList();
	   
	  }
	  @Test
	  public void verifyMyBlogTest() throws InterruptedException {
		  Blogpage.clickOnMyBlog();
	  
	  }
	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	  
}	  