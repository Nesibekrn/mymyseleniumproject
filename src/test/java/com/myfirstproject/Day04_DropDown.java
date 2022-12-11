package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04_DropDown {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }
    @Test
    public void selectByIndexTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
       WebElement dropDownElement= driver.findElement(By.id("dropdown"));
        Select select= new Select(dropDownElement);
        select.selectByIndex(1);

    }
    @Test
    public void selectByValueTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownElement);
        select.selectByValue("Option 2");    }
}
//Go to https://the-internet.herokuapp.com/dropdown
//1.Create method selectByIndexTest and Select Option 1 using index
//2.Create method selectByValueTest Select Option 2 by value
//3.Create method selectByVisibleTextTest Select Option 1 value by visible text
//4.Create method printAllTest Print all dropdown value
//5.Verify the dropdown has Option 2 text
//6.Create method printFirstSelectedOptionTest Print first selected option
//7.Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
