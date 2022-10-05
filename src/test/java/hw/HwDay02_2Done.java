package hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HwDay02_2Done {
   /*  user goes to http://a.testaddressbook.com/sign_in
    Locate the elements of email textbox, password textbox, and signin button
    Enter below username and password then click sign in button 
    Username :  testtechproed@gmail.com 
    Password : Test1234! 
    Then verify that the expected user id  testtechproed@gmail.com
    (USE getText() method to get the text from the page)
    Verify the Addresses and Sign Out  texts are displayed
    Find the number of total link on the page
    print all link names
    Sign out from the page*/

    @Test
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        driver.findElement(By.name("commit")).click();
        String userName=driver.findElement(By.className("navbar-text")).getText();
        Assert.assertEquals("testtechproed@gmail.com",userName);
        WebElement address=driver.findElement(By.linkText("Addresses"));
        Assert.assertTrue(address.isDisplayed());
        WebElement signout=driver.findElement(By.linkText("Sign out"));
        Assert.assertTrue(signout.isDisplayed());
        List<WebElement> totalLink=driver.findElements(By.tagName("a"));
        int total=totalLink.size();
        System.out.println(total);
        Assert.assertEquals(total,3);
        for (WebElement each:totalLink){
            System.out.println(each.getText());
        }

        driver.findElement(By.xpath("//a[@data-test='sign-out']")).click();
        WebElement signin=driver.findElement(By.linkText("Sign in"));
        Assert.assertTrue(signin.isDisplayed());


    }
}
