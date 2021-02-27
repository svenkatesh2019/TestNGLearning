package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestFailures extends BaseClass{
	
	@Test
	public void doLogin() {
		System.out.println("failing the test case");
		throw new SkipException("skipping test as condition is not satisfy");
	}

}
