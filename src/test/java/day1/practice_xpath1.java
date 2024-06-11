package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class practice_xpath1 extends BaseClass {

    @Test
    public void practice_xpath1(){

        driver.get("https://the-internet.herokuapp.com/tables");
        for(int j=1;j<5;j++) {
            for (int i = 2; i < 5; i++) {
                String str1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+j+"]/td[" + i + "]/following-sibling::td")).getText();
                System.out.println(str1);
            }
        }

    }
}
