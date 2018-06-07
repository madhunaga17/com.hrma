package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class LocalizitPage extends HomePage {
	
	
	@FindBy(id="languageList")
	private WebElement targetLang_Listbox;

	public LocalizitPage(WebDriver driver) {
		super(driver);
		
	}

	public void verifyTargetListboxIsSorted()
	{
		log.info("Verify if Target Language listbox is sorted");
		verifyListBoxIsSorted(targetLang_Listbox, 1);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
}
