package com.mvitech.qa.stepdefinition;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.mvitech.qa.base.BaseClass;
import com.mvitech.qa.pages.HomePage;
import com.mvitech.qa.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;

	@Before
	@Given("^user is already available on login page$")
	public void user_is_already_on_Login_Page() {
		BaseClass.initialization();
	}

	@After
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}

	@When("^User is on login page verify login page title$")
	public void title_of_login_page_is_Web_admin() {
		loginPage = new LoginPage();
		String loginpageTitle = loginPage.validateLoginPageTitle();
		System.out.println("Login Page title is" + loginpageTitle);
		Assert.assertEquals(loginpageTitle, "walkins");
	}

	@Given("^user enter\"(.*)\"and\"(.*)\"and clicks on the login button$")
	public void enter_username_as_valid_mail_id(String username, String pwd) {
		homePage = loginPage.login(username, pwd);
	}

	@Then("^Verify Homepage title$")
	public void displays_Homepage() {
		String homePageTitle = homePage.validateHomePageTitle();
		System.out.println("Home Page Title is  " + homePageTitle);
		Assert.assertEquals(homePageTitle, "walkins");
	}

	@Then("^Verify the error message$")
	public void verify_errorMessage() {
		 Alert simpleAlert = driver.switchTo().alert();
		 String alertText = simpleAlert.getText();
		 System.out.println("Alert text is " + alertText);
		 simpleAlert.accept();
	}
}
