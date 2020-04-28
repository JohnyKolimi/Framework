package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHRM {

	WebDriver driver;
	
	public HomePageHRM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Mail menu elements
	
	@FindBy(id="menu_pim_viewPimModule") public WebElement Admin;
	
	
	// Sub menu elements
	
	@FindBy(id="menu_admin_Job") public WebElement Job;
	
	// Mouse hover items
	
	@FindBy(xpath="//a[text()='Job Titles']") public WebElement JobTitles;
	
	// Other elements on page
	
	@FindBy(id="btnAdd") public WebElement JobTitle_Add;
	@FindBy(id="btnDelete") public WebElement JobTitle_Delete;
	@FindBy(id="jobTitle_jobTitle") public WebElement JobTitle_Title;
	@FindBy(id="jobTitle_jobDescription") public WebElement JobTitle_Description;
	@FindBy(id="jobTitle_jobDescription") public WebElement JobTitle_Save;

	

	
	
	
	
	
}
