package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main (String[] args) throws InterruptedException {
        //System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver","/Users/RASHMI/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
