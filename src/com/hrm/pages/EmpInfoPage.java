 package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class EmpInfoPage extends HomePage{
	
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(id="empsearch_job_title")
	private WebElement jobTitleListBox;
	
	@FindBy(id="empsearch_termination")
	private WebElement includeListBox;
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement popUpOk;
	
	@FindBy(id="ohrmList_chkSelectAll")
	private WebElement selectAllCheckBox;
	
	@FindBy(xpath="//td[text()='No Records Found']")
	private WebElement deleteMsg;
	
	public EmpInfoPage(WebDriver driver) {
		super(driver);
		
	}
	
		
	public void verifySearchBtnPresent()
	{
		log.info("Verify that the search button is present");
		verifyElementIsPresent(searchBtn);
	}
	
	public void verifyJobTitleIsSorted()
	{
		log.info("Verify that the JobTitle List Box is sorted");
		verifyListBoxIsSorted(jobTitleListBox,1);
		log.info("ListBox content is sorted");
	}
	
	public void verifyJobTitleHasNoDuplicate()
	{
		log.info("Verify that the JobTitle List Box has no duplicate");
		verifyListBoxHasNoDuplicate(jobTitleListBox,1);// so as to exclude first option here
		log.info("List Box has no duplicate");
	}
	
	public void verifyIncludeListBoxHasNoDuplicate()
	{
		log.info("Verify that the Include List Box has no duplicate");
		verifyListBoxHasNoDuplicate(includeListBox,0);// so as to include first option here
		log.info("List Box has no duplicate");
	}
	
	public void verifyIncludeListBoxIsSorted()
	{
		log.info("Verify that the Include List Box is sorted");
		verifyListBoxIsSorted(includeListBox,0);// so as to include first option here
		log.info("ListBox content is sorted");
	}
	
	public void selectEmpCheckBox(String empID)
	{
		String xp="//a[text()='"+empID+"']/../..//input[@type='checkbox']";
		driver.findElement(By.xpath(xp)).click();
		
	}
	
	public void selectAllEmpCheckBox()
	{
		selectAllCheckBox.click();
		
	}
	
	public void clickDelete()
	{
		btnDelete.click();
	}
	
	public void clickOK()
	{
		popUpOk.click();
	}
	
	public void verifyEmpNotPresent(String empID)
	{
		By loc =By.xpath("//a[text()='"+empID+"']");
		verifyElementIsNotPresent(loc);
		
	}
	
	public void verifyAllEmpDeleted()
	{
		verifyElementIsPresent(deleteMsg);
	}
	

}
