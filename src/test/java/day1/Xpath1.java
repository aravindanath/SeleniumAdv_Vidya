package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Xpath1 extends BaseClass{

    @Test
    public void xpath1(){
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation Jobs 3Ys exp", Keys.ENTER);

    }

}
