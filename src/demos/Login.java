package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BrowserType;
import utilities.DriverFactory;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
//		Set properties
		DriverFactory factory = new DriverFactory();
		WebDriver driver = factory.factory(BrowserType.FIREFOX);
		
//		Form variables
		String emailAddress = "j.kowalski@kowalski.pl";
		String passwordInput = "jkjk0val007";
		
//		Open application
		driver.get("http://automationpractice.com");
		
//		Move to login page
		driver.findElement(By.cssSelector("a[class='login'")).click();
		
//		Web elements
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
		
//		Wait for ajax response
		WebDriverWait wait = new WebDriverWait (driver, 15);

//		Fill out form
		WebElement emailCreate = wait.until(ExpectedConditions.elementToBeClickable(email));
		email.sendKeys(emailAddress);
		password.sendKeys(passwordInput);
		submitLogin.click();
		
//		Close the browser
		Thread.sleep(3000);
		driver.close();
	}
}
