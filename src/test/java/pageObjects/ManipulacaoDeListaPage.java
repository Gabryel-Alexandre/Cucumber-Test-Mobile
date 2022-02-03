package pageObjects;

import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
 

public class ManipulacaoDeListaPage {
	
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/title")
	private MobileElement botaoLista;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout//android.widget.ImageButton")
	private List<MobileElement> menuDaLista; 
	
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
	private List<MobileElement>maisOpcoes;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_15min")
	private MobileElement botaoQuinzeMinutos;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/button1")
	private MobileElement botaoPronto;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/text")
	private MobileElement botaoItemLista;
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.RelativeLayout")
	private List<MobileElement> itens;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout//android.widget.LinearLayout")
	private List<MobileElement> menuQuandoClicarESegurar;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_menu_color")
	private MobileElement botaoMenuCor;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/txt7")
	private MobileElement botaoCorPreta;
	
	private AppiumDriver<?> driver;
	
	public void clicarNoBotaoCorPreta() {
		botaoCorPreta.click();
	}
	
	public void cliqueLongo() {
		Actions acao = new Actions(driver);
		
		acao.clickAndHold(itens.get(0)).perform();
		
	}
	public void clicarNoBotaoPronto() {
		botaoPronto.click();
	}
	
	public void clicarNobotaoOptionsList() {
		menuDaLista.get(2).click();
	}
	
	public void clicarNoBotaoLembrete() {
		maisOpcoes.get(2).click();
	}
	
	public void clicarNobotaoQuinzeMinutos() {
		botaoQuinzeMinutos.click();
	}
	
	public void clicarNaLista() {
		botaoLista.click();
	}
	
	public void clicarNoBotaoItemLista() {
		botaoItemLista.click();
	}
	
	public void clicarNoBotaoRemover() {
		maisOpcoes.get(6).click();
	}
	
	public void clicarNaNota() {
		itens.get(1).click();
	}
	
	public void clicarNoBotaoCor() {
		System.out.println(menuQuandoClicarESegurar.size());
		
		botaoMenuCor.click();
	}
	public ManipulacaoDeListaPage(AppiumDriver<?> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
}
