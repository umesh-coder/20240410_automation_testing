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
        WebElement account = driver.findElement(By.xpath("//SPAN[@class='name_rb_secondary_item'][text()='Account']/.."));

        // Locating the "Show My Ticket" element on the webpage
        WebElement showTicket = driver.findElement(By.xpath("//LI[@id='ticket_details']//SPAN[@class='header_dropdown_item_name'][text()='Show My Ticket']"));
        
        // Performing a click action on the "Help" element
        actions.click(help).perform();
        // Adding a delay to wait for the dropdown to appear
        Thread.sleep(1900);
        
        // Performing a click action on the account related element
        actions.click(account).perform();
        // Adding a delay to wait for the dropdown to appear
        Thread.sleep(2000);
        
        // Moving to the "Show My Ticket" element and clicking it
        actions.moveToElement(showTicket).click().perform();
        // Adding a delay to wait for the page to load (not recommended, used here for simplicity)
        Thread.sleep(1500);
    }
}
