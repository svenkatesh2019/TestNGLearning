package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseClass{
	@Test(priority=1,groups= {"functional","smoke"})
	public void doRegis()
	{
		System.out.println("doing registeration");
		Assert.assertEquals(true, false,"resistration not success");
	}
	
	@Test(priority=2,dependsOnMethods = { "doRegis" },groups= {"smoke"})
	public void doLogin()
	{
		System.out.println("do login");
	}
	@Test(priority=3,dependsOnMethods = { "doRegis" },alwaysRun=true,groups= {"smoke"})
	public void addProfile()
	{
		System.out.println("adding profile");
	}
	@Test(priority=4,groups= {"bvt"})
	public void addtoCart()
	{
		System.out.println("adding to cart");
	}
	
}
