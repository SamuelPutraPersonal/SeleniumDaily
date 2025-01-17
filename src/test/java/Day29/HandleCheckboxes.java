package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        // 1. Select specific checkbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        // 2. Select all the checkboxes
       List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type =\"checkbox\"]"));

       // 2.1 Checking all checkboxes with normal loop
//       for (int i =0; i < checkboxes.size(); i++ ){
//           checkboxes.get(i).click();
//       }

       // 2.2 Checking all checkboxes with enhanced for loop
//        for (WebElement ch: checkboxes){
//            ch.click();
//        }


        // Use case
        // 1. I want to select last 3 checkboxes:
//        System.out.println(checkboxes.size());
//        for (int i=4 ; i < checkboxes.size() ; i++){
//            checkboxes.get(i).click();
//        }

        // 2. I want to select first 3 boxes
//        for (int i = 0; i <3 ; i++){
//            checkboxes.get(i).click();
//        }

        // 3. I want to select the specific checkboxes and unselect it

        for (int i = 0; i <3 ; i++){
            checkboxes.get(i).click();
        }

        Thread.sleep(5000);

        for (int i =0; i< checkboxes.size();i++){
            if (checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }
        }
    }
}
