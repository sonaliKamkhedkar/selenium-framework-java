package com.dnyanyog.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dnyanyog.common.IInvokedListenerImpl;
import com.dnyanyog.page.LoginPage;

@Listeners({IInvokedListenerImpl.class})

public class AddEmployeeTest {
	
	@Test
	
	public void addEmployeeDetailsTest()
	{
	
LoginPage lp = new LoginPage();
lp.login("Admin","admin123")
	//.verifyWelcomeText("Welcome Luna")
							.navigateToAddEmployeePage()
									.addEmployeeDetails("Sonali" ,"Rahul","Kammkhedkar");
}

}