package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts_NormalAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Normal alert okay button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);


        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();

    }
}
