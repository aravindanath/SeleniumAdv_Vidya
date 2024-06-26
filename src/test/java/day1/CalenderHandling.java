package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CalenderHandling extends BaseClass{

    @Test
    public void Xpath_6() throws InterruptedException {

        driver.get("https://www.godigit.com/");

        driver.findElement(By.xpath("//ul[@class='quote-form-switcher quote-form-switcher--margin-bottom hidden-xs hidden-sm']/li[@class='travel-opt-list']/a")).click();

       driver.findElement(By.cssSelector("#departure-date")).click();
       Thread.sleep(2000);

       List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='pika-table'])[1]/tbody/tr/td[@class='' or @class='is-today' and @aria-selected='false']"));

       for(WebElement date : dates){
           if(date.getText().equalsIgnoreCase("28")){
               date.click();
               break;
           }
       }
    }
}
