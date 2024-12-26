package pages;

import java.io.File;
//import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

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

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;
	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement automationValidation;
	@FindBy(xpath = "//h1[@class='sub-title']")
	WebElement subTitleHeaderValidation;
	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enrollNow;
	@FindBy(xpath = "//h3[text()='Select your course from the dropdown']")
	WebElement headerOfEnrollNow;
	@FindBy(xpath = "//h5[text()='Please enter your personal and contact information.']")
	WebElement subHeaderOfEnrollNow;
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstNameOfEnroll;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement fNameAlphabeticError;
	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement fNameRequiredError;
	@FindBy(xpath = "//input[@name='m_name']")
	WebElement mNameOfEnrollNoW;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement mNameRequiredError;
	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lastNameOfEnrollNow;
	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lNameRequiredField;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement lNameAlphabaticError;
	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;
	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> selectProfessionList;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement selectProfessionRequiredError;
	@FindBy(xpath = "//select[@name='course_wish_to_enroll']")
	WebElement selectCourse;
	@FindBy(xpath = "//select[@name='course_wish_to_enroll']/option")
	List<WebElement> selectCourseList;
	@FindBy(xpath = "//small[@id='course_wish_error']")
	WebElement selectCourseRequiredError;
	@FindBy(xpath = "//option[text()='Python']")
	WebElement selectPython;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNumInEnrollNow;
	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement phoneNumRequriedfeild;
	@FindBy(xpath = "//small[text()='Phone Number must be exactly 10 digits.']")
	WebElement phoneNumberError;
	@FindBy(xpath = "//input[@name='image']")
	WebElement chooseImageInEnrollNow;
	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement imageRequiredFieldElement;
	@FindBy(xpath = "//input[@name='photo_id']")
	WebElement choosePhotoID;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailInEnrollNow;
	@FindBy(xpath = "//span[text()='Email Address is a required field.']")
	WebElement emailRequiredField;
	@FindBy(xpath = "//span[text()='Must be a valid Email Address.']")
	WebElement emailMustBeValid;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passwordEnrollNow;
	@FindBy(xpath = "//span[text()='Password is a required field.']")
	WebElement passwordRequiredFeild;
	@FindBy(xpath = "//span[text()='Please refer to Password requirements.']")
	WebElement passwordReferRequirements;
	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement chooseGender;
	@FindBy(xpath = "//select[@id='id_gender']/option")
	List<WebElement> chooseSexElements;
	@FindBy(xpath = "//option[text()='Female']")
	WebElement femaleInGender;
	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYearDropDown;
	@FindBy(xpath = "//option[text()='1966']")
	WebElement selectBirthYear;
	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement birthYearRequiredFieldElement;
	@FindBy(xpath = "//select[@id='id_birth_month']")
	WebElement birthMonthInEnrollNow;
	@FindBy(xpath = "//select[@id='id_birth_month']/option")
	List<WebElement> birthMonthDropList;
	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement birthMonthRequiredFieldElement;
	@FindBy(xpath = "//select[@id='id_birth_date']")
	WebElement birthDateInEnrollNow;
	@FindBy(xpath = "//select[@id='id_birth_date']/option")
	List<WebElement> birthDateList;
	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birthDateRequired;
	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement addressInEnrollNow;
	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement addressRequiredField;
	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement address2InEnrollNow;
