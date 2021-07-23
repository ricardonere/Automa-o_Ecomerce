package page;



import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
@test
public class BuscaPage {
	public ChromeDriver driver;
	public final String ResultadoBusca = "//span[contains(text(),'Novo Echo Dot (4ª Geração): Smart Speaker com Alex')]";
	public final String BUSCA = "//input[@id='twotabsearchtextbox']";
	public final String AdicionarCarrinho = "//input[@id='add-to-cart-button']";
	public void preecheBusca() {
		driver.findElement(By.xpath(BUSCA)).sendKeys("ecodoth alexa 4 geração"); // Localizando
		driver.findElement(By.xpath(BUSCA)).submit();
		
		
	
	}
	public void clicaResultadoBusca() {
		driver.findElement(By.xpath(ResultadoBusca)).click();
		
		
		
	
	}
	public void adicionarCarrinho() {
		driver.findElement(By.xpath(AdicionarCarrinho)).click();
		
		
		
	
	}
	/**
	 * Metodo Contrutor
	 * @param outroDriver
	 */
	public BuscaPage(ChromeDriver outroDriver) {
		this.driver = outroDriver;
	}
	
}
