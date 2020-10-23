package com.qa.ispeakbetter.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ispeakbetter.Pages.HomePage;
import com.qa.ispeakbetter.Pages.LoginPage;
import com.qa.ispeakbetter.base.BasePage;

public class LoginPageTest {

	
	
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;
    LoginPage loginPage;
	@BeforeTest
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.int_properties();
		String browserName= prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		homePage=new HomePage(driver);
		loginPage =new LoginPage(driver);
		
	}
	@Test(priority = 1)
	public void verifyPageTitleTest() throws InterruptedException{
	Thread.sleep(5000);
	String title = homePage.getPageTitle();
	System.out.println("home page title is "+ title);
	Assert.assertEquals(title, "Learn English with Online Teachers - Get your Free Live English Class Now.");

}
//	@Test(priority=2)
//	public void VerifySignInPageTest() {
//		loginPage.getSignIn();
//	
//	
//	
//	}
//	@Test(priority=3)
//	public void verifyErrorMessageTest(){
//		loginPage.cheackErrorMessage();
//	}
	@Test(priority=1,enabled=true)
	public void verifyValidCredentials() throws InterruptedException{
		loginPage.validCredentials();
		
		
	}
	@Test(priority=2,enabled=false)
	public void verifyInvalidCredentials() throws InterruptedException{
	loginPage.invalidCredentials();
	
	
	}
	
		@AfterTest
		public void tearDown(){
			driver.quit();	
	}		
}
