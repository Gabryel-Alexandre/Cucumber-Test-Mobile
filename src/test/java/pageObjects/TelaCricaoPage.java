package pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaCricaoPage {

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab")
	private MobileElement botaoCriar;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
	private MobileElement campoNotaTexto;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement botaoConfirmarCriacao;					
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/edit_title")
	private MobileElement campoNomeDaLista;
	
	@AndroidFindBy(id = "android:id/button3")
	private MobileElement botaoProximoLista;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOkLista;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/icon")
	private MobileElement botaoAdicionarNalistaPrimeiroElemento;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/edit")
	private MobileElement campoNomeItemLista;
	
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
	private List<MobileElement>botoesCriadores;
	
	
	
	
	public TelaCricaoPage(AppiumDriver<?> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	public void clicarNoBotaoCriar() {
		botaoCriar.click();
	}

	public void clicarNoBotaoCriarTexto() {
		botoesCriadores.get(0).click();
	}

	public void clicarNoBotaoConfirmarTexto() {
		botaoConfirmarCriacao.click();
	}
	
	public void clicarNoBotaoCriarLista() {
		botoesCriadores.get(1).click();
	}
	
	public void clicarNoBotaoProximoLista() {
		botaoProximoLista.click();
	}
	public void clicarNoBotaoOkLista() {
		botaoOkLista.click();
	}
	
	public void clicarNoBotaoAddPrimeiroElemento() {
		botaoAdicionarNalistaPrimeiroElemento.click();
	}
	
	
	
	
	public void inserirTextoNoCampoDeAnotacao(String mensagem) {
		campoNotaTexto.sendKeys(mensagem);
	}
	
	public void inserirCampoNomeDaLista(String mensagem) {
		campoNomeDaLista.sendKeys(mensagem);
	}
	
	public void inserirCampoNomeItemLista(String mensagem) {
		campoNomeItemLista.sendKeys(mensagem);
	}
	
	

}
