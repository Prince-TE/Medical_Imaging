package landingPageTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import genericUtility.BasePage;
import genericUtility.ListImp;
import genericUtility.WebDriverUtility;
import stringConstants.LandingPage;
@Listeners(genericUtility.ListImp.class)

public class TextValidationTest extends BasePage{

	@Test(priority = 1)
	public void titleTextValidation() {
		String titleText = home.getactivePreventionProgramTitle().getText();
		Assert.assertTrue(titleText.contains(LandingPage.activePreventionProgram_titleText));  
		ListImp.test.info("Title text Displayed", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());	
	}
	
	@Test(priority = 2)
	public void welcomeHeaderTextValidation() {
		String welcomeText = home.getWelcomeHeader().getText();
		WebDriverUtility.scrollToElement(driver, home.getWelcomeHeader());
		Assert.assertTrue(welcomeText.contains(LandingPage.welcomeHeader_titleText));
		ListImp.test.info("Welcome text Displayed", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
		
	}
	
	@Test(priority = 3)
	public void visionHeaderTextValidation() {
		WebDriverUtility.scrollToElement(driver, home.getvisionHeader());
		String visionText = home.getvisionHeader().getText();
		Assert.assertTrue(visionText.contains(LandingPage.visionHeader_titleText));
		ListImp.test.info("Welcome text Displayed", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
	}
	
	
}
