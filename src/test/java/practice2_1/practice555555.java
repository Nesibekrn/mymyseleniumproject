package practice2_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice555555 extends TestBase {
    @Test
    public void emojiTest(){
    // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
// click on the "Animals and Nature" emoji
// click all the "Animals and Nature"  emoji elements
// fill the form
// press the apply button
driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
driver.switchTo().frame("emoojis");
driver.findElement(By.xpath("(//span[@data-upgraded=',MaterialRipple'])[2]")).click();
List<WebElement> animals=driver.findElements(By.xpath("//*[@id=\"nature\"]/div/img"));
animals.stream().forEach(t->t.click());
//for (int i=0; i<animals.size(); i++){
//    animals.get(i).click();
    driver.switchTo().defaultContent();
    List<WebElement>form=driver.findElements(By.xpath("//input"));
    List<String> value=new ArrayList<>(Arrays.asList("This","examples","are","so","easy","ı am","trying","give","to universal","positive","messages"));
        for (int i = 0; i < form.size() ; i++) {
            form.get(i).sendKeys(value.get(i));
        }
driver.findElement(By.id("send")).click();
    }
}
