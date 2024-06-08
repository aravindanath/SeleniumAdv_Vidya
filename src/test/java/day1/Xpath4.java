package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Xpath4 extends BaseClass{

    @Test
    public void xpath3(){

    driver.get("https://www.moneycontrol.com/commodity/");

   WebElement commodity =  driver.findElement(By.xpath("//table[@class='curDerivatives_web_commontable__NT0j9']/tbody/tr/td/h4[contains(text(),'SILVER')]//following::td[1]"));

   System.out.println(commodity.getText());


        /**
         *
         *  GOLD  71231
         *  Silver 234524
         *  CRUDE 2341234
         *  Natural 2345
         *  copper 2435
         *
         */

        
    }
}
