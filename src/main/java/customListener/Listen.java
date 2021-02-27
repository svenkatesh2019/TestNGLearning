package customListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listen implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Screenshot\\error.jpg\" target=\"_blank\">Screenshot capture</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Screenshot\\error.jpg\" target=\"_blank\"> <img height=200 width=200 src=\"C:\\Screenshot\\error.jpg\"></a>");
		
		
		System.out.println("capture screenshot of failed test"+result.getName());
	}
 public void onTestSkipped(ITestResult result) {
	 System.out.println("capture screenshot of skipped test"+result.getName());
}
}
