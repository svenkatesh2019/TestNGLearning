package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m)
	{
		Object[][] data =null;
		if(m.getName().equals("logIn"))
		{
		 data = new Object[2][2];
		
		data[0][0]="user1";
		data[0][1]="pasword123";
		
		data[1][0]="user2";
		data[1][1]="pasword456";
		}
		else if (m.getName().equals("userReg"))
		{
			data = new Object[2][3];
			
			data[0][0]="sridevi";
			data[0][1]="venaktesh";
			data[0][2]="asas@gmail.com";
			
			data[1][0]="venka";
			data[1][1]="nara";
			data[1][2]="asdasdas@gmail.com";
		}
		return data;
		
	}
	
//	@DataProvider(name="dp2")
//	public static Object[][] getData2()
//	{
//		Object[][] data = new Object[2][3];
//		
//		data[0][0]="sridevi";
//		data[0][1]="venaktesh";
//		data[0][2]="asas@gmail.com";
//		
//		data[1][0]="venka";
//		data[1][1]="nara";
//		data[1][2]="asdasdas@gmail.com";
//		return data;
//		
//	}

}
