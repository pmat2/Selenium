package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BrowserType;
import utilities.DriverFactory;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
//		Set properties
		DriverFactory factory = new DriverFactory();
		WebDriver driver = factory.factory(BrowserType.FIREFOX);
		
//		Define form variables
		String emailAddress = "j.kowalski@kowalski.pl";
		String genderChoice = "Male";
		String firstname = "jan";
		String lastname = "kowalski";
		String password = "jkjk0val007";
		boolean newsletter = true;
		boolean optional = true;
		int dateDay = 21;
		String dateMonth = "June";
		int dateYear = 1981;
		String companyName = "AJAN";
		String address1 = "Zakątna 13";
		String address2 = "m 20";
		String city = "Potok";
		int stateId = 9;
		int postCode = 30004;
		int countryId = 21;
		String other = "Terefere kuku!@#$";
		String phone = "0123-456-781";
		String mobilePhone = "0123-456-789";
		
//		Open application
		driver.get("http://automationpractice.com");
		
//		Move to registration page
		driver.findElement(By.cssSelector("a[class='login'")).click();
		
//		Wait for ajax response
		WebDriverWait wait = new WebDriverWait (driver, 15);
		WebElement emailCreate = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
		
//		Put entry level variables
		emailCreate.sendKeys(emailAddress);

//		Move to next registration page
		driver.findElement(By.id("SubmitCreate")).click();
		
//		Wait for ajax response
		if (genderChoice == "Male") {
			WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
			gender.click();
		} else if (genderChoice == "Female") {
			WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender2")));
			gender.click();
		}
		
//		Detailed registration page web elements
		WebElement firstnameField = driver.findElement(By.id("customer_firstname"));
		WebElement lastnameField = driver.findElement(By.id("customer_lastname"));
		WebElement passwordField = driver.findElement(By.id("passwd"));
		WebElement newsletterRadio = driver.findElement(By.id("newsletter"));
		WebElement optionRadio = driver.findElement(By.id("optin"));
		WebElement birthDays = driver.findElement(By.id("days"));
		WebElement birthMonth = driver.findElement(By.id("months"));
		WebElement birthYear = driver.findElement(By.id("years"));
		WebElement companyField = driver.findElement(By.id("company"));
		WebElement addressField1 = driver.findElement(By.id("address1"));
		WebElement addressField2 = driver.findElement(By.id("address2"));
		WebElement cityField = driver.findElement(By.id("city"));
		WebElement stateField = driver.findElement(By.id("id_state"));
		WebElement postCodeField = driver.findElement(By.id("postcode"));
		WebElement countryField = driver.findElement(By.id("id_country"));
		WebElement otherField = driver.findElement(By.id("other"));
		WebElement phoneField = driver.findElement(By.id("phone")); 
		WebElement mobilePhoneField = driver.findElement(By.id("phone_mobile"));
		
//		Fill the form
		firstnameField.sendKeys(firstname);
		lastnameField.sendKeys(lastname);
		passwordField.sendKeys(password);
		if(newsletter) { newsletterRadio.click(); }
		if(optional) { optionRadio.click(); }
		new Select(birthDays).selectByValue(String.valueOf(dateDay));
		new Select(birthMonth).selectByVisibleText(dateMonth + " ");
		new Select(birthYear).selectByValue(String.valueOf(dateYear));
		companyField.sendKeys(companyName);
		addressField1.sendKeys(address1);
		addressField2.sendKeys(address2);
		cityField.sendKeys(city);
		new Select(stateField).selectByValue(String.valueOf(stateId));
		postCodeField.sendKeys(String.valueOf(postCode));
		new Select(countryField).selectByValue(String.valueOf(countryId));
		otherField.sendKeys(other);
		phoneField.sendKeys(phone);
		mobilePhoneField.sendKeys(mobilePhone);
		
//		Submit form
		driver.findElement(By.id("submitAccount")).click();
		
//		Close browser
		Thread.sleep(10000);
		driver.close();
	}

}