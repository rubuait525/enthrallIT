package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.Login.*;

public class HomePageTest extends BaseClass {
	
	/*
	 Test the methods from home page
	 */
	
	@Test
	public void logoTest() {
		homePage.logoValidation();
	}
	
	@Test
	public void titleTest() {
		homePage.titleValidation();
	}
	
	@Test
	public void allTheHeaderMenuTest() {
		homePage.validationForAllHeaderMenu();
	}
	
	@Test
	public void allTheFooterMenuTest() {
		homePage.validationForAllFooterMenu();
	}
//	@Test
//	public void loginStepsTest() {
//		login.loginSteps();
//	}
	@Test
	public void homePageValidationTest() {
		homePage.homePageValidations();
	}

}