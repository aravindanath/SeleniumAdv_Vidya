package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class adminapp extends BaseClass {
    @Test
    public void Xpath_6() throws InterruptedException {

        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List/");
        driver.findElement(By.className("button-1")).click();
        driver.findElement(By.id("SearchProductName")).sendKeys("Vidyanath");
        Select sel = new Select(driver.findElement(By.id("SearchCategoryId")));
        sel.selectByIndex(1);

        Select sele = new Select(driver.findElement(By.id("SearchManufacturerId")));
        sele.selectByIndex(1);

        Select selec = new Select(driver.findElement(By.id("SearchVendorId")));
        selec.selectByIndex(1);

        driver.findElement(By.id("search-products")).click();

    }
}
