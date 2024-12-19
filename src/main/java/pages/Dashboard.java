package pages;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

import static common.CommonActions.*;
import static common.CommonWaits.*;
import static pages.Login.*;
//import static pages.HomePage.*;

public class Dashboard {
	/*
	 * Test 1) Click Return Site, validate Homepage again Test 2) click on profile
	 * photo and logout to see you can logout Test 3) Test all aside element except
	 * "Automation", When they redirect, please validate title, current url and
	 * header if present. Test 4) Click Automation and go to form, When they
	 * redirect, please validate title, current url and header, sub header etc if
	 * present.
	 * 
	 * Test 5) Each field should be separtely tested based on requirement Test 6)
	 * Submit without any data Test 7) test back button Test 8) test cancel button
	 * Test 9) Submit with all data (happy path), validate success message
	 * 
	 */
	WebDriver driver;
	WebDriverWait wait;
	Login login;
	// HomePage homePage;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		login = new Login(driver);
		// homePage = new HomePage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//a[text()='Return site']")
	// "//a[contains(text(), 'Return site')]"
	WebElement returnSite;
	@FindBy(xpath = "//a[@id='dashboard-link']")
	WebElement dashboard;
	// @FindBy(xpath = "//*[@id=\"main\"]/div[1]/nav/ul[1]/li[2]/a/img")

	@FindBy(xpath = "//img[@class='avatar-rounded']")
	WebElement imageOnDashboard;
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logout;
	@FindBy(xpath = "//h1[text()= 'Dashboard']")
	WebElement headerDashboardElement;
	@FindBy(css = "#HomeworkChart > div > canvas:nth-child(2)")
	WebElement headTOtoeElement;
	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;
	@FindBy(xpath = "//a[@id='home-tab']")
	WebElement profile2ForValidation;
	@FindBy(xpath = "//span[text()='Add Course']")
	WebElement addCourse;
	@FindBy(xpath = "//h1[text()='Enroll Course']")
	WebElement enrollCourseValidation;
	@FindBy(xpath = "//span[text()='Quiz List']")
	WebElement quizList;
	@FindBy(xpath = "//span[text()='Home Work']")
	WebElement homeWork;
	@FindBy(xpath = "//span[text()='Homework List']")
	WebElement homeWorkListValidation;
	@FindBy(xpath = "//span[text()='Codding Challenge']")
	WebElement coddinChallenge;
	@FindBy(xpath = "//span[text()='Coding Challenge List']")
	WebElement coddingChallengeValidation;
	@FindBy(xpath = "//span[text()='Exam']")
	WebElement exam;
	@FindBy(xpath = "//span[text()='Exam List']")
	WebElement examValidation;
	@FindBy(xpath = "//span[text()='Bootcamp']")
	WebElement bootCamp;
	@FindBy(xpath = "//span[text()='Bootcamp List']")
	WebElement bootCampValidation;
	@FindBy(xpath = "//span[text()='Class Notes']")
	WebElement classNote;
	@FindBy(xpath = "//h1[text()='Class Note List']")
	WebElement classNoteListvalidation;
	@FindBy(xpath = "//span[text()='Class Schedule']")
	WebElement classSchedule;
	@FindBy(xpath = "//h1[text()='Class Calendar']")
	WebElement classCalendarvalidation;
	@FindBy(xpath = "//span[text()='Join The Class']")
	WebElement joinTheClass;
	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement meetingListvalidation;
	@FindBy(xpath = "//span[text()='Class recording']")
	WebElement classRecording;
	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement meetingList1validation;
	@FindBy(xpath = "//span[text()='Others']")
	WebElement others;
	@FindBy(xpath = "//h1[text()='Others']")
	WebElement othersValidation;
	public void dashboardLandingNecessary() {
		pause(4000);
		dashboardValidation();
		clickElementThenTab(dashboard);

	}

	public void returnSiteClick() {
		clickElement(returnSite);

	}

	public void dashboardValidation() {
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
	}

	public void homePageValidation() {
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT");

	}

	public void ClickOnDashboard() {
		clickElement(dashboard);

	}

	public void clickOnImage() {
		clickElement(imageOnDashboard);

	}

	public void clickLogout() {
		clickElement(logout);

	}

	public void allAboutDashboard() {
		pause(2000);
		login.loginSteps();
		pause(2000);
		returnSiteClick();
		pause(2000);
		homePageValidation();
		ClickOnDashboard();
		pause(1000);
		clickOnImage();
		pause(2000);
		clickLogout();
		login.loginForDashboardEasy();

	}

	public void profileOnDashboard() {
		// homePage.homePageLogoValidation();
		login.loginWithClickLoginFromHomePage();
		clickElement(profile);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/profile/");
		verifyTextOfTheWebElement(profile, "Profile");
		verifyTitle(driver, "Enthrall IT - Dashboard");

	}

	public void addCourseOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(2000);
		clickElement(addCourse);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/enroll/course/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		// validationOfHeader(addCourse, "Enroll Course");
		verifyTextOfTheWebElement(addCourse, "Enroll Course");
	}

	public void quizListOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(quizList);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/qz/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(quizList, "Quiz List");

	}

	public void homeWorkOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(homeWork);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/hw/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(homeWorkListValidation, "Homework List");

	}

	public void coddingChallengeOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(coddinChallenge);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/cc/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(coddingChallengeValidation, "Coding Challenge List");

	}

	public void examOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(exam);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/exam/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(examValidation, "Exam List");

	}

	public void bootCampOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(bootCamp);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/bt/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(bootCampValidation, "Bootcamp List");

	}

	public void classNoteOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(classNote);
		verifyCurrentUrl(driver, "https://enthrallit.com/modules/class/note/list/#class_note");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(classNoteListvalidation, "Class Note List");

	}

	public void classScheduleOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(classSchedule);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(classCalendarvalidation, "Class Calendar");

	}

	public void joinTheClassOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(joinTheClass);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/next-class/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(meetingListvalidation, "Meeting List");

	}
	public void classRecordingOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(classRecording);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/recording/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(meetingList1validation, "Meeting List");

	}
	public void othersOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(others);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/others/list/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(othersValidation, "Others");

	}
}
