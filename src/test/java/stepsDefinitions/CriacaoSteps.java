package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.TelaCricaoPage;

import static utils.Utils.*;

public class CriacaoSteps {
	
	TelaCricaoPage page = new  TelaCricaoPage(driver);
	BasePage basepage = new BasePage(driver);
	
	@Quando("aparecer a mensagem clicar no botao permitir")
	public void aparecerAMensagemClicarNoBotaoPermitir() {
	   basepage.clicarNoBotaoPermitir();
	}
	
	@Quando("eu clicar no botao plus")
	public void euClicarNoBotaoPlus() {
	  page.clicarNoBotaoCriar();
	}

	@Quando("clicar em texto")
	public void clicarEmTexto() {
		page.clicarNoBotaoCriarTexto();
	}

	@Quando("digitar o texto  {string}")
	public void digitarOTexto(String string) {
		page.inserirTextoNoCampoDeAnotacao(string);
	}

	@Quando("clicar no botao confirmar")
	public void clicarNoBotaoConfirmar() {
		 page.clicarNoBotaoConfirmarTexto();
	}

	@Entao("confirmar que foi criada")
	public void confirmarQueFoiCriada() {
		page.clicarNoBotaoConfirmarTexto();
	}
	
	
	
	
	@Quando("clicar em lista")
	public void clicarEmLista() {
	   page.clicarNoBotaoCriarLista();
	}

	@Quando("Adicionar colocar o nome da lista {string}")
	public void adicionarColocarONomeDaLista(String string) {
	   page.inserirCampoNomeDaLista(string);
	}

	@Quando("clicar no botao adicionar primeiro item")
	public void clicarNoBotaoAdicionarPrimeiroItem() {
	    page.clicarNoBotaoAddPrimeiroElemento();
	}

	@Quando("adicionar item com nome {string}")
	public void adicionarItemComNome(String string) {
	   page.inserirCampoNomeItemLista(string);
	}

	@Quando("clicar no botao proximo")
	public void clicarNoBotaoProximo() {
	    page.clicarNoBotaoProximoLista();
	}

	@Quando("clicar no botao ok")
	public void clicarNoBotaoOk() {
		
		page.clicarNoBotaoOkLista();
	    
	}



}
