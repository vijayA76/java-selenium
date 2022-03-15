package com.java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "exefile//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());        
    }
}
