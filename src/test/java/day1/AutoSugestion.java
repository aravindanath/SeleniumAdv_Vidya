package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSugestion extends BaseClass{

    @Test
    public void Xpath_6() throws InterruptedException {

        driver.get("https://www.redbus.in/");

        driver.findElement(By.id("src")).sendKeys("bang");
        Thread.sleep(3000);

        List<WebElement> src =  driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li/div/text[1]"));

        for(WebElement srcElement : src){
            System.out.println(srcElement.getText());
            if(srcElement.getText().equalsIgnoreCase("KR Puram")){
                srcElement.click();
                break;
            }
        }

        driver.findElement(By.id("dest")).sendKeys("hyd");

        List<WebElement> dest =  driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li/div/text[1]"));


        for(WebElement srcElement : dest){
            System.out.println(srcElement.getText());
            if(srcElement.getText().equalsIgnoreCase("Jubilee Bus Station JBS")){
                srcElement.click();
                break;
            }
        }


    }
}