//	@FindBy(xpath = "//span[text()='Home Address Line 2 is a required field.']")
//	WebElement address2RequiredField;
	@FindBy(xpath = "//input[@name='city']")
	WebElement cityInEnrollNow;
	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityRequiredField;
	@FindBy(xpath = "//select[@name='state']")
	WebElement stateInEnrollNow;
	@FindBy(xpath = "//select[@name='state']/option")
	List<WebElement> stateDropdownList;
	@FindBy(xpath = "//span[text()='State is a required field.']")
	WebElement stateRequiredField;
	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCodeInEnrollNow;
	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement immigrationStatus;
	@FindBy(xpath = "//select[@name='immigration_status']/option")
	List<WebElement> immigrationStatusList;
	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement arrivalDate;
	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement emergencyContact;
	@FindBy(xpath = "//span[@id='emergency_contact_error']")
	WebElement emergencyContactError;
	@FindBy(xpath = "//input[@name='know_us']")
	WebElement howDidYouKnowUs;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highestEdu;
	@FindBy(xpath = "//select[@id='id_highest_education']/option")
	List<WebElement> highestEduList;
	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement originCountry;
	@FindBy(xpath = "//input[@id='selected_language']")
	WebElement selectLanguage;
	@FindBy(xpath = "//div[text()='Bengali']")
	WebElement languageBangali;
	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement signatureInEnroll;
	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement signatureRequired;
	@FindBy(xpath = "//span[text()='Please provide your full name as above']")
	WebElement fullNameError;
	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement doubleClickInEnroll;
	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitButton;

