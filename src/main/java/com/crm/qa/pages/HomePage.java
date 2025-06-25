package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User:Naveen K')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLinks;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLinks;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLinks;
	
	
	//Initializing the Page Objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
	public String verifyHomePageTitle() {
		 return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsLinks.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLinks() {
		dealsLinks.click();
		return new DealsPage();
	}
	
	public DealsPage clickOnTasksLinks() {
		tasksLinks.click();
		return new DealsPage();
	}
		

}
