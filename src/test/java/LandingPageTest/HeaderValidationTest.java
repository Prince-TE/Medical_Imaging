package LandingPageTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import genericUtility.BaseClass;
import genericUtility.ListImp;
import genericUtility.WebDriverUtility;

@Listeners(genericUtility.ListImp.class)
public class HeaderValidationTest extends BaseClass{
		
		@Test
		public void headerValidation() throws Throwable {
			
			WebElement header = driver.findElement(By.xpath("//nav[@class='mr-8 hidden lg:mr-32 lg:block']"));
			List<WebElement> links = header.findElements(By.tagName("a"));
			
//			LandingPage lp = new LandingPage(driver);
//			WebElement allHeaders = lp.getHeader();
//			List<WebElement> links = allHeaders.findElements(By.xpath("//a"));
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
				ListImp.test.info("URL: "+URL+" opened successfully", MediaEntityBuilder.createScreenCaptureFromBase64String(WebDriverUtility.getScreenshotAsBase64(driver)).build());
				driver.close();
				driver.switchTo().window(parent);
			}
			
		}
	}
