package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class UserManagement_User_AddUserPage extends HomePage{

	public UserManagement_User_AddUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement employee_Name;
	
	@FindBy(id="systemUser_userName")
	private WebElement userName;
	
	@FindBy(id="btnSave")
	private WebElement saveEmployee;
	
	public void addUser(String en, String un){
		employee_Name.sendKeys(en);
		userName.sendKeys(un);
		saveEmployee.click();
	}
	

}
