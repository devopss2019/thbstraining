package com.thbs.devops.JenkinsSelenium;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import java.lang.System;

public class NewTest {
	WebDriver driver;
	 
	 
 @BeforeTest
 public  void launshSite() {
	 System.out.println("***** launch site ");
	 System.setProperty("webdriver.chrome.driver", "D:/CoE/BootcampTraining/Test/chromedriver_win32/chromedriver.exe");
	  driver = new org.openqa.selenium.chrome.ChromeDriver();
	 driver.get("http://www.google.co.in");
 }
   
  @Test
  public void enterText() {
	   System.out.println("***** enter text ");
	  WebElement e1 = driver.findElement(By.name("q"));
      e1.sendKeys("Selenium");
      e1.submit();
  }
      
  @Test
  public void waitFor() {
	  System.out.println("***** driver waiting to close for 10 sec ");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
     
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("***** driver is closed ");
	  driver.close();
  }

}
