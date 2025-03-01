package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Implicit wait method
        // Implicit wait method needs to be declared one time and will apply for whole flow
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");

        System.out.println("Success");
        driver.close();
    }

}
