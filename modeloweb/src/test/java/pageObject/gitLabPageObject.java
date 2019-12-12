package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilSelenium.util;

public class gitLabPageObject {
	//PAGE OBJECT
	
	//INSTANCIA DA CLASSE UTIL
	util util = new util();
	
	//DECLARANDO ELEMENTOS PAGEOBJECT
	@FindBy(name = "username")
	private WebElement txtLogin;
	
	@FindBy(name = "userpass")
	private WebElement txtSenha;
	
	@FindBy(xpath = "//div[@class'flashalert']")
	private WebElement msgErroLogin;
	
	
	//METODOS DE INTERACAO
	public void goToUrl(String url) {
		util.goToUrl(url);
	}
	
	public void efetuarLogin(String login, String Senha) {
		txtLogin.sendKeys(login);
		txtSenha.sendKeys(Senha);
		msgErroLogin.click();
	}

	





}
