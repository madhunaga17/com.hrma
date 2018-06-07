package com.hrm.pages;

import generics.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hrm.base.HomePage;

public class LeaveListPage extends HomePage{

	@FindBy(id="menu_leave_viewLeaveList")
	private WebElement list_Leave_Menu;
	

	@FindBy(id="calFromDate")
	private WebElement fromDate;

	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement monthListBox;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement yearListBox;
	
	public void verifyCurrentYearIsSelected(){
		String selectedOption=Utility.getSelectedOptionListBox(yearListBox);
		String currentYear=Utility.getCurrentYear();
		Assert.assertEquals(selectedOption, currentYear);
		System.out.println(currentYear);
	}
		
	public void verifyCurrentMonthIsSelected(){
		String selectedOption=Utility.getSelectedOptionListBox(monthListBox);
		String currentMonth=Utility.getCurrentMonth();
		Assert.assertEquals(selectedOption, currentMonth);
		System.out.println(currentMonth);
	}
	
	public void clickListLeave_Menu(){
		list_Leave_Menu.click();
	}
		
	public void clickFromDate(){
		fromDate.click();
	}
		
	
	public LeaveListPage(WebDriver driver) {
		
		
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
