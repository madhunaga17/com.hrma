package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

import generics.Utility;

public class LocalizationPage extends HomePage{
	
	

	@FindBy(linkText="Language and font help")
	private WebElement langFont_Help;
	
	String eTitle="Orange - Localizit";
	
	public LocalizationPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void clickLangFont_Help()
	{
		langFont_Help.click();		
	}
	
	public void switchBrowser()
	{
		 Utility.switchBrowser(driver, eTitle);
	}

}
