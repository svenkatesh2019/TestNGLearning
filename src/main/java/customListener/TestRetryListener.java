package customListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryListener {
	public static int count = 0;
	@Test(priority = 1)
	public void doLogin()
	{
		
		System.out.println("Login executed");
	}

	
	@Test(priority = 2)
	public void userReg()
	{
		count++;
		System.out.println(count);
		//Assert.assertEquals(count, 3);
		Assert.fail("failing the test cse");
	}
}
