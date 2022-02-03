package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pageObjects.ManipulacaoDeListaPage;
import static utils.Utils.*;

public class ManipulacaoDeListaSteps {

	ManipulacaoDeListaPage page = new  ManipulacaoDeListaPage(driver);
	
	@Quando("eu acionar a lista")
	public void euAcionarALista() {
	   page.clicarNaLista();
	}

	@Quando("eu acionar o botao mais opcoes")
	public void euAcionarOBotaoMaisOpcoes() {
	   page.clicarNobotaoOptionsList();
	}

	@Quando("acionar o botao lembrete")
	public void acionarOBotaoLembrete() {
	   page.clicarNoBotaoLembrete();
	}

	@Quando("acionar o botao quinze minutos")
	public void acionarOBotaoQuinzeMinutos() {
	   page.clicarNobotaoQuinzeMinutos();
	}

	@Quando("clicar no botao pronto")
	public void clicarNoBotaoPronto() {
	   page.clicarNoBotaoPronto();
	}

	@E("^acionar o item da lista$")
	public void acionarOItemDaLista() throws Throwable {
		page.clicarNoBotaoItemLista();
	}

	@Quando("^eu acionar a nota$")
	public void euAcionarANota() throws Throwable {
		page.clicarNaNota();
	}

	@E("^acionar a opcao remover$")
	public void acionarAOpcaoRemover() throws Throwable {
		page.clicarNoBotaoRemover();
	}

	@Quando("^clicar e segurar em cima da lista$")
	public void clicarESegurarEmCimaDaLista() throws Throwable {
		page.cliqueLongo();
	}

	@E("^acionar o botao cor$")
	public void acionarOBotaoCor() throws Throwable {
		page.clicarNoBotaoCor();
	}

	@E("^acionar a cor preta$")
	public void acionarACorPreta() throws Throwable {
		page.clicarNoBotaoCorPreta();
	}
}
