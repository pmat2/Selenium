package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public WebDriver factory(BrowserType browserType) {
		if(browserType == BrowserType.CHROME) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pawel\\Desktop\\selenium\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (browserType == BrowserType.FIREFOX) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pawel\\Desktop\\selenium\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else return new ChromeDriver();
	}
}
