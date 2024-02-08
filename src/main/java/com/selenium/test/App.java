package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      System.out.println( "Hello World!" );
      
      System.setProperty("webdriver.chrome.driver", "/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    
      ChromeOptions chromeOptions = new ChromeOptions();
      
      WebDriver driver = new ChromeDriver(chromeOptions);
      
      System.out.println("Script Executing Successfully");
    
      //1. open the browser and get to the url
      driver.get("http://facebook.com");
      
      
      //enable wait of 3 seconds
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      //Maximize the browser window
      driver.manage().window().maximize();
      
      //locate email and Enter the email
      driver.findElement(By.id("email")).sendKeys("vanij.mendiratta@gmail.com");
      
      //Locate the password and Enter the password
      driver.findElement(By.id("pass")).sendKeys("Passw0rd-1");
      
      
      //Locate the login button and click on Login button
      driver.findElement(By.name("login")).click();
      
      //close the browser
      driver.quit();
      System.out.println("Script Executed Successfully");
      
    }
}
