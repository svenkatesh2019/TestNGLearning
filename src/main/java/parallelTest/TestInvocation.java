package parallelTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
	
	
	@Test(invocationCount=3,threadPoolSize = 3)
	public void launchBrowser() {
		
		driver= getDriver("firefox");
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
