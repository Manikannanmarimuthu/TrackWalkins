package com.mvitech.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvitech.qa.base.BaseClass;

public class LoginPage extends BaseClass {

	// Page Factory - OR:
	@FindBy(xpath = "//input[@placeholder='Enter email address']")
	private WebElement eleUserName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement elePassword;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	private WebElement eleSignIn;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd) {
		type(eleUserName, un);
		type(elePassword, pwd);
		click(eleSignIn);
		return new HomePage();
	}

}
