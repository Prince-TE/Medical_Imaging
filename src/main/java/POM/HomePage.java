package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id ="email")
	private WebElement EmailIDTextField;
	
	@FindBy(xpath = "//input[@placeholder='Enter your email id']")
	private WebElement EmailPlaceholder;
	
	@FindBy(id ="password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	private WebElement PasswordPlaceholder;
	
	@FindBy(id = "login")
    private WebElement logInButton;
	
	@FindBy(id = "signUpBtn")
	private WebElement signUp;
	
	@FindBy(xpath = "//*[contains(text(),'Invalid')]")
	private WebElement InvalidCredentialsErrorMessage;
	
	@FindBy(id = "bannerHeader")
	private WebElement activePreventionProgramTitle;
	
	@FindBy(id = "welcomeHeader")
	private WebElement welcomeHeader;
	
	@FindBy(id = "visionHeader")
	private WebElement visionHeader;
	
	@FindBy(xpath = "(//div[@id='cardHeader'])[1]")
	private WebElement cardHeader1;
	
	@FindBy(xpath = "(//div[@id='cardHeader'])[2]")
	private WebElement cardHeader2;
	
	@FindBy(xpath = "(//div[@id='cardHeader'])[3]")
	private WebElement cardHeader3;
	
	@FindBy(xpath = "//ul[@id='primaryNavigationList']")
	private WebElement header;
	
	@FindBy(xpath = "//span[@id='forgotPasswordBtn']")
	private WebElement forgotPassLink;
	
	@FindBy(xpath = "//h1[contains(text(),'Forgot Password?')]")
	private WebElement forgotPassText;
	
	


    public WebElement getForgotPassText() {
		return forgotPassText;
	}

	public WebElement getForgotPassLink() {
		return forgotPassLink;
	}

	public WebElement getHeader() {
		return header;
	}

	public void clickLogInButton() {
        logInButton.click();
    }
    
    public void clickSignUp() {
    	signUp.click();
    }
    
    public boolean isLoginDisabled() {
    	return logInButton.isEnabled();
    }
	
	public WebElement getEMail() {
		return EmailIDTextField;
	}
	
	public WebElement getEmailPlaceholder() {
		return EmailPlaceholder;
	}
	
	public WebElement getPassword() {
		return PasswordTextField;
	}
	
	public WebElement getPasswordPlaceholder() {
		return PasswordPlaceholder;
	}
	
	public String getInvalidCredentialsErrorMessage() {
		return InvalidCredentialsErrorMessage.getText();
	}
	
	
	public void setEmail(String emailID) {
		EmailIDTextField.sendKeys(emailID);
	}
	
	
	public void setPassword(String password) {
		PasswordTextField.sendKeys(password);
	}
	
	public WebElement getactivePreventionProgramTitle() {
		return activePreventionProgramTitle;
	}
	
	public WebElement getWelcomeHeader() {
		return welcomeHeader;
	}
	
	public WebElement getvisionHeader() {
		return visionHeader;
	}
	
	public WebElement getCardHeader1() {
		return cardHeader1;
	}
	
	public WebElement getCardHeader2() {
		return cardHeader2;
	}
	
	public WebElement getCardHeader3() {
		return cardHeader3;
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clearData() {
		EmailIDTextField.clear();
		PasswordTextField.clear();
	}
	
	
	

//	public WebElement getInvalidDOB() {
//		return InvalidDOB;
//	}
//
//	public WebElement getFirstnameTxtbx() {
//		return FirstnameTxtbx;
//	}
//
//
//	public WebElement getLastNameTxtbx() {
//		return LastNameTxtbx;
//	}
//
//
//	public WebElement getDOBTxtbx() {
//		return DOBTxtbx;
//	}
//
//
//	public WebElement getPhoneNumberTxtbx() {
//		return PhoneNumberTxtbx;
//	}
//
//
//	public WebElement getEmailtxtbx() {
//		return Emailtxtbx;
//	}
//
//
//	public WebElement getInfotext1() {
//		return Infotext1;
//	}
//
//
//	public WebElement getInfotext2() {
//		return Infotext2;
//	}
//
//
//	public WebElement getFirstnametxt() {
//		return Firstnametxt;
//	}
//
//
//	public WebElement getLastnametxt() {
//		return Lastnametxt;
//	}
//
//
//	public WebElement getDOBtxt() {
//		return DOBtxt;
//	}
//
//
//	public WebElement getPhonenumbertxt() {
//		return Phonenumbertxt;
//	}
//
//
//	public WebElement getEmailtxt() {
//		return Emailtxt;
//	}
//
//
//	public WebElement getInvalidDOBError() {
//		return InvalidDOBError;
//	}
//
//
//	public WebElement getInvalidEmail() {
//		return InvalidEmail;
//	}
//
//
//	public LogIn_POM(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}


//	public WebElement getContactInformation() {
//		return ContactInformation;
//	}
//
//
//	public void setContactInformation(WebElement contactInformation) {
//		ContactInformation = contactInformation;
//	}
//
//
//	public void setFirstnameTxtbx(String FN) {
//		FirstnameTxtbx.sendKeys(FN);
//	}
//
//
//	public void setLastNameTxtbx(String LN) {
//		LastNameTxtbx.sendKeys(LN);
//	}
//
//
//	public void setDOBTxtbx(String DateofBirth) {
//		DOBTxtbx.sendKeys(DateofBirth);
//	}
//
//
//	public void setPhoneNumberTxtbx(String PhoneNumber) {
//		PhoneNumberTxtbx.sendKeys(PhoneNumber);
//	}
//
//
//	public void setEmailtxtbx(String Email) {
//		Emailtxtbx.sendKeys(Email);
//	}
//	
//	
//
//	public WebElement getInvalidEMail() {
//		return InvalidEMail;
//	}
//
//
//	public void clearData() {
//		DOBTxtbx.clear();
//		Emailtxtbx.clear();
//		PhoneNumberTxtbx.clear();
//	}
//	public void getNextButton() throws InterruptedException {
//		Thread.sleep(3000);
//	NextButton.click();
//	}
//	
//	public WebElement getPhoneNumberError() {
//		return PhoneNumberError;
//	}
//	
//	public By Emailtxbx() {
//		return By.cssSelector("#Input_EmailAddress");
//	}
//
//	public WebElement getCalendar() {
//		return Calendar;
//	}
//
//	public void setCalendar(WebElement calendar) {
//		Calendar = calendar;
//	}
//
//	public WebElement getDate() {
//		return date;
//	}
//
//	public void setDate(WebElement date) {
//		this.date = date;
//	}
//
//	public WebElement getSetDate() {
//		return SetDate;
//	}
//
//	public void setSetDate(WebElement setDate) {
//		SetDate = setDate;
//	}
	
	
	

}
