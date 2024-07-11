package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
		

		public LandingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//ul[@class='gap-10 text-lg lg:flex']")
		private WebElement header;
		
		@FindBy(xpath = "//a[text()='About Us']")
		private WebElement aboutUs;
		
		@FindBy(xpath = "//a[text()='Location']")
		private WebElement location;
		
		@FindBy(xpath = "//a[text()='Help']")
		private WebElement help;
		
		@FindBy(id = "email")
		private WebElement emailTextBox;
		
		@FindBy(xpath = "//button[@id='login']")
		private WebElement loginButton;
		
		@FindBy(id = "password")
		private WebElement passTextBox;
		

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getPassTextBox() {
			return passTextBox;
		}

		public WebElement getAboutUs() {
			return aboutUs;
		}

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHelp() {
			return help;
		}

		public WebElement getHeader() {
			return header;
		}

		public WebElement getEmailTextBox() {
			return emailTextBox;
		}
		
		
		
	}
