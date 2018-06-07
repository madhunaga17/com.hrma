package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;
import com.hrm.pages.PersonalDetailsPage;

public class CreateDeleteEmp extends BaseTest{
	
	@Test
	public void testCreateDeleteEmp()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.clickPIM_Menu();
		
		EmpInfoPage eiPage = new EmpInfoPage(driver);
		eiPage.clickAddEmp_Menu();
		
		AddEmpPage aePage= new AddEmpPage(driver);
		aePage.setFirstName("John");
		aePage.setLastName("Patrick");
		aePage.clickSave();
		
		PersonalDetailsPage pdPage = new PersonalDetailsPage(driver);
		pdPage.verifyFirstName("John");
		String empID=pdPage.getEmpID();
		
		pdPage.clickEmpList_Menu();
		
		eiPage.selectEmpCheckBox(empID);
		eiPage.clickDelete();
		eiPage.clickOK();
		eiPage.verifyEmpNotPresent(empID);
		
	}

}
