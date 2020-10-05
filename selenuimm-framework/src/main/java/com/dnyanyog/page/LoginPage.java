package com.dnyanyog.page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dnyanyog.common.WebDriverFactory;

public class LoginPage {
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//span[text()='( Username : Admin | Password : admin123 )']")
	WebElement loginHint;
//	chrome.findElement(By.xpath("//input[@id='btnLogin']"));
	
	public LoginPage()
	{
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public HomePage login(String strUserName, String strPassword)
	
	{
		
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginBtn.click();
		HomePage hp = new HomePage();
		return hp;
		
		
	
	}
	
	public LoginPage printFont()
	{
		System.out.println(loginHint.getCssValue("color"));
	System.out.println(loginHint.getCssValue("font-size"));
	System.out.println(loginHint.getCssValue("font-family"));
	
	return this;
	
	}
	public LoginPage printLinks()
	{
		List<WebElement> links = WebDriverFactory.getDriver().findElements(By.tagName("a"));
		links.forEach(o->System.out.println(o.getAttribute("ahref")));
		
		for(WebElement link:links)
		{
		System.out.println(link.getAttribute("href"));	
		}
Iterator<WebElement> itr = links.iterator();
while(itr.hasNext())
{
	System.out.print(itr.next().getAttribute("href"));
}
		return this;
	}
}