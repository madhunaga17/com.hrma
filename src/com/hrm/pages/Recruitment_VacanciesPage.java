package com.hrm.pages;

import generics.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hrm.base.BasePage;

public class Recruitment_VacanciesPage extends BasePage{

	public Recruitment_VacanciesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//h1[.='Vacancies']")
	private WebElement vacanciesHeader;
	
	
	public void moveToVacancies(){
		Utility.moveToElement(driver, vacanciesHeader);
	}
	
	
	@FindBy(id="tiptip_holder")
	private WebElement tooltip;
	
	
	public void verifyToolTip(String eTTText){
		verifyElementIsPresentOrNot(tooltip);
		String aTTText=tooltip.getText();
		System.out.println(aTTText);
		Assert.assertEquals(aTTText, eTTText);
	}
}
