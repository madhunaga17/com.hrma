package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;
import com.hrm.pages.PIM_CSV_Data_Import;
import com.hrm.pages.PIM_Configuration_DataImport;


public class ImportCSV extends BaseTest{
	@Test
	public void importEmployeeCSVFile() throws InterruptedException {
		DashboardPage dppage=new DashboardPage(driver);
		dppage.clickPIM_Menu();
		PIM_Configuration_DataImport configPIM=new PIM_Configuration_DataImport(driver);
		configPIM.clickConfig();
		PIM_CSV_Data_Import csv=new PIM_CSV_Data_Import(driver);
		
		Thread.sleep(10000);
		csv.Import_csvFile();
		csv.clickUpload();
		dppage.clickEmpList_Menu();
		EmpInfoPage empPage=new EmpInfoPage(driver);
		empPage.verifyEmpNotPresent("2");
		
//		driver.findElement(By.id("menu_pim_Configuration")).click();
//		
//		driver.findElement(By.id("menu_admin_pimCsvImport")).click();
//		driver.findElement(By.id("pimCsvImport_csvFile")).sendKeys("E:\\Workspace3\\HRMA\\data\\importData.csv");
//		driver.findElement(By.id("btnSave")).click();
	}
}