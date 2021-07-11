package page;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuscaPage {
	public ChromeDriver driver;

	public final String BUSCA = "//input[@id='twotabsearchtextbox']";
	
	public void preecheBusca() {
		driver.findElement(By.xpath(BUSCA)).sendKeys("ecodoth alexa 4 geração"); // Localizando
		driver.findElement(By.xpath(BUSCA)).submit();
		
	}
	
	/**
	 * Metodo Contrutor
	 * @param outroDriver
	 */
	public BuscaPage(ChromeDriver outroDriver) {
		this.driver = outroDriver;
	}
	
}
