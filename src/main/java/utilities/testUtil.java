package utilities;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	

public class testUtil  {

	
	
	
	public static void captureScreenshot(WebDriver driver,String methodname) throws IOException{
			
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
	    	
	    	Date d = new Date();
			String newfilename= methodname + d.toString().replace(" ", "_").replace(":", "_")  +".jpg";
			File destFile = new File(".\\Screenshot\\" + newfilename);
			FileUtils.copyFile(scrFile,destFile);
			System.out.println("screenshot recorded");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	}
	
	}
	
	
	// make zip of reports
		public static void zip(String filepath){
		 	try
		 	{
		 		File inFolder=new File(filepath);
		 		File outFolder=new File("Reports.zip");
		 		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
		 		BufferedInputStream in = null;
		 		byte[] data  = new byte[1000];
		 		String files[] = inFolder.list();
		 		for (int i=0; i<files.length; i++)
		 		{
		 			in = new BufferedInputStream(new FileInputStream
		 			(inFolder.getPath() + "/" + files[i]), 1000);  
		 			out.putNextEntry(new ZipEntry(files[i])); 
		 			int count;
		 			while((count = in.read(data,0,1000)) != -1)
		 			{
		 				out.write(data, 0, count);
		 			}
		 			out.closeEntry();
	  }
	  out.flush();
	  out.close();
	  System.out.println("zipped");
		 	
	}
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  } 
	 }	
}
