package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider="dp1")
	public void logIn(String username , String passwrd) {
		System.out.println(username + "---" + passwrd);
		
	}
	
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
		
		return new Object[][] {
			{"sd@gmail.com","pass123"},{"sd@gmail.com","pass12345"}
			
			
		};
		
	}

}
