package com.dnyanyog.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

	//public static WebDriver chrome;


private static ThreadLocal<WebDriver> tL = new ThreadLocal<>();

public static WebDriver  getDriver()
{
	return tL.get();
	
}

public static void setDriver(WebDriver dr)
{
	tL.set(dr);
}
}
