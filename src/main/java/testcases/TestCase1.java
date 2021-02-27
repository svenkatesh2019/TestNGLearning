package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass{
	@BeforeTest
	public void createDBConn()
	{
		System.out.println("creating DB connection");
	}
	
	@AfterTest
	public void closeDBConn()
	{
		System.out.println("closing DB Conn");
	}
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("lauching browsr");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("closing browser");
	}
	@Test(priority=2, groups= {"functional"})
	public void doLogin()
	{
		System.out.println("do login");
	}
	@Test(priority=1,groups= {"functional"})
	public void doRegis()
	{
		System.out.println("do use regis");
	}
}
