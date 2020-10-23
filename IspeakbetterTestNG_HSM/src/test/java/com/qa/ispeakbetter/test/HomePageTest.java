package com.qa.ispeakbetter.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.qa.ispeakbetter.Pages.HomePage;
import com.qa.ispeakbetter.base.BasePage;



public class HomePageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;

	@BeforeTest
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.int_properties();
		String browserName= prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		homePage=new HomePage(driver);
		
	}
	@Test(priority = 1)
	public void verifyPageTitleTest1() throws InterruptedException{
	Thread.sleep(5000);
	String title = homePage.getPageTitle();
	System.out.println("home page title is "+ title);
	Assert.assertEquals(title, "Learn English with Online Teachers - Get your Free Live English Class Now.");

}
//@Test(priority=2)
//public void VerifySignInPageTest() {
//	homePage.getSignIn();
	@Test(priority =2)
	public void verifyHomPageHeaderTest(){
		String header=homePage.getHomePageHeader();
		System.out.println("home page header is :"+header);
		Assert.assertEquals(header, "Speak English Better Wherever You Are" );	
	}
	@Test(priority = 3)
	public void ChatBoxOpenTest() throws InterruptedException{
		homePage.openChatBox();
	}
	@Test(priority=4)
	public void chatBoxCloseTest() {
		homePage.closeChatBox();
	}
		@AfterTest
		public void tearDown(){
			driver.quit();	
	}
	}	

	
	
	
	
	
	
	
	
