package com.dnyanyog.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dnyanyog.common.IInvokedListenerImpl;
import com.dnyanyog.page.LoginPage;

@Listeners({IInvokedListenerImpl.class})
public class AddUser  {

	@Test
	public void addAdminEnabledUserSuccessfulTest()
	{
		
		LoginPage lP = new LoginPage();
		lP.login("Admin", "admin123")
		 	//.verifyWelcomeText("Welcome Linda")
		 		.navigateToAdminPage()
		 			.navigateToAddUserPage()
		 					.addUserDetails("", "Sonali", "SonaliK", "", "Sonali123", "Sonali123");
		
		
			
		
	}
}
