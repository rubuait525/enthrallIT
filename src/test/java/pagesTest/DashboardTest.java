package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.Dashboard;

public class DashboardTest extends BaseClass {
	
	/*
	 Test the methods from home page
	 */
//	@Test
//	public void returnSiteTest() {
//		dashboard.returnSiteClick();
//	}
//	@Test
//	public void dashboardValidation() {
//		dashboard.homePageValidation();
//		
//	}
//	@Test
//	public void clickOnImageTest() {
//		clickOnImageTest();
//	}
	
	
	////////////////Test////////////
	
	@Test
	public void allAboutDashboardTest() {
		dashboard.allAboutDashboard();
		
		
	}
	@Test
	public void profileOnDashBoardTest() {
		dashboard.profileOnDashboard();
	}
	@Test
	public void addCourseOnDashBoard() {
		dashboard.addCourseOnDashboard();
	}
	@Test
	public void quizListTest() {
		dashboard.quizListOnDashboard();
	}
	@Test
	public void homeWorkTest() {
		dashboard.homeWorkOnDashboard();
	}
	@Test
	public void coddingChallengeTest() {
		dashboard.coddingChallengeOnDashboard();
	}
	@Test
	public void examTest() {
		dashboard.examOnDashboard();
	}
	@Test
	public void bootCampTest() {
		dashboard.bootCampOnDashboard();
	}
	@Test
	public void classNoteTest() {
		dashboard.classNoteOnDashboard();
	}
	@Test
	public void  classScheduleTest() {
		dashboard.classScheduleOnDashboard();
	}
	@Test
	public void  joinTheClassTest() {
		dashboard.joinTheClassOnDashboard();
	}
	@Test
	public void  classRecordingTest() {
		dashboard.classRecordingOnDashboard();
	}
	@Test
	public void  othersTest() {
		dashboard.othersOnDashboard();
	}
	@Test
	public void  automationTest() {
		dashboard.automationOnDashboard();
	}
	@Test
	public void  enrollNowAutomationTest() {
		dashboard.enrollNowOnAutomation();
	}
	@Test
	public void  firstNameEnrollTest() {
		dashboard.firstNameOfEnroll();
	}
	@Test
	public void  middleNameEnrollTest() {
		dashboard.middleNameOnEnrollNow();
	}
	@Test
	public void  lastNameEnrollTest() {
		dashboard.LastNameOnEnrollNow();
	}
	@Test
	public void  selectProfessionDropdownTest() {
		dashboard.selectProfessionDropdown();
	}
	@Test
	public void  selectCourseDropdownTest() {
		dashboard.selectCourseDropdown();
	}
	@Test
	public void  selectphonenumberTest() {
		dashboard.phoneNumInEnrollNowPage();
	}
	@Test
	public void emailAddressEnrollNowTest() {
		dashboard.emailAddressEnrollNow();
	}
	@Test
	public void passwordInEnrollNowTest() {
		dashboard.passwordInEnrollNow();
	}
	@Test
	public void genderInEnrollNowTest() {
		dashboard.chooseGenderInEnrollNow();
	}
	@Test
	public void  chooseimageFileTest() {
		dashboard.chooseImageFile();
	}
	@Test
	public void  choosePhotoIDFileTest() {
		dashboard.choosePhotoID();
	}
//	@Test
//	public void  birthYearDropdownEnrollnowTest() {
//		dashboard.birthYearDropDownInEnrollnow();
//		
//	}
//	@Test
//	public void  birthMonthDropdownEnrollnowTest() {
//		dashboard.birthMonthDropdown();
//		
//	}
	@Test
	public void  birthYearBirthMonthBirthDateDropdownTest() {
		dashboard.birthYearBirthMonthBirthDateDropdown();
		
	}
	@Test
	public void  addressInEnrollnowTest() {
		dashboard.addressEnroll();
		
	}
	@Test
	public void  cityEnrollnowTest() {
		dashboard.cityInEnroll();
		
	}
	@Test
	public void  stateDropdownTest() {
		dashboard.stateDropdownInEnroll();
		
	}
	@Test
	public void  zipCodeTest() {
		dashboard.zipCodeInEnroll();
		
	}
	@Test
	public void  immigrationStatusTest() {
		dashboard.immigrationStatusInenroll();
		
	}
	@Test
	public void  arrivalDateTest() {
		dashboard.arrivalDateInEnrollNow();
		
	}
	@Test
	public void  emergencyContactTest() {
		dashboard.ememergenceyContact();
		
	}
	@Test
	public void  howDidYouKnowUsTest() {
		dashboard.howDidYouKnow();
		
	}
	@Test
	public void  highestEduTest() {
		dashboard.highestEduinenroll();
		
	}
	@Test
	public void  originCountryTest() {
		dashboard.originCountry();
		
	}
	@Test
	public void  primaryLanguageTest() {
		dashboard.languageMousehover();
		
	}
	@Test
	public void  signatureTest() {
		dashboard.signatureInEnrollNow();
	}
	@Test
	public void  doubleClickInEnrollTest() {
		dashboard.doubleClick();
	}
	@Test
	public void  submitButtonInEnrollTest() {
		dashboard.submitButton();
	}
	
}