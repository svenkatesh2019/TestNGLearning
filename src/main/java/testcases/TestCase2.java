package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends BaseClass{
	
	@Test(priority = 1)
	public void validateTitles()
	{
		System.out.println("Beginning of Test1");
		SoftAssert softassert = new SoftAssert();
		String expectedTitle ="Gmail.com";
		String actualTitle = "gmail.com";
		softassert.assertEquals(actualTitle, expectedTitle);
		System.out.println("valdiating test boxes");
		softassert.assertEquals(true, false,"textbox not found");
		System.out.println("validating images");
		softassert.assertEquals(false,true,"images did not match");
		System.out.println("End of Test1");
		softassert.assertAll();
	}
	
	@Test(priority = 2,groups= {"smoke"})
	public void checkCondition()
	{
		Assert.assertTrue(false, "element not found");
	}
	
	@Test(priority = 3)
	public void forceFailTestcase()
	{
		Assert.fail("forcing failure");
	}

}
