package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.*;
import java.net.MalformedURLException;

public class Hooks {
	
	@Before
	public void setUp() throws MalformedURLException {
		acessarApp();
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}
