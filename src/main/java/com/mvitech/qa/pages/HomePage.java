package com.mvitech.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.mvitech.qa.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

}
