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
		// TODO Auto-generated method stub
		
	
		
//		driver.manage().window().maximize();
//		String pw= driver.getWindowHandle();
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.redbus.com/");

		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		
//		Set<String> alw= driver.getWindowHandles();
//		Iterator<String> it = alw.iterator();
//		
//		String pw = it.next();
//		String cw= it.next();
//		driver.switchTo().window(cw);
		
		Set<String> alw =driver.getWindowHandles();
		Iterator<String> it = alw.iterator();
		
		
		
	


	}

}
