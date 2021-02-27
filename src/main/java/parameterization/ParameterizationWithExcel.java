package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class ParameterizationWithExcel {

	public static ExcelReader excel = null;

	@Test(dataProvider = "dp1")
	public void testData(String username, String password,String address) {
		System.out.println(username + "-----" + password+"---"+address);

	}

	@DataProvider(name = "dp1")
	public Object[][] getData() {

		excel = new ExcelReader("C:\\Users\\sudv\\Documents\\TestDataExcel.xlsx");
		String sheetName = "users";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum=2;rowNum<=rows;rowNum++)
		{
			for(int colNum=0;colNum<cols;colNum++)
			{
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;

	}

}
