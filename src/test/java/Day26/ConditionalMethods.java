package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        // isDisplayed()
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Display status of logo: " + logo.isDisplayed());


        // isEnabled()
        boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Status for first name bar: " + status);

        // ===isSelected scenario===

        WebElement male = driver.findElement(By.id("gender-male"));
        WebElement female = driver.findElement(By.id("gender-female"));

        // Before selection
        System.out.println("Status of male radio button:" + male.isSelected());
        System.out.println("Status of female radio button:" + female.isSelected());

        // After selection
        male.click();
        System.out.println("Status of male radio button:" + male.isSelected());
        System.out.println("Status of female radio button:" + female.isSelected());


        driver.close();
    }
}
