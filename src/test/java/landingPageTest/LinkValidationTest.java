package landingPageTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import genericUtility.BasePage;
import genericUtility.ListImp;
import genericUtility.WebDriverUtility;
@Listeners(genericUtility.ListImp.class)
public class LinkValidationTest extends BasePage{

	@Test
	public void headerLinkValidation() throws InterruptedException {
		WebElement header = home.getHeader();
		List<WebElement> links = header.findElements(By.tagName("a"));
		
		Actions a = new Actions(driver);
		for (WebElement link : links) {
			a.moveToElement(link).keyDown(Keys.CONTROL).click().perform();
			Thread.sleep(1000);
		}
		String parent = driver.getWindowHandle();
		Set<String> pages = driver.getWindowHandles();
		pages.remove(parent);
		Iterator<String> it = pages.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			String URL = driver.getCurrentUrl();
			Thread.sleep(1000);
			Assert.assertTrue(URL.contains("about") || URL.contains("location") || URL.contains("help"));
			ListImp.test.info("URL: "+URL+" opened successfully", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
			driver.close();
			driver.switchTo().window(parent);
	}
}
	@Test
	public void forgotPassLinkValidation() {
		home.getForgotPassLink().click();
		WebDriverUtility.waitForElementPresent(driver, home.getForgotPassText());
		Assert.assertTrue(home.getForgotPassText().getText().toLowerCase().contains("forgot"));
		ListImp.test.info("Forgot Password Page Displayed", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
	}
	
}
