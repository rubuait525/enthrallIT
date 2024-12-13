package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;

public class HomePage {	
	/*
	 Create Constructor
	 Create Web Element	 
	 Create method to test
	 */
	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	
	@FindBy()
	WebElement loginButton;

	@FindBy()
	WebElement email;
		
	@FindBy()
	WebElement password;
	
	/*
	 1) is the logo displayed? - DONE
	 2) What is the title? - DONE
	 3) Header validation for rest: All the button like Home, courses, Mentors, Alumni, About Us, Login
	 enroll Now button, phone number, Id. You have to find out the web element and click them to see
	 if they are redirecting to the page. 
	 4) When they redirect, please validate title, current url and header if present.
	 5) Validate Footer for Home, courses, Mentors, Alumni, About Us, Login, enroll Now button
	 6) Scroll down and go to Contact Us. Create method for "fill out the form and submit, validate the success or error message" and test
	 */
	
	
	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logo;
	
	@FindBy(xpath = "//li[@name='home'and @id='home']")
	WebElement homeHeader;
	@FindBy(xpath = "//a[@id='home']")
	WebElement homeFooter;
	
	@FindBy(xpath = "(//a[text()='Courses'])[1]")
	WebElement courseHeader;
	@FindBy(xpath = "(//a[text()='Courses'])[2]")
	WebElement courseFooter;
	
	@FindBy(xpath = "//li[@id='mentors' and @name='mentors']")
	WebElement mentorHeader;
	@FindBy(xpath = "//a[@id='mentor']")
	WebElement mentorFooter;
	@FindBy(xpath = "(//a[text()='Alumni'])[1]")
	WebElement alumniHeader;
	@FindBy(xpath = "(//a[text()='Alumni'])[2]")
	WebElement alumniFooter;
	@FindBy(xpath = "//li[@id='about us']")
	WebElement aboutUsHeader;
	@FindBy(xpath = "//a[@id='about-us' and @name='about-us']")
	WebElement aboutUsFooter;
	@FindBy(xpath = "//a[@id='login-link']")
	WebElement loginlinkHeader;
	@FindBy(xpath = "//a[@id='login-link']")
	WebElement loginLinkFooter;
	@FindBy(xpath = "//h2[text()='Contact Us']")
	WebElement forScrolldownInhome;
	@FindBy(xpath = "//h2[text()='Do You Have Any Questions']")
	WebElement for_Do_You_have_any_questions;
	@FindBy(xpath = "//input[@name='name']")
	WebElement name_do_you_have_any_question;
	@FindBy(xpath = "//input[@id='id_email']")
	WebElement email_do_you_have_any_question;
	@FindBy(xpath = "//input[@name='subject']")
	WebElement subject_do_you_have_any_question;
	@FindBy (xpath = "//input[@name='experiance']")
	WebElement experiance_do_you_have_any_question;
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement message_do_you_have_any_question;
	@FindBy(xpath = "//button[text()='send now']")
	WebElement sendNow_do_you_have_any_question;
	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement something_went_wrong;
	public void logoValidation() {
		pause(3000);
		elementDisplayed(logo);
		clickElement(logo);
		pause(3000);
	}
	
	public void titleValidation() {
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
	}
	
	public void validationForAllHeaderMenu() {
		pause(3000);
		elementEnabled(homeHeader);
		clickElement(homeHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");
		
		pause(3000);
		elementEnabled(courseHeader);
		clickElement(courseHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");
		
		pause(3000);
		elementEnabled(mentorHeader);
		clickElement(mentorHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");
		
		pause(2000);
		elementEnabled(alumniHeader);
		clickElement(alumniHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver,"https://enthrallit.com/alumni/" );
		
		pause(2000);
		elementEnabled(aboutUsHeader);
		clickElement(aboutUsHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");
		
		pause(2000);
		elementEnabled(loginlinkHeader);
		clickElement(loginlinkHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		
				
	}
	public void homePageValidations() {
		pause(4000);
		clickElement(homeHeader);
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, forScrolldownInhome);
		pause(3000);
		verifyTextOfTheWebElement(for_Do_You_have_any_questions, "Do You Have Any Questions");
		clickElement(name_do_you_have_any_question);
		inputText(name_do_you_have_any_question, "abcd");
		pause(1000);
		inputText(email_do_you_have_any_question, "abcde@gmail.com");
		pause(2000);
		inputTextThenClickTab(subject_do_you_have_any_question, "java");
		pause(1000);
		inputText(experiance_do_you_have_any_question, "No");
		pause(2000);
		inputTextThenClickReturn(message_do_you_have_any_question, "Im done with my question");
		pause(2000);
		clickElement(sendNow_do_you_have_any_question);
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver,forScrolldownInhome );
		clickElement(something_went_wrong);
		pause(3000);
		
		
	}
	
	public void validationForAllFooterMenu() {
		pause(3000);
		elementEnabled(homeFooter);
		clickElement(homeFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");
		
		pause(3000);
		elementEnabled(courseFooter);
		clickElement(courseFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");
		
		pause(3000);
		elementEnabled(mentorFooter);
		clickElement(mentorFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");
		
		pause(2000);
		elementEnabled(alumniFooter);
		clickElement(alumniFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver,"https://enthrallit.com/alumni/" );
		
		pause(2000);
		elementEnabled(aboutUsFooter);
		clickElement(aboutUsFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");
		
		pause(2000);
		elementEnabled(loginLinkFooter);
		clickElement(loginLinkFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		
				
				
	}
	
	
	

}