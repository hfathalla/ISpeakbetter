package com.qa.ispeakbetter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ispeakbetter.base.BasePage;
import com.qa.ispeakbetter.util.ElementUtil;
import com.qa.ispeakbetter.util.JavaScriptUtil;

public class LoginPage  extends BasePage{
	
//	WebDriver driver;
//	ElementUtil elementUtil;
//	
//	    By signin =By.id("cmdSignin"); ;
//	
//		By email=   By.id("_email");
//		
//		By password = By.id("_password");
//		
//		By Login = By.linkText("Login");
//	
//		By loginErrorMesseg=By.id("crendentialsError");
//		
//		private By emailId;
//		public LoginPage(WebDriver driver){
//			this.driver =driver;
//			elementUtil =new ElementUtil(driver);
//	
//		}
//					
//				   
//		public void getSignIn()	{
//			elementUtil.doClick(signin);
//			elementUtil.doSendKeys(email," hfathalla543@gmail.com");
//			elementUtil.doSendKeys(password, "Selimsh123");
//			elementUtil.doClick(Login);
//			
//		}
//	public boolean cheackErrorMessage()	{
//		
//		return elementUtil.doIsDisplayed(loginErrorMesseg);
//	}
	WebDriver driver;
	ElementUtil elementUtil;
	JavaScriptUtil javaScriptUtil;
	
	By emailId = By.id("_email");
	By password = By.id("_password");
	By loginFunction = By.id("cmdSiginLink");
	By loginbutton = By.id("cmdSignin");
	By loginErrorText = By.id("crendentialsError");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		javaScriptUtil = new JavaScriptUtil(driver);
	}
	public void invalidCredentials() throws InterruptedException{
		elementUtil.waitForElementPresent(loginFunction);
		driver.findElement(loginFunction).click();
		Thread.sleep(2000);
		elementUtil.waitForElementPresent(emailId);
		driver.findElement(emailId).sendKeys("hendfathalla@yahoo.com");
		driver.findElement(password).sendKeys("test123");
		
		driver.findElement(loginbutton).click();
		Thread.sleep(3000);
	   System.out.println(elementUtil.doGetText(loginErrorText)); 
	}
	public void validCredentials() throws InterruptedException{
		elementUtil.waitForElementPresent(loginFunction);
		driver.findElement(loginFunction).click();
		Thread.sleep(2000);
		elementUtil.waitForElementPresent(emailId);
		driver.findElement(emailId).sendKeys("hfathalla543@gmail.com");
		driver.findElement(password).sendKeys("selimsh123");
		driver.findElement(loginbutton).click();
		
	}	
		
}
