package leiloes;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeiloesPage {
	private static final String URL_CADASTRO_LEILAO = "http://localhost:8080/leiloes/new";
	private WebDriver browser;
	

		public LeiloesPage(WebDriver browser) {
		this.browser = browser;
	}

		public void fechar() {
			this.browser.quit();
		}

		public void carregarForm() {
			this.browser.navigate().to(URL_CADASTRO_LEILAO);
			
		}

		
}
