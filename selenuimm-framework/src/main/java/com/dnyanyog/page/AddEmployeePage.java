package com.dnyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dnyanyog.common.WebDriverFactory;

public class AddEmployeePage {
	
	
	
	
    @FindBy(id="firstName")
	WebElement firstName;
	
	
    @FindBy(id="middleName")
	WebElement middleName;
    
    @FindBy(id="lastName")
   	WebElement lastName;
    
    @FindBy(id="btnSave")
   	WebElement save;
    
  
	
    public AddEmployeePage()
    {
    	PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

	
    
    public AdminPage addEmployeeDetails(String strfirstName,String strMiddleName,String strlastName)
    {
    	firstName.sendKeys(strfirstName);
    	middleName.sendKeys(strMiddleName);
    	lastName.sendKeys(strlastName);
    	save.click();
    	return new AdminPage();
    }


    
    
   	
}

