package LandingPageTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import POM.LandingPage;
import genericUtility.BaseClass;
import genericUtility.ListImp;
import genericUtility.WebDriverUtility;
@Listeners(genericUtility.ListImp.class)

//login test for superadmin
public class LoginValidationTest extends BaseClass  {

	@Test
	public void superAdminLoginTest() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		lp.getEmailTextBox().sendKeys("prince.k@revealhealthtech.com");
		Assert.assertFalse(lp.getLoginButton().isEnabled());
		ListImp.test.info("Login button is disabled", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
		lp.getPassTextBox().sendKeys("Prince@123");
		Thread.sleep(1000);
		Assert.assertTrue(lp.getLoginButton().isEnabled());
		ListImp.test.info("Login button is enabled", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
		lp.getLoginButton().click();
		WebDriverUtility.waitForElementPresent(driver, driver.findElement(By.xpath("//span[text()='Active Surveillance Program / ']")));
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("dashboard"));
		ListImp.test.info("Logged in as superadmin", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
	}
}
