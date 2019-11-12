package com.selenium.infrastructure;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
    public static WebDriver driver;

    @Before
    public static void initiate () {
        String browser=System.getProperty("browser");
        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Users/RASHMI/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","/Users/RASHMI/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    @After
    public static void close () {
        driver.quit();
    }
}
