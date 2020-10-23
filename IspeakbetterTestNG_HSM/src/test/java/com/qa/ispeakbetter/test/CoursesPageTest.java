package com.qa.ispeakbetter.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ispeakbetter.Pages.CoursesPage;
import com.qa.ispeakbetter.Pages.HomePage;
import com.qa.ispeakbetter.Pages.LoginPage;
import com.qa.ispeakbetter.base.BasePage;

public class CoursesPageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;
    LoginPage loginPage;
    CoursesPage CoursesPage;
    
    @BeforeTest
	public void setUp(){
    	basePage = new BasePage();
		prop = basePage.int_properties();
		String browserName= prop.getProperty("browser");
		driver = basePage.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		homePage=new HomePage(driver);

		CoursesPage = new CoursesPage(driver);  
	 
}

@Test
public void getCoursesListTest() throws InterruptedException {
	  CoursesPage.coursesList();
 
}
@Test
public void verifyMyCourseTest() throws InterruptedException {
	  CoursesPage.clickOnMyCourse();

}
@AfterTest
public void tearDown() {
  driver.quit();
}
		
		
}		