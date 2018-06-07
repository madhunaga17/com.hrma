package com.hrm.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hrm.base.BasePage;
import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.LeaveListPage;

public class VerifyMonthYear extends BaseTest{
	@Test
	public void testCalendar(){
		DashboardPage dbpage=new DashboardPage(driver);
		dbpage.click_Leave_Menu();
		LeaveListPage llPage=new LeaveListPage(driver);
		llPage.clickFromDate();
		llPage.verifyCurrentMonthIsSelected();
		llPage.verifyCurrentYearIsSelected();
	}

}
