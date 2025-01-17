package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String title= driver.getTitle();
        System.out.println(title);

        // getCurrentUrl
        System.out.println(driver.getCurrentUrl());

        // get Page source - returns source code of the page
        System.out.println(driver.getPageSource());

        // get window handles id
        System.out.println(driver.getWindowHandle());

        // get multiple windows handles id
        Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowids = driver.getWindowHandles();
        System.out.println(windowids);




        driver.close();


    }
}
