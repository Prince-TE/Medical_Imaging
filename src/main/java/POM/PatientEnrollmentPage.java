package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientEnrollmentPage {
	
	@FindBy(id = "enrollFirstName")
	private WebElement firstName;
	
	@FindBy(id = "enrollLastName")
	private WebElement lastName;
	
	@FindBy(id = "enrollOhipNumber")
	private WebElement ohipNumber;
	
	@FindBy(id = "enrollMrnNumber")
	private WebElement mrnNumber;
	
	@FindBy(xpath = "(//*[@id='errorMessage'])[1]")
	private WebElement ohipErrorMessage;
	
	@FindBy(xpath = "(//*[@id='errorMessage'])[2]")
	private WebElement mrnErrorMessage;
	
	@FindBy(id = "enrollNext")
	private WebElement nextButton;
	
	@FindBy(id = "enrollBack")
	private WebElement backButton;
	
	@FindBy(id = "enrollEmail")
	private WebElement email;
	
	@FindBy(id = "enrollMobileNumber")
	private WebElement mobileNumber;
	
	@FindBy(id = "enrollNewPassword")
	private WebElement createPassword;
	
	@FindBy(id = "enrollConfirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id = "enrollYes")
	private WebElement yesButton;
	
	@FindBy(id = "enrollNo")
	private WebElement noButton;
	
	@FindBy(id = "enrollSubmit")
	private WebElement submitButton;
	
	@FindBy(id = "enrollOtpHeader")
	private WebElement emailVerificationText;
	
	@FindBy(id = "enrollOtp")
	private WebElement otp;
	
	@FindBy(id = "enrollVerify")
	private WebElement verifyButton;
	
	@FindBy(id = "resendOtp")
	private WebElement resendOTPLink;
	
	@FindBy(id = "enrollOtp")
	private WebElement otpTextfield;
	
	@FindBy(xpath = "//*[contains(text(),'Thank you')]")
	private WebElement thankYou;
	
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getOhip() {
		return ohipNumber;
	}
	public WebElement getOhipErrorMessage() {
		return ohipErrorMessage;
	}
	public WebElement getMrnErrorMessage() {
		return mrnErrorMessage;
	}
	public WebElement getMRN() {
		return mrnNumber;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getMobile() {
		return mobileNumber;
	}
	public WebElement getCreatePassword() {
		return createPassword;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	public WebElement getBackButton() {
		return backButton;
	}
	public WebElement getEmailVerificationText() {
		return emailVerificationText;
	}
	public WebElement getResendOTP() {
		return resendOTPLink;
	}
	public WebElement getThankYou() {
		return thankYou;
	}
	public WebElement getOtpTextfield() {
		return otpTextfield;
	}
	
	public void setFirstName(String fn) {
		firstName.sendKeys(fn);
	}
	public void setLastName(String ln) {
		lastName.sendKeys(ln);
	}
	public void setOhip(String ohip) {
		ohipNumber.sendKeys(ohip);
	}
	public void setMRN(String mrn) {
		mrnNumber.sendKeys(mrn);
	}
	public void setEmail(String emailId) {
		email.sendKeys(emailId);
	}
	public void setMobile(String mobile) {
		mobileNumber.sendKeys(mobile);
	}
	public void setCreatePassword(String newPass) {
		createPassword.sendKeys(newPass);
	}
	public void setConfirmPassword(String confirmPass) {
		confirmPassword.sendKeys(confirmPass);
	}
	
	public void clickNext() {
		nextButton.click();
	}
	public void clickBack() {
		backButton.click();
	}
	public void clickYes() {
		yesButton.click();
	}
	public void clickNo() {
		noButton.click();
	}
	public void clickSubmit() {
		submitButton.click();
	}
	public void clickVerify() {
		verifyButton.click();
	}
	public void clickResendOtp() {
		resendOTPLink.click();
	}
	
	public PatientEnrollmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clearData() {
		firstName.clear();
		lastName.clear();
		ohipNumber.clear();
		mrnNumber.clear();
		email.clear();
		mobileNumber.clear();
		createPassword.clear();
		confirmPassword.clear();
	}
	
	
	
	
	

}
