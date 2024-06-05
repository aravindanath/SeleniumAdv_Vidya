package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Date;

public class Xpath2 extends BaseClass{

    @Test
    public void xpath1(){
        String fn = Utils.firstName(), ln =Utils.lastName(),pw = Utils.randomPassword();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

        driver.findElement(By.xpath("//input[@name='firstname' or @id='u_c_b_IN']")).sendKeys(fn);

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ln);

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Utils.mobileNumber());

        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pw);
        System.out.println("Password:"+pw);

       WebElement day =  driver.findElement(By.id("day"));
        WebElement month =   driver.findElement(By.id("month"));
        WebElement year =  driver.findElement(By.id("year"));


        Utils.selectByText(day,"30");

        Utils.selectByValue(month,"9");

        Utils.selectByIndex(year,10);


    }

}
