package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import factory.webDriverFactory;

public class pageObject {
	
	public WebDriver driver;
	
	public pageObject() {
		this.driver = webDriverFactory.getCurrentRunnigDriver();
		PageFactory.initElements(driver, this);
	}
	
}
