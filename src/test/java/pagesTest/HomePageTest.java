package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.Login.*;

public class HomePageTest extends BaseClass {

	/*
	 * Test the methods from home page
	 */

	@Test
	public void logoTest() {
		homePage.homePageLogoValidation();
	}

	@Test
	public void titleTest() {
		homePage.homeTitleValidation();
	}

	@Test
	public void allTheHeaderMenuTest() {
		homePage.validationForAllHeaderMenu();
	}

	@Test
	public void allTheFooterMenuTest() {
		homePage.validationForAllFooterMenu();
	}

	@Test
	public void homePageMiddleValidationTest() {
		homePage.homePageDoYouHaveAnyQuestionValidations();
	}

	@Test
	public void homePageNumberAndEmilValidationTest() {
		homePage.homePagePhoneNumberandEmailValidation();
	}

	@Test
	public void homePageAllTest() {
		homePage.homePageAll();

	}

}