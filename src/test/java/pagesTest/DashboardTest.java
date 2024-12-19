package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.Dashboard;

public class DashboardTest extends BaseClass {
	
	/*
	 Test the methods from home page
	 */
	@Test
	public void returnSiteTest() {
		dashboard.returnSiteClick();
	}
	@Test
	public void dashboardValidation() {
		dashboard.homePageValidation();
		
	}
	@Test
	public void clickOnImageTest() {
		clickOnImageTest();
	}
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

}