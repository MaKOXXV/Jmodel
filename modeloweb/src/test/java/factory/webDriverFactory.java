package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webDriverFactory {

	public static WebDriver driver;
	
	 //START WEBDRIVER
	public static void startChromeDriver() {
		System.setProperty("webdriver.chome.driver", "src/test/resources/drivers/chromedriver.exe");
		
		//OPTIONS 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--javascriptEnabled");
		options.addArguments("--disable-infobars");
		
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
	}
	
	public static WebDriver getCurrentRunnigDriver() {
		return driver;
	}
	
	public static void killCurrentDriver() {
		driver.close();
		driver.quit();
	}
}
