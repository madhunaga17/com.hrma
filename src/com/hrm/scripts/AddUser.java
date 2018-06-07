package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.SystemUserPage;
import com.hrm.pages.UserManagement_User_AddUserPage;

public class AddUser extends BaseTest{
	@Test		
		public void testCase2() throws InterruptedException
		{
			DashboardPage dPage = new DashboardPage(driver);
			dPage.clickAdmin_Menu();
			SystemUserPage suPage=new SystemUserPage(driver);
			suPage.clickUsers();
			suPage.clickAddEmployee();
			UserManagement_User_AddUserPage umPage=new UserManagement_User_AddUserPage(driver);
			umPage.addUser("Manager", "Madhu");
		}
}
