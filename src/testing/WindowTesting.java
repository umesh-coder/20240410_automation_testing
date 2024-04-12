package testing;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;
import java.util.Iterator;

import java.lang.String;

import java.util.*;

public class WindowTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.com/");

		WebElement help = driver.findElement(By.linkText("Help"));

		help.click();

		Thread.sleep(3000);

		Set<String> alw = driver.getWindowHandles();
		Iterator<String> it = alw.iterator();

		it.next();
		
		String cw = it.next();

		driver.switchTo().window(cw);
		WebElement close = driver.findElement(By.xpath("//i[@class='icon-close']/self::i"));

		close.click();

	}

}
