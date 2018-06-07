package com.hrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Utility;

public abstract class HomePage extends BasePage{

	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement empList_Menu;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement admin_Menu;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment_Menu;
	
	@FindBy(id="menu_recruitment_viewJobVacancy")
	private WebElement vacancy_Menu;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	private WebElement leave_Menu;
	
	
	public void click_Leave_Menu(){
		leave_Menu.click();
	}
	
	
	public void clickvacancy_Menu(){
		vacancy_Menu.click();
	}
	
	
	public void clickRecuitment_Menu(){
		recruitment_Menu.click();
	}
	
	
	public void clickPIM_Menu()
	{
		pim_Menu.click();
	}
	
	public void clickAddEmp_Menu(){
		addEmp_Menu.click();
	}
	
	public void clickEmpList_Menu(){
		empList_Menu.click();
	}
	
	public void clickAdmin_Menu()
	{
		admin_Menu.click();
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	
	public void logout(){
		//welcome.click();
		Utility.clickUsingJS(driver, welcome);
		waitAndClick(logout);
		
	}
	
	
}
