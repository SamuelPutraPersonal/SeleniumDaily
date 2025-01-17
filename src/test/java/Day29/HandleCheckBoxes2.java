package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckBoxes2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Call methods for each use case
        selectAllCheckboxes(driver);
        selectLastThreeCheckboxes(driver);
        selectFirstThreeCheckboxes(driver);
        selectSpecificCheckboxesAndUnselect(driver);

        driver.quit(); // Close the browser after execution
    }

    // 1. Method to select all checkboxes
    public static void selectAllCheckboxes(WebDriver driver) {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type =\"checkbox\"]"));

        // Using enhanced for loop to check all checkboxes
        for (WebElement ch : checkboxes) {
            ch.click();
        }
    }

    // 2. Method to select last 3 checkboxes
    public static void selectLastThreeCheckboxes(WebDriver driver) throws InterruptedException {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type =\"checkbox\"]"));

        // Selecting last 3 checkboxes
        for (int i = checkboxes.size() - 3; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }

        Thread.sleep(5000); // Wait for 5 seconds before executing the next action
    }

    // 3. Method to select first 3 checkboxes
    public static void selectFirstThreeCheckboxes(WebDriver driver) {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type =\"checkbox\"]"));

        // Selecting first 3 checkboxes
        for (int i = 0; i < 3; i++) {
            checkboxes.get(i).click();
        }
    }

    // 4. Method to select specific checkboxes and unselect them
    public static void selectSpecificCheckboxesAndUnselect(WebDriver driver) {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type =\"checkbox\"]"));

        // Selecting first 3 checkboxes
        for (int i = 0; i < 3; i++) {
            checkboxes.get(i).click();
        }

        // Unselecting selected checkboxes
        for (int i = 0; i < checkboxes.size(); i++) {
            if (checkboxes.get(i).isSelected()) {
                checkboxes.get(i).click();
            }
        }
    }
}
