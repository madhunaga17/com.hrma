package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

public class TestJobTitle extends BaseTest{

	@Test
	public void testJobTitle()
	{
		DashboardPage dPage = new DashboardPage(driver);
		dPage.clickPIM_Menu();
		
		EmpInfoPage emp = new EmpInfoPage(driver);
		emp.verifyJobTitleIsSorted();
		emp.verifyJobTitleHasNoDuplicate();
		
	}
	

	
}
