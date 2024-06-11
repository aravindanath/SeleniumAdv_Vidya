package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Xpath5 extends BaseClass {

    @Test
    public void practice_xpath1() {

        driver.get("https://the-internet.herokuapp.com/tables");

        ArrayList<String> arr = new ArrayList<>();

        for(int j=1;j<5;j++) {
            for (int i = 2; i < 5; i++) {
                String str1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + j + "]/td[" + i + "]/following-sibling::td")).getText();
                arr.add(str1);

            }
        }

        for(String str : arr) {
            System.out.println(str);
        }
    }
}