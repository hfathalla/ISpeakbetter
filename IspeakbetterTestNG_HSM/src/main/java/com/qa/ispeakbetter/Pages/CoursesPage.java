package com.qa.ispeakbetter.Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ispeakbetter.base.BasePage;
import com.qa.ispeakbetter.util.ElementUtil;
import com.qa.ispeakbetter.util.JavaScriptUtil;

public class CoursesPage extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	JavaScriptUtil javaScriptUtil;
	 List<WebElement> listElements;
	
	public CoursesPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		javaScriptUtil = new JavaScriptUtil(driver);
		
	}
	
	By coursesFunction = By.xpath("//span[contains(text(),'Courses')]");
    By mycourse = By.xpath("//*[@id=\"course-section\"]/div/div[2]/div/div[3]/div/div[2]/div[2]/h4/a");
    By headerCourses = By.tagName("h1");
  
    
    public void coursesList() throws InterruptedException{
    	driver.findElement(coursesFunction).click();
    	 Thread.sleep(3000);
    	System.out.println("Header Courses is .." + elementUtil.doGetText(headerCourses));
   
    listElements = driver.findElements(By.tagName("h4"));
  // listElements = driver.findElements(By.tagName("div"));
 // listElements =driver.findElements(By.xpath("// h4[@class='text-center']"));
   
	System.out.println(listElements.size());
	for (int i =0 ; i < listElements.size() ; i++) {
		String text = listElements.get(i).getText();
		System.out.println(text);
	
		}
}
  
public void clickOnMyCourse() throws InterruptedException {
	elementUtil.doClick(mycourse);
	Thread.sleep(3000);
	System.out.println("Title my course is..." + elementUtil.doGetPageTitle());
	
	
	
}	

}