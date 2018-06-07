package com.hrm.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.Recruitment_VacanciesPage;

public class VerifyVacanciesPage extends BaseTest{//ToolTipVacancies
	@Test
	public void testTTV() throws InterruptedException{
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickRecuitment_Menu();
		dbPage.clickvacancy_Menu();
		
		
		Recruitment_VacanciesPage rcvPage=new Recruitment_VacanciesPage(driver);
		rcvPage.moveToVacancies();
		//Thread.sleep(3000);
		rcvPage.verifyToolTip("Hide Options");
//		System.out.println(driver.findElement(By.id("tiptip_holder")).isDisplayed());
//		String test = driver.findElement(By.id("tiptip_holder")).getText();
//		System.out.println(test);
	}
}
