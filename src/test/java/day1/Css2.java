package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Css2 extends BaseClass{

    @Test
    public void xpath3(){

    driver.get("https://www.amazon.in");

    driver.findElement(By.cssSelector(".nav-search-field>.nav-input.nav-progressive-attribute")).sendKeys("Iphone 14 128 gb", Keys.ENTER);




    }
}
