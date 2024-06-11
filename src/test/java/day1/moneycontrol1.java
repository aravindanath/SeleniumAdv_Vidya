package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class moneycontrol1 extends BaseClass {

    @Test
    public void Xpath_7() throws InterruptedException {

        driver.get("https://www.moneycontrol.com");
        driver.findElement(By.xpath("//a[text()='Mutual Funds']")).click();


    }
}