package pages;

//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import static common.CommonActions.*;
//import static common.CommonWaits.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;
//import static pages.Dashboard.*;
//import static common.commonMethod.inputText;
//import static common.commonMethod.pouse;


import java.time.Duration;


public class Login {
	/*
	 * Create Constructor Create Web Element Create method to test
	 */

	/*
	 * 1) Click Login from header 2) The page will direct to Login Page, validate
	 * title, current url, header etc. 3) provide your email and password and click
	 * submit button 4) When click a button make sure, the button is enabled, verify
	 * text and them click, verify logo, current url, title, header
	 */
	WebDriver driver;
	WebDriverWait wait;
	//Dashboard dashboard;

	public Login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		//dashboard = new Dashboard(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	@FindBy(xpath = "//a[@id='login-link']")
	WebElement loginLink;
	@FindBy(xpath = "//div[@class='header-bottom']")
	WebElement loginpageHeader;
	@FindBy(xpath = "//input[@name='username']")
	WebElement useremail;
	@FindBy(xpath = "//input[@name=\'password\']")
	WebElement userpassword;
	@FindBy(xpath = "//button[@id='login']")
	WebElement finalLogin;
	
	
	public void clickLogin() {
		pause(2000);
		clickElement(loginLink);
	}
	
	public void loginPageTitleValidation() {
		pause(2000);
		verifyTitle(driver, "Enthrall IT");
		pause(2000);
	}
	public void loginPageUrlValidation() {
		pause(2000);
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		
	}
	public void loginTextValidation() {
		pause(2000);
		verifyTextOfTheWebElement(loginLink, "Login into your account");
		
	}
	public void loginSteps() {
		pause(3000);
		clickLogin();
		pause(2000);
		loginPageTitleValidation();
		pause(1000);
		loginPageUrlValidation();
		pause(1000);
		//loginTextValidation();
		elementEnabled(useremail);
		clickElement(useremail);
		//elementDisplayed(useremail);
		pause(2000);
		inputText(useremail, "rubuait234");
		pause(2000);
		clearTextFromTheField(useremail);
		inputText(useremail,"rubuait525@gmail.com" );
		pause(2000);
		//clickElement(userpassword);
		elementEnabled(userpassword);
		clickElement(userpassword);
		pause(2000);
		inputText(userpassword,"Password$1" );
		elementEnabled(finalLogin);
		clickElement(finalLogin);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver,"https://enthrallit.com/dashboard/" );
	}
	public void loginForDashboardEasy() {
		pause(2000);
		loginPageTitleValidation();
		//loginTextValidation();
		//pause(1000);
		//clickLogin();
		inputText(useremail,"rubuait525@gmail.com" );
		pause(1000);
		inputText(userpassword,"Password$1" );
		clickElement(finalLogin);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver,"https://enthrallit.com/dashboard/" );
	


		
	}
	public void loginWithClickLoginFromHomePage() {
		pause(2000);
		clickLogin();
		loginPageTitleValidation();
		inputText(useremail,"rubuait525@gmail.com" );
		pause(1000);
		inputText(userpassword,"Password$1" );
		clickElement(finalLogin);
		pause(2000);
	}

}
