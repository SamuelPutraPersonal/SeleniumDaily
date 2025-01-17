package Day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {

    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        // get method accepts URL only in the string format
        //driver.get("https://demo.nopcommerce.com");


        // navigate method URL can accept URL in String and URL object format
        //URL myurl = new URL("https://demo.nopcommerce.com");
        //driver.navigate().to("https://demo.nopcommerce.com");
        //driver.navigate().to(myurl);


        driver.navigate().to("https://demo.nopcommerce.com");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

    }
}