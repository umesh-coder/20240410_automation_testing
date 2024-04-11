package testing;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Creating a WebDriver instance for Firefox
        WebDriver driver = new FirefoxDriver();

        // Navigating to the specified URL
        driver.get("https://www.calculator.net/");

        // Locating the element with the id "calcSearchTerm" and sending keys "sadadad"
        driver.findElement(By.id("calcSearchTerm")).sendKeys("sadadad");
    }
}
