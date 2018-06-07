package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;
import com.hrm.pages.PersonalDetailsPage;

import generics.Utility;

public class CreateDeleteMultipleEmp extends BaseTest{
	
	@Test
	public void testCreateDeleteMultipleEmp()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.clickPIM_Menu();
		
		EmpInfoPage eiPage = new EmpInfoPage(driver);
		AddEmpPage aePage= new AddEmpPage(driver);
		
		int rc=Utility.getExcelRowCount(INPUT_PATH, "Create_Emp");
		
		for(int i=1;i<=rc;i++)
		{
				eiPage.clickAddEmp_Menu();
				String fn=Utility.getExcelCellValue(INPUT_PATH, "Create_Emp", i, 0);
				String ln=Utility.getExcelCellValue(INPUT_PATH, "Create_Emp", i, 1);
		
				aePage.setFirstName(fn);
				aePage.setLastName(ln);
				aePage.clickSave();
		
		}
		
		
		PersonalDetailsPage pdPage = new PersonalDetailsPage(driver);
				
		pdPage.clickEmpList_Menu();
		
		eiPage.selectAllEmpCheckBox();
		eiPage.clickDelete();
		eiPage.clickOK();
		eiPage.verifyAllEmpDeleted();
		
	}

}
