package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

public class TestSearchBtn extends BaseTest{

	@Test
	public void testSearchBtn()
	{
		DashboardPage d = new DashboardPage(driver);
		d.clickPIM_Menu();
		
		EmpInfoPage emp = new EmpInfoPage(driver);
		emp.verifySearchBtnPresent();
	}
	
	
	
	
}
