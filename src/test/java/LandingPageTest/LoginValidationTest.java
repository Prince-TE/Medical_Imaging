package LandingPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import genericUtility.BaseClass;
import genericUtility.ListImp;
import genericUtility.WebDriverUtility;
@Listeners(genericUtility.ListImp.class)

public class LoginValidationTest extends BaseClass  {

	@Test
	public void superAdminLoginTest() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("prince.k@revealhealthtech.com");
		WebElement button=driver.findElement(By.xpath("//button[@id='login']"));
		Assert.assertFalse(button.isEnabled());
		ListImp.test.info("Login button is disabled", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
		driver.findElement(By.id("password")).sendKeys("Prince@123");
		Thread.sleep(1000);
		Assert.assertTrue(button.isEnabled());
		ListImp.test.info("Login button is enabled", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
		button.click();
		WebDriverUtility.waitForElementPresent(driver, driver.findElement(By.xpath("//span[text()='Active Surveillance Program / ']")));
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("superadmin"));
		ListImp.test.info("Logged in as superadmin", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
	}
}
