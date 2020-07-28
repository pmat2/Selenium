package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
		else if (browserType == BrowserType.IE) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\pawel\\Desktop\\selenium\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else return new ChromeDriver();
	}
}
