package capstone_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
    private WebDriver driver;
   

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        // Navigate to the login page
        driver.get("http://localhost:4200/");
    }

//    @Test(priority = 1)
//    public void testValidLogin() throws InterruptedException {
//        // Perform valid login
//        login("umesh1@gmail.com", "Umesh@123");
//        Thread.sleep(3000);
//        // Verify successful login by checking the URL
//        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/dashboard", "Login successful!");
//    }

    @Test(priority = 2)
    public void testInvalidLogin() throws InterruptedException {
    	boolean issnackbar=driver.findElement(By.xpath("//DIV[@matsnackbarlabel=''][text()=' Invalid Email Address\n"
    			+ "']/self::DIV")).isDisplayed();
        // Perform invalid login
        login("invalidemail@example.com", "invalidpassword");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        Assert.assertTrue(issnackbar,"invalid login");
    }

    @Test(priority = 3)
    public void testEmptyFields() throws InterruptedException {
    	
        // Perform login with empty fields
        login("", "");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        
//        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for empty fields!");
    
        	
    }
    

   
//
//    @Test(priority = 4)
//    public void testValidEmailEmptyPassword() throws InterruptedException {
//        // Perform login with valid email and empty password
//        login("umesh1@gmail.com", "");
//        Thread.sleep(3000);
//        // Verify that the login fails and the user remains on the login page
//        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for valid email and empty password!");
//    }

    @Test(priority = 5)
    public void testEmptyEmailValidPassword() throws InterruptedException {
        // Perform login with empty email and valid password
        login("", "Umesh@123");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for empty email and valid password!");
    }

    @Test(priority = 6)
    public void testInvalidEmailFormat() throws InterruptedException {
        // Perform login with invalid email format
        login("invalidemailformat", "Umesh@123");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for invalid email format!");
    }

    @Test(priority = 7)
    public void testSpecialCharactersInEmail() throws InterruptedException {
        // Perform login with special characters in email
        login("special!chars@example.com", "Umesh@123");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for special characters in email!");
    }

    @Test(priority = 8)
    public void testSpecialCharactersInPassword() throws InterruptedException {
        // Perform login with special characters in password
        login("umesh1@gmail.com", "Special@chars");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for special characters in password!");
    }

    @Test(priority = 9)
    public void testLongEmail() throws InterruptedException {
        // Perform login with excessively long email
        login("verylongemailaddress1234567890123456789012345678901234567890@example.com", "Umesh@123");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for long email!");
    }

    @Test(priority = 10)
    public void testLongPassword() throws InterruptedException {
        // Perform login with excessively long password
        login("umesh1@gmail.com", "Verylongpassword1234567890123456789012345678901234567890");
        Thread.sleep(3000);
        // Verify that the login fails and the user remains on the login page
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/login", "Login failed for long password!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

    private void login(String email, String password) {
        WebElement emailInput = driver.findElement(By.xpath("//INPUT[@id='mat-input-0']/self::INPUT"));
        emailInput.sendKeys(email);
        WebElement passwordInput = driver.findElement(By.xpath("//INPUT[@id='mat-input-1']/self::INPUT"));
        passwordInput.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//SPAN[@class='mdc-button__label'][text()='Login']/self::SPAN"));
        loginButton.click();
    }
}

