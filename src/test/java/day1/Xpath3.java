package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Xpath3 extends BaseClass{

    @Test
    public void xpath3(){

    driver.get("https://www.amazon.in");

    driver.findElement(By.xpath("//a[starts-with(text(),'Today')]")).click();
        
    }
}
