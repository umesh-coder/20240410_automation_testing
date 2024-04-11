package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		  WebDriver driver = new FirefoxDriver();
		  
		  
      // Navigate to the webpage
      driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

      // Locate draggable element
      WebElement draggableElement = driver.findElement(By.id("draggable"));

      // Locate droppable element
      WebElement droppableElement = driver.findElement(By.id("droppable"));

      // Create an instance of Actions class
      Actions actions = new Actions(driver);

      // Perform drag and drop operation
      actions.dragAndDrop(draggableElement, droppableElement).build().perform();

      // Verify if the drop was successful
      String droppedText = droppableElement.getText();
      if (droppedText.equals("Dropped!")) {
          System.out.println("Drag and drop successful!");
      } else {
          System.out.println("Drag and drop failed!");
      }

      // Close the browser
      driver.quit();
      
	}
}
