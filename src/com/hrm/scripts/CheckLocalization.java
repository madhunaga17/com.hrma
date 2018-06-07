package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.LocalizationPage;
import com.hrm.pages.LocalizitPage;
import com.hrm.pages.SystemUserPage;

public class CheckLocalization extends BaseTest {
	
	@Test
	public void testCheckLocalization() throws InterruptedException
	{
		DashboardPage dbPage= new DashboardPage(driver);
		dbPage.clickAdmin_Menu();
		
		SystemUserPage suPage = new SystemUserPage(driver);
		suPage.clickLocalization();
		
		LocalizationPage lzPage =new LocalizationPage(driver);
		lzPage.clickLangFont_Help();
		String currentWH= driver.getWindowHandle();
		
		lzPage.switchBrowser();
		
			LocalizitPage lcPage = new LocalizitPage(driver);
			lcPage.verifyTargetListboxIsSorted();
			lcPage.closeBrowser();
			
			
			driver.switchTo().window(currentWH);
		
				
		
		
	}
	

}
