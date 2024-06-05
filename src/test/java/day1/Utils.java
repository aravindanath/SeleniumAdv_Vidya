package day1;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

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
}
