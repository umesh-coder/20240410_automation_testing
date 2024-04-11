package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RedbusTesting {
    public static void main(String[] args) throws InterruptedException {

        // Creating a WebDriver instance for Firefox
        WebDriver driver = new FirefoxDriver();

        // Navigating to the Redbus website
        driver.get("https://www.redbus.in/");

        // Creating an Actions object for performing mouse actions
        Actions actions = new Actions(driver);

        // Locating the "Help" element on the webpage
        WebElement help = driver.findElement(By.xpath("//span[.='Help']"));

        // Locating the account related element on the webpage
        WebElement account = driver.findElement(By.xpath("//DIV[@class='rb_main_secondary_item  link']/self::DIV"));

        // Performing a click action on the "Help" element
        actions.click(help).perform();

        // Adding a delay to wait for the page to load (not recommended, used here for simplicity)
        Thread.sleep(2000);

        // Performing a click action on the account related element
        actions.click(account).perform();
    }
}
