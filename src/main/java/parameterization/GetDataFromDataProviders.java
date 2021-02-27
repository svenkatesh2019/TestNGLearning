package parameterization;

import org.testng.annotations.Test;

public class GetDataFromDataProviders {

	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void logIn(String username,String pasword)
	{
		System.out.println(username+"--"+pasword);
	}
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void userReg(String fname,String lname,String email)
	{
		System.out.println(fname+ "--"+lname+"----"+email);
		
	}
	
}
