package com.thbs.devops.JenkinsSelenium;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:/CoE/BootcampTraining/Test/chromedriver_win32/chromedriver.exe");
      org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
      driver.get("http://www.google.co.in");
      System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
      driver.close();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
