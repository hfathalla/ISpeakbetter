package com.qa.ispeakbetter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ispeakbetter.util.ElementUtil;



public class HomePage {
//	WebDriver driver;
//	ElementUtil elementUtil;
//	By header=By.xpath("//h1[text()='Speak English Better Wherever You Are']");
//	By Chat = By.id("zsiq_unreadcnt");
//	By chatheader =By.xpath("//div[text()='Chat with us now!']") ;
//	//By signin = By.id("signin") ;
//	
//	//By email= By.id("_email");
//	//By password = By.id("_password");
//	//By login=By.id("cmdSignin");
//	
//	public HomePage(WebDriver driver){
//		this.driver =driver;
//		elementUtil =new ElementUtil(driver);
//}
//	public String getPageTitle(){
//		return elementUtil.doGetPageTitle();
//
//}
//	public String getHomePageHeader(){
//		return driver.findElement(header).getText();
//	}
//	
//	public String getchatBoxHeader() {
//		return driver.findElement(chatheader).getText();
//	}
//	public void getChat() {
//		
//		driver.switchTo().defaultContent();
//		System.out.println(driver.getTitle());
//		elementUtil.doClick(Chat);
//	}
//	
////public void getSignIn()	{
////	elementUtil.doClick(signin);
////	elementUtil.doSendKeys(email," hfathalla543@gmail.com");
////	elementUtil.doSendKeys(password, "selimsh123");
////	elementUtil.doClick(signin);
////}
	WebDriver driver;
	ElementUtil elementUtil;

	
	By chatBoxHeader = By.xpath("//*[@id='window-ribbon']/header/div");
    By frame = By.id("siqiframe");
	  By chatBox = By.xpath("//em[@id='zsiq_agtpic']");
	By header=By.xpath("//h1[text()='Speak English Better Wherever You Are']");
	
	By closeChat = By.xpath("//div[contains(@class,'win_close sqico-larrow')]");
	
	public HomePage(WebDriver driver){
		this.driver =driver;
		elementUtil =new ElementUtil(driver);
}
	public String getPageTitle(){
		return elementUtil.doGetPageTitle();
}
	public String getHomePageHeader(){
		return driver.findElement(header).getText();
	
	}
	public void openChatBox() throws InterruptedException {


		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		elementUtil.doClick(chatBox);
	
	}
	public void closeChatBox() {
		elementUtil.doClick(closeChat);
	}	
	
	
}