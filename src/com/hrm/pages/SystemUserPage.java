package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class SystemUserPage extends HomePage{
	
	@FindBy(id="menu_admin_Configuration")
	private WebElement admin_Conf;
	
//	@FindBy(id="menu_admin_localization")
//	private WebElement admin_Local;
	

	public SystemUserPage(WebDriver driver) {
		super(driver);
		
	}
	
	

	public void clickLocalization() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(admin_Conf).perform();
		Thread.sleep(3000);
		WebElement local = driver.findElement(By.id("menu_admin_localization"));
		actions.moveToElement(local).click().perform();
	}
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement admin_UserManagement;
	
	public void clickUsers() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(admin_UserManagement).perform();
		Thread.sleep(3000);
		WebElement local = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		actions.moveToElement(local).click().perform();
	}
	
	@FindBy(id="btnAdd")
	private WebElement add_Employee;
	
	public void clickAddEmployee(){
		add_Employee.click();
	}

}