/////////////////////------methods--------/////////////////////////////
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

	public void automationOnDashboard() {
		login.loginWithClickLoginFromHomePage();
		pause(1000);
		clickElement(automation);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyTextOfTheWebElement(automationValidation, "Automation");
		validationOfSubHeader(subTitleHeaderValidation, "Please choose from below");
//		pause(1000);
//		clickElement(enrollNow);
//		switchToChildWindow(driver, automation, enrollNow);
//		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");

	}

	public void enrollNowOnAutomation() {
		automationOnDashboard();
		pause(1000);
		clickElement(enrollNow);
		switchToChildWindow(driver, automation, enrollNow);
		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
		validationOfHeader(headerOfEnrollNow, "Select your course from the dropdown");
		validationOfSubHeader(subHeaderOfEnrollNow, "Please enter your personal and contact information.");

	}

	public void firstNameOfEnroll() {

		enrollNowOnAutomation();
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(2000);
		clickElement(firstNameOfEnroll);
		verifyLengthOfTheFieldContent(firstNameOfEnroll, Attribute.MAX_LENGTH, "20");
		pause(1000);
		inputTextThenClickTab(firstNameOfEnroll, "12345");
		verifyErrorMessageUnderTheField(fNameAlphabeticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		inputTextThenClickTab(firstNameOfEnroll, "#%^&()@#");
		verifyErrorMessageUnderTheField(fNameAlphabeticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		clearTextFromTheField(firstNameOfEnroll);
		verifyErrorMessageUnderTheField(fNameRequiredError, Attribute.INNER_HTML, "First Name is a required field.");
		inputTextThenClickTab(firstNameOfEnroll, "venu-'Gopal Ayyar");
		pause(2000);

	}

	public void middleNameOnEnrollNow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElement(mNameOfEnrollNoW);
		verifyErrorMessageUnderTheField(mNameOfEnrollNoW, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(mNameOfEnrollNoW, "1234");
		verifyErrorMessageUnderTheField(mNameRequiredError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		clearTextFromTheField(mNameOfEnrollNoW);
		pause(1000);
		inputTextThenClickTab(mNameOfEnrollNoW, "hello");
		pause(2000);
	}

	public void LastNameOnEnrollNow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		pause(2000);
		clickElement(lastNameOfEnrollNow);
		verifyErrorMessageUnderTheField(lastNameOfEnrollNow, Attribute.MAX_LENGTH, "25");
		clickElementThenTab(lastNameOfEnrollNow);
		verifyErrorMessageUnderTheField(lNameRequiredField, Attribute.INNER_HTML, "Last Name is a required field.");
		inputTextThenClickTab(lastNameOfEnrollNow, "!@#$2344");
		verifyErrorMessageUnderTheField(lNameAlphabaticError, Attribute.INNER_HTML, "Must be alphabetic characters.");
		inputTextThenClickTab(lastNameOfEnrollNow, "Hi");
		pause(2000);
	}

	public void selectProfessionDropdown() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(selectProfession);
		verifyErrorMessageUnderTheField(selectProfessionRequiredError, Attribute.INNER_HTML,
				"I'm is a required field.");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selectProfessionList);
		selectDropdown(selectProfession, "a Student");
		pause(2000);

	}

	public void selectCourseDropdown() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		// clickElement(selectCourse);
		pause(2000);
		clickElementThenTab(selectCourse);
		verifyErrorMessageUnderTheField(selectCourseRequiredError, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		pause(2000);
		clickElement(selectCourse);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		clickElement(selectCourse);
		clickElement(selectPython);
		pause(2000);

	}

	public void phoneNumInEnrollNowPage() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(phoneNumInEnrollNow);
		verifyErrorMessageUnderTheField(phoneNumRequriedfeild, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		clickElement(phoneNumInEnrollNow);
		inputTextThenClickTab(phoneNumInEnrollNow, "abhshsj");
		verifyErrorMessageUnderTheField(phoneNumberError, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		clearTextFromTheField(phoneNumInEnrollNow);
		pause(2000);
		inputTextThenClickTab(phoneNumInEnrollNow, "0125467");
		pause(2000);
	}

	public void emailAddressEnrollNow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(emailInEnrollNow);
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Email Address is a required field.");
		clickElement(emailInEnrollNow);
		pause(2000);
		inputTextThenClickTab(emailInEnrollNow, "#$$%!123dfgghg");
		verifyErrorMessageUnderTheField(emailMustBeValid, Attribute.INNER_HTML, "Must be a valid Email Address.");
		pause(2000);
		clearTextFromTheField(emailInEnrollNow);
		inputTextThenClickTab(emailInEnrollNow, "ruby345@gmail.com");
		pause(3000);
	}

	public void passwordInEnrollNow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(passwordEnrollNow);
		verifyErrorMessageUnderTheField(passwordRequiredFeild, Attribute.INNER_HTML, "Password is a required field.");
		inputTextThenClickTab(passwordEnrollNow, "@$%^1234dhhdjdj");
		verifyErrorMessageUnderTheField(passwordReferRequirements, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordEnrollNow);
		inputTextThenClickTab(passwordEnrollNow, "Password$1234");
		pause(3000);
	}

	public void chooseGenderInEnrollNow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		pause(1000);
		selectElelementFromDropdownOnebyOne(chooseGender, chooseSexElements);
		pause(2000);
		selectDropdown(chooseGender, "Female");
		pause(2000);
	}

	public void chooseImageFile() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		uploadPhotoImage(chooseImageInEnrollNow, "./image/personalImage.jpg");

	}

	public void choosePhotoID() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		uploadPhotoImage(choosePhotoID, "./image/photoid.png");

	}

	public void birthYearDropDownInEnrollnow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(birthYearDropDown);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		clickElement(birthYearDropDown);
		pause(2000);
		selectDropdown(birthYearDropDown, "1966");
		pause(3000);

	}

	public void birthMonthDropdown() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(birthMonthInEnrollNow);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		selectElelementFromDropdownOnebyOne(birthMonthInEnrollNow, birthMonthDropList);
		pause(3000);
		selectDropdown(birthMonthInEnrollNow, "April");
		pause(2000);
	}

	public void birthYearBirthMonthBirthDateDropdown() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(birthYearDropDown);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		clickElement(birthYearDropDown);
		pause(2000);
		selectDropdown(birthYearDropDown, "1966");
		pause(1000);

		clickElementThenTab(birthMonthInEnrollNow);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		selectElelementFromDropdownOnebyOne(birthMonthInEnrollNow, birthMonthDropList);
		pause(3000);
		selectDropdown(birthMonthInEnrollNow, "April");
		pause(1000);

		clickElementThenTab(birthDateInEnrollNow);
		verifyErrorMessageUnderTheField(birthDateRequired, Attribute.INNER_HTML, "Birth Date is a required field.");
		clickElement(birthDateInEnrollNow);
		selectElelementFromDropdownOnebyOne(birthDateInEnrollNow, birthDateList);
		pause(2000);
		selectDropdown(birthDateInEnrollNow, "10");
		pause(2000);
	}

	public void addressEnroll() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(addressInEnrollNow);
		verifyErrorMessageUnderTheField(addressRequiredField, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		verifyErrorMessageUnderTheField(addressInEnrollNow, Attribute.MAX_LENGTH, "60");
		pause(2000);
		inputTextThenClickTab(addressInEnrollNow, "AbcdefghijKlanop");
		pause(2000);

		clickElementThenTab(address2InEnrollNow);
		// verifyErrorMessageUnderTheField(address2RequiredField, Attribute.INNER_HTML,
		// "Home Address Line 2 is a required field.");
		verifyLengthOfTheFieldContent(address2InEnrollNow, Attribute.MAX_LENGTH, "65");
		pause(1000);
		clickElement(address2InEnrollNow);
		pause(2000);
		inputTextThenClickTab(address2InEnrollNow, "ABCDEFGHIJKLMNOP");
	}

	public void cityInEnroll() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(cityInEnrollNow);
		verifyErrorMessageUnderTheField(cityRequiredField, Attribute.INNER_HTML, "City is a required field.");
		verifyLengthOfTheFieldContent(cityInEnrollNow, Attribute.MAX_LENGTH, "30");
		pause(2000);
		inputTextThenClickTab(cityInEnrollNow, "Hill");

	}

	public void stateDropdownInEnroll() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(stateInEnrollNow);
		verifyErrorMessageUnderTheField(stateRequiredField, Attribute.INNER_HTML, "State is a required field.");
		clickElement(stateInEnrollNow);
		pause(2000);
		selectDropdown(stateInEnrollNow, "Hawaii");

	}

	public void zipCodeInEnroll() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElement(zipCodeInEnrollNow);
		verifyLengthOfTheFieldContent(zipCodeInEnrollNow, Attribute.MAX_LENGTH, "5");
		inputTextThenClickTab(zipCodeInEnrollNow, "65432");
		pause(1000);

	}

	public void immigrationStatusInenroll() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		pause(1000);
		selectElelementFromDropdownOnebyOne(immigrationStatus, immigrationStatusList);
		pause(1000);
		selectDropdown(immigrationStatus, "Citizen");

	}

	public void arrivalDateInEnrollNow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElement(arrivalDate);
		verifyLengthOfTheFieldContent(arrivalDate, Attribute.MAX_LENGTH, "100");
		inputTextThenClickTab(arrivalDate, "20thDecember2024");
		pause(3000);

	}

	public void ememergenceyContact() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();

		clickElement(emergencyContact);
		inputTextThenClickTab(emergencyContact, "2345677877");
		pause(2000);

	}

	public void howDidYouKnow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		pause(2000);
		clickElement(howDidYouKnowUs);
		verifyLengthOfTheFieldContent(howDidYouKnowUs, Attribute.MAX_LENGTH, "500");
		inputTextThenClickTab(howDidYouKnowUs, "internet");

	}

	public void highestEduinenroll() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		selectElelementFromDropdownOnebyOne(highestEdu, highestEduList);
		pause(2000);
		selectDropdown(highestEdu, "Other");

	}

	public void originCountry() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElement(originCountry);
		selectDropdown(originCountry, "Bangladesh");
		pause(2000);

	}

	public void languageMousehover() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElement(selectLanguage);
		pause(3000);
		clickElement(languageBangali);
		pause(3000);

	}

	public void signatureInEnrollNow() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		clickElementThenTab(signatureInEnroll);
		verifyErrorMessageUnderTheField(signatureRequired, Attribute.INNER_HTML, "Signature is a required field.");
		inputTextThenClickTab(signatureInEnroll, "ruby");
		pause(2000);
		verifyErrorMessageUnderTheField(fullNameError, Attribute.INNER_HTML, "Please provide your full name as above");
		pause(1000);
		inputTextThenClickTab(signatureInEnroll, "rubyrubyruby");
		pause(2000);
	}

	public void doubleClick() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		pause(2000);
		clickElement(doubleClickInEnroll);

	}

	public void submitButton() {
		// driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enrollNowOnAutomation();
		pause(2000);
		clickElement(submitButton);

	}

}
