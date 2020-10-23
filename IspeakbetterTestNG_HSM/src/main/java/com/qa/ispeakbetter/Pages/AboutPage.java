package com.qa.ispeakbetter.Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ispeakbetter.base.BasePage;
import com.qa.ispeakbetter.util.ElementUtil;
import com.qa.ispeakbetter.util.JavaScriptUtil;
public class AboutPage extends BasePage {

	WebDriver driver;
	ElementUtil elementUtil;
	JavaScriptUtil javaScriptUtil;
	 List<WebElement> listElements;
	 
	 public AboutPage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
			javaScriptUtil = new JavaScriptUtil(driver);
			
		}
	 By headerAbout = By.xpath("//span[contains(text(),'About us')]");
	 
	   // By myvideo = By.xpath("//a[contains(text(),'ISpeakBetter Interactive Learning system.')]");
	    By myvideo = By.linkText("ISpeakBetter Interactive Learning system.");
	    
	    By aboutFunction = By.cssSelector("li:nth-child(3) > .ripple-group > span");
	   
	  //a[contains(text(),'ISpeakBetter Interactive Learning system.')]
	  
	    public void coursesList() throws InterruptedException{
	    	
	    	 elementUtil.doClick(aboutFunction);
	    	 Thread.sleep(3000);
	    	 System.out.println("Title About Page is...." + elementUtil.doGetPageTitle());
	    	 System.out.println("Header About Page is...."+ elementUtil.doGetText(headerAbout));  
	    
	    }
	    
	    
	    public void clickOnVideo() throws InterruptedException {
	    	elementUtil.doClick(myvideo);
	    }    
	    
}    
	    
