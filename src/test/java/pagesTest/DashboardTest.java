package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.Dashboard;

public class DashboardTest extends BaseClass {

	/*
	 * Test the methods from home page
	 */

	@Test
	public void dashboard_page_validation_Test() {
		login.loginSteps();
		dashboard.dashboard_page_validation();
		login.loginForDashboardEasy();

	}

//	@Test
//	public void profileOnDashBoardTest() {
//		dashboard.profileOnDashboard();
//	}
//	@Test
//	public void addCourseOnDashBoard() {
//		dashboard.addCourseOnDashboard();
//	}
//	@Test
//	public void quizListTest() {
//		dashboard.quizListOnDashboard();
//	}
//	@Test
//	public void homeWorkTest() {
//		dashboard.homeWorkOnDashboard();
//	}
//	@Test
//	public void coddingChallengeTest() {
//		dashboard.coddingChallengeOnDashboard();
//	}
//	@Test
//	public void examTest() {
//		dashboard.examOnDashboard();
//	}
//	@Test
//	public void bootCampTest() {
//		dashboard.bootCampOnDashboard();
//	}
//	@Test
//	public void classNoteTest() {
//		dashboard.classNoteOnDashboard();
//	}
//	@Test
//	public void  classScheduleTest() {
//		dashboard.classScheduleOnDashboard();
//	}
//	@Test
//	public void  joinTheClassTest() {
//		dashboard.joinTheClassOnDashboard();
//	}
//	@Test
//	public void  classRecordingTest() {
//		dashboard.classRecordingOnDashboard();
//	}
//	@Test
//	public void  othersTest() {
//		dashboard.othersOnDashboard();
//	}
//	@Test
//	public void  automationTest() {
//		dashboard.automationOnDashboard();
//	}
//	@Test
//	public void  enrollNowAutomationTest() {
//		dashboard.enrollNowOnAutomation();
//	}
	@Test
	public void aside_elements_on_dashBoard_validation_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.aside_elements_On_dashboard_validation();
	}

	@Test
	public void automation_validation_on_dashboard_page_with_enroll_now_test() {

		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
	}

	@Test
	public void first_name_validation_on_enroll_now_page_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.first_name_validation_on_enroll_now();
	}

	@Test
	public void middle_name_validation_on_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.middle_name_validation_on_enroll_now_page();
	}

	@Test
	public void last_name_validation_on_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.last_name_validation_On_enrollNow();
	}

	@Test
	public void select_profession_dropdown_validation_on_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.select_profession_dropdown_validation_on_enroll_now();
	}

	@Test
	public void select_course_dropdown_on_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.select_course_dropdown_validation_on_enroll_now();
	}

	@Test
	public void select_phone_number_on_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.phone_number_validation_on_enroll_now();
	}

	@Test
	public void email_address_validation_on_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.email_address_validation_on_enroll_now();
		
	}

	@Test
	public void password_validation_on_enroll_now() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.password_validation_on_enroll_now();
	}

	@Test
	public void choose_gender_validation_on_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.choose_gender_validation_in_enroll_now();
	}

	@Test
	public void choose_imageFile_validation_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.choose_ImageFile_validation_on_enroll_now();
	}

	@Test
	public void choose_PhotoID_File_validation_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.choose_PhotoID_file_validation_on_enroll_now();
	}

	@Test
	public void  birthYearDropdownEnrollnowTest() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.birth_year_dropdown_in_enroll_now();
		
	}
	@Test
	public void  birthMonthDropdownEnrollnowTest() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.birthMonthDropdown();
		
	}
	@Test
	public void birthYearBirthMonthBirthDateDropdownTest() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.birthYear_birthMonth_birthDate_dropdown_in_Enroll_now();

	}

	@Test
	public void address_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.address_validation_on_enroll_now();

	}

	@Test
	public void city_validation_in_enroll_now() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.city_validation_in_enroll_now();
	}

	@Test
	public void state_dropdown_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.state_dropdown_validation_in_enroll();

	}

	@Test
	public void zip_code_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.zip_code_validation_in_Enroll_now();

	}

	@Test
	public void immigration_status_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.immigration_status_validation_in_enroll();

	}

	@Test
	public void arrival_date_validation_in_enroll_now_est() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.arrival_date_validation_in_enroll_now();

	}

	@Test
	public void emergency_contact_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.ememergencey_contact_validation_in_enroll_now();

	}

	@Test
	public void how_did_you_know_us_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.how_did_you_know_validation_in_enroll_now();

	}

	@Test
	public void highest_edu_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.highest_edu_validation_in_enroll_now();

	}

	@Test
	public void origin_country_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.origin_country_validation_in_enroll_now();

	}

	@Test
	public void primary_language_mouse_hover_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.primary_language_mousehover_validation_in_enroll_now();
	}

	@Test
	public void signature_validation_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.signature_validation_in_enroll_now();
	}

	@Test
	public void terms_and_condition_in_enroll_now_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.terms_and_condition_validation_enroll_now();
	}

	@Test
	public void submit_button_validation_in_enroll_test() {
		login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.submit_button_validation_in_enroll_now();
	}
	@Test
	public void right_click_action_validation_in_enroll_test() {
	    login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.right_click_action_validation_enroll_now();
	}
	@Test
	public void happy_path_Enroll_now_direct_to_regiestration_complete_test() {
	    login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.happy_path_enroll_now_dircet_to_registration_complete();
	}
	@Test
	public void all_required_field_validation_and_error_From_enroll_now_page_test() {
	    login.loginWithClickLoginFromHomePage();
		dashboard.automation_validation_on_dashboard_page_with_enroll_now();
		dashboard.all_required_field_validation_and_error_From_enroll_now_page();
	}
}