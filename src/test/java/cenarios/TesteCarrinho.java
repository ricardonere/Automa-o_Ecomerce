package cenarios;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page.BuscaPage;

public class TesteCarrinho {
	static ChromeDriver driver;
	BuscaPage buscaPage = new BuscaPage(driver);

	@BeforeClass
	public static void beforeClass() {
		driver = setupChromeDriver();
		driver.get("http://amazon.com.br");// Abrindo uma pagina

	}
	@Test
	public void testeBuscaAmazon () {
		buscaPage.preecheBusca();
		buscaPage.clicaResultadoBusca();
		buscaPage.adicionarCarrinho();
		
	}
	
	
	public static ChromeDriver setupChromeDriver() {
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		"--disable-web-security", "--ignore-certificate-errors", "--allow-running-insecure-content", "--allow-insecure-localhost", "--disable-gpu", "window-size=1200x600", "disable-popup-blocking", "disable-infobars"
//		);
		
		return driver;
		
	}
	
	
	
	
	
	
	
	
	
	public void testeBusca() {
		
		
		
	}

}
