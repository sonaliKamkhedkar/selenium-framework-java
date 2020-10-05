package com.dnyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dnyanyog.common.WebDriverFactory;

public class AdminPage {
	@FindBy(id="btnAdd")
	WebElement addUserBtn;
	
	
	
	public AdminPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddUserPage navigateToAddUserPage()
	{
		addUserBtn.click();
		return new AddUserPage();
	}

	
		
	
}
