package parallelTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SetUp {

	@Test
	public void doLogin() {
		driver.findElement(By.xpath("//input[@type='email1']")).sendKeys("sfddfd@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		

	}
	@Test
	public void dologout() {
		Assert.fail("logout fail");
	}
	
	


}
