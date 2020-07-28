package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
//		set properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pawel\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		open url
		driver.get("http://automationpractice.com");
		
//		move to registration page
		driver.findElement(By.cssSelector("a[class='login'")).click();
		
//		wait for ajax response
		WebDriverWait wait = new WebDriverWait (driver, 15);
		WebElement emailCreate = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
		
//		put required mail first
		emailCreate.sendKeys("a.dupa@dupa.pl");

//		move to next registration page
		driver.findElement(By.id("SubmitCreate")).click();
		
//		wait for ajax response
		WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		
//		all form variables 
		gender.click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("andrzej");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("dupa");
		
		driver.findElement(By.id("passwd")).sendKeys("andrzejdupa");
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.id("optin")).click();
		
		new Select(driver.findElement(By.id("days"))).selectByValue("29");
		
		new Select(driver.findElement(By.id("months"))).selectByVisibleText("June ");
		
		new Select(driver.findElement(By.id("years"))).selectByValue("1991");
		
		driver.findElement(By.id("company")).sendKeys("Dupa na wiejskiej");
		
		driver.findElement(By.id("address1")).sendKeys("Wiejska 13");
		
		driver.findElement(By.id("address2")).sendKeys("psia dupa");
		
		driver.findElement(By.id("city")).sendKeys("Warszawa");
		
		new Select(driver.findElement(By.id("id_state"))).selectByValue("9");
		
		driver.findElement(By.id("postcode")).sendKeys("30004");
		
		new Select(driver.findElement(By.id("id_country"))).selectByValue("21");
		
		driver.findElement(By.id("other")).sendKeys("Terefere kuku!@#$");
		
		driver.findElement(By.id("phone")).sendKeys("0123-456-781");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("0123-456-789");
		
		driver.findElement(By.id("submitAccount")).click();
		
		
//		pn: 
//		Thread.sleep(3000);
//		driver.close();
	}

}
