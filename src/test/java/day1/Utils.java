package day1;

import com.github.javafaker.Faker;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.NoSuchElementException;

public class Utils {
   static Faker faker = new Faker(new Locale("en-IND"));


    public static String firstName(){
      //  Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().firstName();
    }


    public static String fullname(){
     //   Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().fullName();
    }

    public static String emailid(){
      //  Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().firstName()+"@testmail.com";
    }

    public static String lastName(){
   //     Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().lastName();
    }



    public static String mobileNumber(){
    //    Faker faker = new Faker(new Locale("en-IND"));
        return faker.number().digits(10);
    }


    public static String dob(){
    //    Faker faker = new Faker(new Locale("en-IND"));
        return faker.date().birthday(18,99).toString();
    }

    public static String randomPassword(){
      return   faker.lorem().characters(8,16,true,true)+"@!";
    }

    public static void selectByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void selectByValue(WebElement element, String text){
        Select select = new Select(element);
        select.selectByValue(text);
    }

    public static void selectByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void waitForElementToLoad(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void fluentWait(WebDriver driver){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(120));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static String getCurrentDateTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatter.format(date).toString().replace("/","_").replace(" ","_").replace(":","_");    }

    public static void takeSnapShot(WebDriver driver, String filename){

        try {
            TakesScreenshot srcScreenshot = (TakesScreenshot) driver;
            File srcFile = srcScreenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./"+filename+getCurrentDateTime()+".jpg");
            Files.copy(srcFile.toPath(), destFile.toPath());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void verifyURL(String url){
        System.err.println(url);
        try{
            URL link = new URL(url);

            HttpURLConnection httpURLConnection = (HttpURLConnection)link.openConnection();
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200){
                System.out.println(url +" --> " + httpURLConnection.getResponseMessage());
            }else{
                System.out.println(url +" --> " + httpURLConnection.getResponseMessage() +" --> Broken links ");

            }


        }catch (Exception e){
            System.out.println(url +" --> Broken links ");

        }



    }
}

