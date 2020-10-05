package com.dnyanyog.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dnyanyog.common.WebDriverFactory;

public class HomePage {
	@FindBy(id="welcome")
	WebElement welcomeText;
	 
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	
	  @FindBy(id="menu_pim_viewPimModule")
		WebElement PIM;
		
		@FindBy(id="menu_pim_addEmployee")
		WebElement addEmp;

public HomePage()
{
	PageFactory.initElements(WebDriverFactory.getDriver(), this);
}

public HomePage verifyWelcomeText(String strExpectedWelcomeText)
{

		Assert.assertEquals(welcomeText.getText(), strExpectedWelcomeText);
		//this.navigateToAdminPage();
		return this;
}


public AdminPage navigateToAdminPage()
{
	adminTab.click();
return new AdminPage();
}

public AddEmployeePage navigateToAddEmployeePage()
{
	PIM.click();
	addEmp.click();
	return new AddEmployeePage();
}



}


