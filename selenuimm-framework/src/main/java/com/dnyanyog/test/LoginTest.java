package com.dnyanyog.test;

import org.testng.annotations.Test;

import com.dnyanyog.common.BaseSelenium;
import com.dnyanyog.page.LoginPage;
//@Listeners({IInvokedListenerImpl.class})
public class LoginTest extends BaseSelenium {
	@Test(dataProvider= "loginDataFromExcel")
	public void verifyAdminLoginSuccessfulTest(String userName,String password)
	{
		
	LoginPage lP = new LoginPage();
	lP.printFont()
			.printLinks();
		lP.login(userName, password);
		//HomePage hp= new HomePage();	
				//hp.verifyWelcomeText("Welcome Linda");
	//HomePage hp= new HomePage();	
	//hp.verifyWelcomeText("Welcome Admin");
		
		}

/*	@Test
	public void verifyAdminLoginWithBlankPassword()

	{
		LoginPage lP = new LoginPage();
		lP.login("Admin", "");
			
	
	}
	@Test
	public void verifyAdminLoginWithBlankUserName()
	{
		LoginPage lP = new LoginPage();
		lP.login("", "admin123");
			
	
}
	
	@Test
	public void verifyAdminLoginWithInvalidUserName()
	{
	
		LoginPage lP = new LoginPage();
		lP.login("Admin11", "admin123");
			
	}*/
	
	
}
