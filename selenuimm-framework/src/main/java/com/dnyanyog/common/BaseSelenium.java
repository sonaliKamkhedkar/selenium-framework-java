package com.dnyanyog.common;

import java.io.BufferedReader;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
@Listeners({IInvokedListenerImpl.class})
	

public class BaseSelenium {
	
	@DataProvider(name="loginDataFromExcel")
	public String[][] getDataFromExcel() throws Exception
	{
	return ExcelReader.getExcelTableArray("C:\\Users\\DELL\\Desktop\\loginData.xlsx","Sheet1");
	
	}
	@DataProvider(name= "loginData")
	public String[][] getArray()
	{
		String[][] loginData = {{"Admin","admin123"},{"Sonali","Sonali123"}};// 2D Arry Declaration and initialzation 
		
		//String[] loginDataArray1= {"Admin","admin123"};
		return loginData;
		
	}
	
	@DataProvider(name="loginDataFromCSV")
		public String[][] getDataFromCSV()
		{
			
			String csvFile = "C:\\Users\\Sonali\\CSVFile.csv";
			BufferedReader br = null;
			String line = "";
		String cvsSplitBy = ",";
		//	char cvsSplitBy =",";
			
		String [][] loginData = new String[2][2];//2 D array Declaration only
		int i=0;
			try
			{
			
			br = new BufferedReader(new FileReader(csvFile));
			// br1 = new BufferedReader(new FileReader(csvFile));
			
			while ((line = br.readLine()) != null) {
				String[] data = line.split(cvsSplitBy);
				loginData[i]= data;
				System.out.println(line);
				i=i+1;
			}
			 br.close();
	}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		
		return loginData;
		}
}
	
	/*	@BeforeMethod
/*	public void beforeEveryTest()
	{
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
		WebDriverFactory. chrome = new ChromeDriver();
		WebDriverFactory.chrome.get("https://opensource-demo.orangehrmlive.com/");
		WebDriverFactory.chrome.manage().window().maximize();
		
	}
	@AfterMethod
	public void AfterEveryTest()
	{
		WebDriverFactory.chrome.quit();
	}
*/

