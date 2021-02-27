package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadParametersFromXML {
	
	@Parameters({"browser","env"})
	@Test
	public static void getBrowserName(String browser,String env)
	{
		System.out.println(browser+"---" + env);
	}
}
