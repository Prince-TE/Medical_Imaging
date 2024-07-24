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
	
	@FindBy (xpath = "//span[@id='backToLoginBtn']")
	private WebElement backToLoginLink;
	@FindBy(xpath = "//img[@alt=\"Logo\"]")
	private WebElement logo;
	
	


    public WebElement getLogInButton() {
		return logInButton;
	}

	public WebElement getBackToLoginLink() {
		return backToLoginLink;
	}

	public WebElement getForgotPassText() {
		return forgotPassText;
	}

	public WebElement getForgotPassLink() {
		return forgotPassLink;
	}

	public WebElement getHeader() {
		return header;
	}

	public void clickLogo(){
		logo.click();
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
		getEMail().sendKeys(emailID);
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
	
	
	

}
