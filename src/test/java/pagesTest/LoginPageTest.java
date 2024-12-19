package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class LoginPageTest extends BaseClass {
	
	/*
	 Test the methods from home page
	 */
	@Test
	public void loginTest() {
		
		login.clickLogin();
	}
	@Test
	public void loginStepsTest() {
		login.loginSteps();
	}
	
}