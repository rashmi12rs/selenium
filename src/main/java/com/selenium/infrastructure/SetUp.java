package com.selenium.infrastructure;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
    public static WebDriver driver;
    public static void main (String[] args) throws InterruptedException {
        System.out.println("Hello");
        Thread.sleep(5000);

    }

    @Before
    public static void initiate () {
        System.setProperty("webdriver.chrome.driver","/Users/RASHMI/Downloads/chromedriver_win32/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
    }

    @After
    public static void close () {
        driver.quit();
    }
}
