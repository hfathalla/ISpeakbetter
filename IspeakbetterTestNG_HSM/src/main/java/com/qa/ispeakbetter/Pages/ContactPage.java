package com.qa.ispeakbetter.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ispeakbetter.util.ElementUtil;
import com.qa.ispeakbetter.util.JavaScriptUtil;

public class ContactPage {
	WebDriver driver;
	ElementUtil elementUtil;
	JavaScriptUtil javaScriptUtil;
	 List<WebElement> listElements;
	
	public ContactPage(WebDriver driver) {   
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		javaScriptUtil = new JavaScriptUtil(driver);
		
	}	
          By contactFunction	= By.xpath("//span[contains(text(),'Contact')]");
	      By header = By.xpath("//span[contains(text(),'Contact us')]");
	      By yourName = By.name("name");
	      By yourEmail = By.name("email");
	      By mySubject = By.name("subject");
	      By yourMessage = By.name("message");
	      By contactButton = By.className("btn btn-animated btn-contact ripple-alone");


public void getContactPage() throws InterruptedException {
	
	elementUtil.doClick(contactFunction);
	Thread.sleep(3000);
	System.out.println("Header Contact page is .." + elementUtil.doGetText(header));
	System.out.println("Title Contact Page is...."+ elementUtil.doGetPageTitle());
	
}
public void ContactwithUs() throws InterruptedException {
	elementUtil.doSendKeys(yourName, "Hend");
	Thread.sleep(3000);
	elementUtil.doSendKeys(yourEmail, "Hendfathalla543@gmail.com");
	Thread.sleep(3000);
	elementUtil.doClick(mySubject);
	Thread.sleep(3000);
	elementUtil.doSendKeys(yourMessage, "I have problems with my locators");
	Thread.sleep(3000);
	elementUtil.doClick(contactButton);
	
}
}
