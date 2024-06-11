package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class redbus extends BaseClass{

    @Test
    public void Xpath_6() {

        driver.get("https://www.redbus.in/");
        driver.findElement(By.id("src")).sendKeys("Hyderabad");
        driver.findElement(By.id("dest")).sendKeys("Vijayawada", Keys.ENTER);



    }
}
