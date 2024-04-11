package premium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage {
	
	public static WebElement searchInput(WebDriver driver) {
		
		WebElement searchInput=driver.findElement(By.id("calcSearchTerm"));
		return searchInput;
	}
	
	

}
