package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class ParameterizationWithExcelHashTable {

	public static ExcelReader excel = null;

	@Test(dataProvider = "dp1")
	public void testData(Hashtable<String, String> data) {
		// System.out.println(username + "-----" + password+"---"+address);
		System.out.println(data.get("username")+ "--"+data.get("password")+ "--"+data.get("address")+ "--"+data.get("age")+ "--"+data.get("gender"));
	}

	@DataProvider(name = "dp1")
	public Object[][] getData() {

		Hashtable<String,String> table=null;
		
		excel = new ExcelReader("C:\\Users\\sudv\\Documents\\TestDataExcel.xlsx");
		String sheetName = "users";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		Object[][] data = new Object[rows-1][1];
		
		for(int rowNum=2;rowNum<=rows;rowNum++)
		{
			table=new Hashtable<String,String>();
			
			for(int colNum=0;colNum<cols;colNum++)
			{
								
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum-2][0]=table;
				//data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
			
		}
		
		return data;

	}

}
