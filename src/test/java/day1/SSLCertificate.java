package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SSLCertificate extends BaseClass{

    @Test
    public void Xpath_6() throws InterruptedException {

        driver.get("https://expired.badssl.com/");


    }
}
