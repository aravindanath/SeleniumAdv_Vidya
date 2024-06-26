package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class BrokenLinks extends BaseClass{

    @Test
    public void Xpath_6() throws InterruptedException {

        driver.get("https://www.redbus.in/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            Utils.verifyURL(link.getAttribute("href"));
        }



    }
}
