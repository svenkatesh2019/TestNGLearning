package parallelTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestFbLinks extends BaseTest {

	@Test(priority = 1)
	public void launchUrl() {
		driver = getDriver("chrome");

		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void getLinksCount() throws Throwable {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));

		}
		WebDriverWait wait = new WebDriverWait(driver, 20);

//		WebElement ele = driver.findElement(By.partialLinkText("Deutsch"));
//
//		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
//
//		Thread.sleep(3000);
//		driver.navigate().back();
//		ele = driver.findElement(By.partialLinkText("Español"));
//		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
		WebElement el;
		for (WebElement link : links) {
			if (link.getText().length() > 0) {
				el = driver.findElement(By.partialLinkText(link.getText()));
				//wait.until(ExpectedConditions.elementToBeClickable(el)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(link.getText()))).click();
				Thread.sleep(3000);
				driver.navigate().back();
				driver.navigate().refresh();
			}
		}

	}

//		 int count = 1;
//		 Iterator<WebElement> iter = links.iterator();
//		 WebDriverWait wait = new WebDriverWait(driver, 10);//Explicit wait
//		 while(iter.hasNext()) {
//			    WebElement we = iter.next();
//			   
//			    we.click();
//			    List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
//			    
//			    driver.switchTo().window(browserTabs .get(1));
//			    System.out.println("clicking link--"+count);
//			    count++;
//			    driver.close();
//			    driver.switchTo().window(browserTabs.get(0));
//		 }

	public void getEachLink() {

	}

	@Test(priority = 3)
	public void closeBrowser() {
		driver.close();
	}

}
