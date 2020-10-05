package com.dnyanyog.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedListenerImpl implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
		
		
		WebDriver chrome = new ChromeDriver();
	
		// setDriver(dr) = new ChromeDriver();
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		chrome.manage().window().maximize();
		WebDriverFactory.setDriver(chrome);
		
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		WebDriverFactory.getDriver().quit();
	

}
	public void add() {
		
	}
}
