package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_URLVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://techproeducation.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Actual : "+actualUrl);
            System.out.println("Expected : "+expectedUrl);
        }
        driver.quit();
    }
}
