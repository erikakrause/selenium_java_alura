package leiloes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.login.LoginPage;

public class LeiloesTest {
		
		private LeiloesPage paginaDeLeiloes;
		
		@AfterEach
		public void afterEach( ) {
			this.paginaDeLeiloes.fechar();			
		}
		
		@Test
		public void deveraCadastrarLeilao() {
			LoginPage paginaDeLogin = new LoginPage();
			paginaDeLogin.preencherFormLogin("fulano", "pass");
			this.paginaDeLeiloes = paginaDeLogin.logar();
			paginaDeLeiloes.carregarForm();
			
			
		}
		
}
