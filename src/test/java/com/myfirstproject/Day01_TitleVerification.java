package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://techproeducation.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="Techpro Education | Online It Courses & Bootcamps";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Actual : "+actualTitle);
            System.out.println("Expected : "+expectedTitle);
        }
    }
}
