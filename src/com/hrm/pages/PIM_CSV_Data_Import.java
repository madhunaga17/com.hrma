package com.hrm.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.AutomationConstants;
import com.hrm.base.BasePage;

public class PIM_CSV_Data_Import extends BasePage{
	public PIM_CSV_Data_Import(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="pimCsvImport_csvFile")
	private WebElement Import_csvFile;
	
	
	@FindBy(id="btnSave")
	private WebElement clickUpload;
	
	
	public void Import_csvFile()
	{
//		Import_csvFile.sendKeys(INPUT_PATH2);
//		Import_csvFile.sendKeys("./data/importData.csv");
		String path2=FileUtils.getFile(AutomationConstants.INPUT_PATH2).getAbsolutePath();
		Import_csvFile.sendKeys(path2);
	}
	
	public void clickUpload() throws InterruptedException
	{
		Thread.sleep(3000);
		clickUpload.click();
	}

}
