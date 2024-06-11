package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class fb_signup extends BaseClass {

    @Test
    public void Xpath_6() throws InterruptedException {

        driver.get("https://www.facebook.com/signup/");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vidya@gmail.com");
        driver.findElement(By.xpath("//input[@name='firstname']/following::input")).sendKeys("vidya");

    }
}
