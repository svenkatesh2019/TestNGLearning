package parallelTest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallelExec {
	
	@Parameters({"browser","env"})
	@Test
	public void getBrowsrName(String browser,String env) throws Exception
	{
		Date d =new Date();
		System.out.println(browser+"-----"+env+"---"+d);
		Thread.sleep(2000);
	}

}
