package hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HwCheckBox {
    /*
    Create a class : CheckBox
Create test method and complete the following task.
Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes
Then click on checkbox1 if box is not selected
Then click on checkbox2 if box is not selected
Homework: Then verify that checkbox1 is checked.
     */
WebDriver driver;
@Before
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();
}
@After
    public void tearDown(){
  //  driver.quit();
}

@Test
    public void checkBoxTests(){
    driver.get("https://the-internet.herokuapp.com/checkboxes");

}



}
