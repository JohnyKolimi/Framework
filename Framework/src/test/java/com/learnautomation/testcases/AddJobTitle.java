package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.HomePageHRM;
import com.learnautomation.pages.LoginPage;

public class AddJobTitle extends BaseClass {

	@Test(priority = 1)
	public void addJobTitle() throws InterruptedException
	{		
		logger=report.createTest("Login to HRM");
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginpage.loginToHRM(excel.getStringData("Login", 0, 0), excel.getStringData(0, 0, 1));
		
		logger.pass("Login success");
		
		HomePageHRM homePage=PageFactory.initElements(driver, HomePageHRM.class);
		
		mouseHover(homePage.Admin,driver);
		Thread.sleep(3000);
		mouseHover(homePage.Job,driver);
		Thread.sleep(3000);
		clickBtn(homePage.JobTitles);
				
		
	}
		
}
