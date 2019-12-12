package utilSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import factory.webDriverFactory;
import org.junit.Assert;

public class util {
	public static WebDriver driver;
	
	//CONSTRUTOR PARA OBTER O DRIVER ATUAL
	public util() {
		driver = webDriverFactory.getCurrentRunnigDriver();
	}
	
	//METODO IR PARA DETERMINADA URL PASSADA POR PARAMETRO
	public boolean goToUrl(String url) {
		try {
			System.out.println(driver != null ? "DRIVER OK" : "DRIVER NULL");
		}
		catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	public boolean setText(By by, String txt) {
		try {
			driver.findElement(by).sendKeys(txt);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	public boolean elementDispla(By by) {
		try {
			Assert.assertEquals(true, driver.findElement(by).isDisplayed());
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
}
