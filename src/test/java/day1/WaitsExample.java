package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsExample extends BaseClass{

    @Test
    public void xpath3(){

      driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

      driver.findElement(By.xpath("//button[text()='Start']")).click();

      WebElement element = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
      Utils.waitForElementToLoad(driver, element);

      Assert.assertEquals(element.getText(), "Hello World!");
      System.out.println(element.getText());
        
    }
}
