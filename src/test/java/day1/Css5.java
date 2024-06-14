package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Css5 extends BaseClass{

        @Test
        public void xpath3(){
            driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List/");
            driver.findElement(By.cssSelector(".button-1")).click();
            driver.findElement(By.cssSelector("#SearchProductName")).sendKeys("vidyanath");
            driver.findElement(By.xpath("//p[text()=' Dashboard']")).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
            driver.findElement(By.xpath("//a[text()='View All Orders']")).click();
//            driver.findElement(By.id("StartDate")).click();
            js.executeScript("window.scrollBy(0,500)");
            driver.findElement(By.xpath("//table[@id='orders-grid']/tbody/tr[1]/td[1]")).click();
//            System.out.println(str1);


        }
    }


