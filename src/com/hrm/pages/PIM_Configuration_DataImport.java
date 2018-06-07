package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.BasePage;

public class PIM_Configuration_DataImport extends BasePage{
	public PIM_Configuration_DataImport(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="menu_pim_Configuration")
	private WebElement pim_Config;
	
	public void clickConfig() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		//Thread.sleep(3000);
		actions.moveToElement(pim_Config).perform();
		//Thread.sleep(3000);
		WebElement local = driver.findElement(By.id("menu_admin_pimCsvImport"));
		actions.moveToElement(local).click().perform();
//		
//		pim_Config.click();
	}
	
}
