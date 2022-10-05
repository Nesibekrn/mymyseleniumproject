package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_CssSelector {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void cssTest() {
        driver.get("http://a.testaddressbook.com/sign_in");
//        Find the username using css selector
       // driver.findElement(By.cssSelector("input[id='session_email']")).sendKeys("lololo");
       driver.findElement(By.cssSelector("input#session_email")).sendKeys("lololo");
    }
}
