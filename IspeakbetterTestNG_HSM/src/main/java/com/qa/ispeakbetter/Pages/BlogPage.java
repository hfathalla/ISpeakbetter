package com.qa.ispeakbetter.Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ispeakbetter.base.BasePage;
import com.qa.ispeakbetter.util.ElementUtil;
import com.qa.ispeakbetter.util.JavaScriptUtil;
public class BlogPage  extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	JavaScriptUtil javaScriptUtil;
	 List<WebElement> listElements;	
	 
	 public BlogPage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
			javaScriptUtil = new JavaScriptUtil(driver); 
}	              

	 By blogFunction = By.xpath("//span[contains(text(),'Blog')]");
	 By headerBlog = By.xpath("//h2[contains(text(),'Welcome to Our Blog')]");
	 
    By myblog = By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");	 

public void coursesList() throws InterruptedException{
	driver.findElement(blogFunction).click();
	 Thread.sleep(3000);
	
 	System.out.println("Header Blog Page is .." + elementUtil.doGetText(headerBlog)); 
	 

    listElements = driver.findElements(By.tagName("a"));

       System.out.println(listElements.size());
       
       for (int i =0 ; i < listElements.size() ; i++) {
	        String text = listElements.get(i).getText();
	              System.out.println(text); 
       
       }
}   

public void clickOnMyBlog() throws InterruptedException {
	elementUtil.doClick(myblog);
	
	Thread.sleep(3000);
	System.out.println("Title my blog  is..." + elementUtil.doGetPageTitle());
	
}	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
