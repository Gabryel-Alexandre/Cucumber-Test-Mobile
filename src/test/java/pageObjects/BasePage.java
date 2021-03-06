package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private MobileElement botaoPermitir;
	
	public BasePage(AppiumDriver<?> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	public void clicarNoBotaoPermitir() {
		botaoPermitir.click();
	}

}
