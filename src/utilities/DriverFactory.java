package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public WebDriver factory(BrowserType browserType) {
		if(browserType == BrowserType.CHROME) {
			System.setProperty("webdriver.chrome.driver", "/mnt/7aacd26e-9d5e-4e12-a086-100a40572809/Programowanie/selenium/chromedriver");
			return new ChromeDriver();
		}
		else if (browserType == BrowserType.FIREFOX) {
			System.setProperty("webdriver.gecko.driver", "/mnt/7aacd26e-9d5e-4e12-a086-100a40572809/Programowanie/selenium/geckodriver");
			return new FirefoxDriver();
		}
		else if (browserType == BrowserType.IE) {
			System.setProperty("webdriver.ie.driver", "/mnt/7aacd26e-9d5e-4e12-a086-100a40572809/Programowanie/selenium/IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else return new ChromeDriver();
	}
}
