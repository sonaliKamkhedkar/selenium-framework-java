package com.dnyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dnyanyog.common.WebDriverFactory;

public class AddUserPage {
	@FindBy(id="systemUser_userType")
     WebElement userType;

	@FindBy(id="systemUser_employeeName_empName")
    WebElement empName;
	
	@FindBy(id="systemUser_userName")
    WebElement userName;
	

	@FindBy(id="systemUser_status")
    WebElement status;
	
	@FindBy(id="systemUser_password") 
	 WebElement password;
	
	@FindBy(id="systemUser_confirmPassword") 
	 WebElement conPassword;
	
	@FindBy(id="btnSave") 
	 WebElement save;
	
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
}
	
	public AdminPage addUserDetails(String strUserType,String strEmpName,String strUserName,String strStatus,String strPassword,String strConPassword)
	{
		
		userType.sendKeys(strUserType);
		empName.sendKeys(strEmpName);
	    userName.sendKeys(strUserName);
	    status.sendKeys(strStatus);
	    password.sendKeys(strPassword);
	    conPassword.sendKeys(strConPassword);
	    
	    save.click();
	    return new AdminPage();
	}
}