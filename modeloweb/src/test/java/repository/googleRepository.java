package repository;

import org.openqa.selenium.By;

import utilSelenium.util;

public class googleRepository {
	//REPOSITORY
	
	//INSTANCIA DE UTIL
	util util = new util();
	
	//DECLARANDO ELEMENTOS SELENIUM
	private String campoSearch = "//input[@name='q']";
	private String validarMensagem = "//div[@id='resultStats']";
	
	
	//METODOS DE INTERACAO
	public void goToUrl(String url) {
		util.goToUrl(url);
	}
	
	public void efetuarBusca(String txt) {
		util.setText(By.xpath(campoSearch), txt);
	}
	
	public void validarResultadoBusca() {
		util.elementDispla(By.xpath(validarMensagem));
	}
}
