import org.openqa.selenium.*;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Selenium_testing {

	public static void main(String[] args) {
		

//		// TODO Auto-generated method stub
//		
//	
//		
		WebDriver driver =new FirefoxDriver();
//		
//		
//		
		driver.get("https://www.calculator.net/");

//		driver.findElement(By.id("calcSearchTerm")).sendKeys("sadadad");
		
		driver.findElement(By.xpath("//span[@id='bluebtn']")).click();

		
		
//		System.out.println("hello");
//		driver.findElement(By.linkText("Mortgage Calculator")).click();
//		 WebElement ele=driver.findElement(By.id("calcSearchTerm"));// 
//		ele.sendKeys("Calcolireee");

	}

}
