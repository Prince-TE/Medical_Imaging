package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

// First comment

public class BaseClass {

	public WebDriver driver;
	public static WebDriver sDriver;
	
	@Parameters("browser")
	@BeforeTest(alwaysRun = true)
	public void startBrowser(@Optional("chrome") String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://cmi-fe-dev.s3-website.ca-central-1.amazonaws.com/");
		sDriver = driver;
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("http://cmi-fe-dev.s3-website.ca-central-1.amazonaws.com/");
			sDriver = driver;
		}
		
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("http://cmi-fe-dev.s3-website.ca-central-1.amazonaws.com/");
			sDriver = driver;
		}
	}
	
	@AfterTest(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
}
