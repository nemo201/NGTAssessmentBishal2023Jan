package com.demo;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.objects.PageObjects;

public class NewTest {
	static WebDriver driver;
  @Test
  public void s4() throws Exception {
	  
	  Properties propObj = new Properties();
      String rootFolder = System.getProperty("user.dir");
      propObj.load(new FileInputStream(rootFolder+ "//src//test//resources//app.properties"));
      System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get(propObj.getProperty("loginUrl"));
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@id=\"mobileNumberPass\"]")).sendKeys(propObj.getProperty("email"));
      driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(propObj.getProperty("password"));
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[.=\"LOGIN\"]")).click();
      Thread.sleep(31000);
      driver.findElement(By.xpath("//button[.=\"LOGIN\"]")).click();
      
      String Expected = "Hey, it feels so light!";
      driver.get(propObj.getProperty("cart"));
      String Actual = driver.findElement(By.className("emptyCart-base-emptyText")).getText();
      
      Assert.assertEquals(Expected, Actual);
      
      driver.get(propObj.getProperty("itemWatch"));
      driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
      
      String expectedCart = "Premium Men Coffee Brown Analogue Watch DK11599-4";
      driver.get(propObj.getProperty("cart"));
      String actualCart = driver.findElement(By.className("itemContainer-base-itemLink")).getText();
      
      Assert.assertEquals(expectedCart, actualCart);
      
	  driver.quit();
  }
  
//  @Test
//  public void s5() throws Exception{
//	  
//	  Properties propObj = new Properties();
//      String rootFolder = System.getProperty("user.dir");
//      propObj.load(new FileInputStream(rootFolder+ "//src//test//resources//app.properties"));
//      System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
//	  driver = new ChromeDriver();
//      driver.get(propObj.getProperty("loginUrl"));
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//input[@id=\"mobileNumberPass\"]")).sendKeys(propObj.getProperty("email"));
//      driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(propObj.getProperty("password"));
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//button[.=\"LOGIN\"]")).click();
//      Thread.sleep(31000);
//      driver.findElement(By.xpath("//button[.=\"LOGIN\"]")).click();
//      
//      
//      
//      
//	   accountPage.getProfile().click();
//	   accountPage.getSubMenu().click();
//	   String actualName = accountPage.getAccountName().getText();
//	   Assert.assertEquals(actualName , "Shibashis Banerjee" , "Wrong Name");
//  }
}
