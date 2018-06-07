package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

public class TestIncludeListBox extends BaseTest{

	@Test
	public void testIncludeListBox()
	{
		DashboardPage dPage = new DashboardPage(driver);
		dPage.clickPIM_Menu();
		
		EmpInfoPage emp = new EmpInfoPage(driver);
		
		emp.verifyIncludeListBoxIsSorted();
		emp.verifyIncludeListBoxHasNoDuplicate();
	}
}
