package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts_ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(3000);

        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();
        myalert.dismiss();





        Thread.sleep(3000);
        driver.close();


    }

}
