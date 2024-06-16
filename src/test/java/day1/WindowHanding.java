package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WindowHanding extends BaseClass{

    @Test
    public void Xpath_6()  {

        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone ", Keys.ENTER);

        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        String parentWin = driver.getWindowHandle();

        elements.get(1).click();


       Set<String> wins =  driver.getWindowHandles();

       for(String win : wins) {
           driver.switchTo().window(win);
       }

      String txt =  driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']/span[2]/span[2]")).getText();

       System.out.println(txt);
       driver.close();

       driver.switchTo().window(parentWin);
       System.out.println(driver.getTitle());

    }
}
