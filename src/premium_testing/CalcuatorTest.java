package premium_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalcuatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.calculator.net/");
		
		CalculatorPage.searchInput(driver).sendKeys("hello guysss");
	}

}
