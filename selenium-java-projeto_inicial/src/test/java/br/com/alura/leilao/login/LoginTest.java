package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {
	
	private LoginPage paginaDeLogin;
	
	@BeforeEach
	public void beforeEach( ) {
		this.paginaDeLogin = new LoginPage();
		
	}
	@AfterEach
	public void afterEach( ) {
		this.paginaDeLogin.fechar();
		
	}
	
	@Test
	public void deveraEfetuarLoginComSucesso() { 
		paginaDeLogin.preencherFormLogin("fulano", "pass");
		paginaDeLogin.logar();
		
		
		Assert.assertFalse(paginaDeLogin.isPaginaDeLogin());
		Assert.assertEquals("fulano", paginaDeLogin.getNomeUsuarioLogado());
		
	}
	


	@Test 
	public void naoDeveLogarComDadosInvalidos() {
		paginaDeLogin.preencherFormLogin("invalido", "banana");
		paginaDeLogin.enviarForm();
	
		Assert.assertTrue(paginaDeLogin.isPaginaDeLogin());
		Assert.assertNull(paginaDeLogin.getNomeUsuarioLogado());
		Assert.assertTrue(paginaDeLogin.contemTexto("Usuário e senha inválidos."));
		
	}
	
	@Test
	public void naoDeveraAcessarPaginaRestritasSemLogin() {
		paginaDeLogin.navegaParaPaginaLances();
		
		Assert.assertTrue(paginaDeLogin.isPaginaDeLogin());
		Assert.assertFalse(paginaDeLogin.contemTexto("Dados do Leilão"));
		
	}

}
