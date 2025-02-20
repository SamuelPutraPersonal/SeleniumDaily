package Day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryEle);

        // select option from dropdown
        // 1. With visible text
        drpCountry.selectByVisibleText("France");

        // 2. With value attribute
        //drpCountry.selectByValue("japan");

        // 3. with index
        //drpCountry.selectByIndex(2);


        // Capture the options from dropdown
        List<WebElement> options= drpCountry.getOptions();
        System.out.println("Number of options: " + options.size());

        // printing options with normal loop
        for ( int i =0 ; i < options.size(); i++){
            System.out.println(options.get(i).getText());
        }

        // printing options with enhanced loop
        for ( WebElement opt : options){
            System.out.println(opt.getText());
        }


        driver.close();






    }
}
