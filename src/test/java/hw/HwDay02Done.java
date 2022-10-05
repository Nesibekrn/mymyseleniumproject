package hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwDay02Done {
    /*
    Create a new class : Review1 
Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title. 
Verify if the page URL contains youtube if not, print the right url. 
Then Navigate to https://www.amazon.com/ 
Navigate back to youtube 
Refresh the page 
Navigate forward to amazon 
Maximize the window 
Then verify if page title includes “Amazon”, If not, print the correct title. 
Verify if the page URL is https://www.amazon.com/, if not print the correct url 
Quit the browser
     */
    @Test
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String aktualTitle=driver.getTitle();
        String expectedTitle="YouTube";
        if (aktualTitle.equals(expectedTitle)){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
            System.out.println("Aktual Title is : "+aktualTitle);
            System.out.println("Expected Title is : "+expectedTitle);
        }
        String url=driver.getCurrentUrl();
        if (url.contains("youtube")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("Current urla is: "+url);
        }
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        String aktualTitle2=driver.getTitle();
        if (aktualTitle2.contains("Amazon")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("Current Title is : "+aktualTitle2);
        }
        String url2=driver.getCurrentUrl();
        if (url2.equals( "https://www.amazon.com/")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("Current url is : "+url2);
        }
        driver.quit();
    }

}
