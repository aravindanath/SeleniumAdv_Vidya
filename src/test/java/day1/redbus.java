package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class redbus extends BaseClass{

    @Test
    public void Xpath_6() throws InterruptedException {

        driver.get("https://www.redbus.in/");
        driver.findElement(By.id("src")).sendKeys("Hyderabad", Keys.ENTER);
        driver.findElement(By.id("dest")).sendKeys("Vijayawada", Keys.ENTER);
        driver.findElement(By.id("search_button")).click();

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

//      Thread.sleep(4000);
        System.out.println("Executed");


    }
}
