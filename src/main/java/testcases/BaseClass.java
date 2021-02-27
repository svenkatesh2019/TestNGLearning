package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void setUp()
	{
		System.out.println("Initialize!!!.....");
	}
	@AfterSuite
	public void tearDown()
	{
		System.out.println(" tear down...........");
	}
	
}
