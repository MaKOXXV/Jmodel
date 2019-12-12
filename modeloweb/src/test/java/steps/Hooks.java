package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import factory.webDriverFactory;

public class Hooks {

	@Before
	public void setUp() {
		webDriverFactory.startChromeDriver();
	}
	
	@After
	public void tearDown() {
		webDriverFactory.killCurrentDriver();
	}
}
