package parallelTest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallelDataProv {

	@Test(dataProvider = "dp1")
	public void getBrowsrName(String browser, String env) throws Exception {
		Date d = new Date();
		System.out.println(browser + "-----" + env + "---" + d);
		Thread.sleep(2000);
	}

	@DataProvider(name = "dp1",parallel=true)
	public Object[][] getData() {

		return new Object[][] { { "chrome", "qa" }, { "firefox", "uat" }

		};
	}

}
