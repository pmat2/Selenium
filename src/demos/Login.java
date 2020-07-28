package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.BrowserType;
import utilities.DriverFactory;

public class Login {

	public static void main(String[] args) throws InterruptedException {
//		Define web driver
		DriverFactory factory = new DriverFactory();
		
		WebDriver driver = factory.factory(BrowserType.FIREFOX);
		
//		Open browser and navigate to the application
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
//		Enter login
		driver.findElement(By.id("email")).sendKeys("a.dupa@dupa.pl");
		
//		Enter password
		driver.findElement(By.id("passwd")).sendKeys("andrzejdupa");
		
//		Click login
		driver.findElement(By.id("SubmitLogin")).click();
		
//		Close the browser
//		Thread.sleep(3000);
//		driver.close();
	}

}
