package genericUtility;

import POM.ASPManagerHomePage;
import POM.HomePage;
import POM.PatientEnrollmentPage;
import POM.SuperAdminHomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import reusableComponents.Login;

public class BasePage extends BaseClass {
    public HomePage home;
    protected PatientEnrollmentPage enroll;
    protected SuperAdminHomePage superAdmin;
    protected ASPManagerHomePage asp;
    protected Login login;
    protected WebDriverUtility webDriverUtility;

    @BeforeMethod
    public void initializePages() {
        //super.startBrowser("chrome");
        home = new HomePage(driver);
        enroll = new PatientEnrollmentPage(driver);
        superAdmin = new SuperAdminHomePage(driver);
        asp = new ASPManagerHomePage(driver);
        login = new Login(driver);
        webDriverUtility = new WebDriverUtility();

    }
}
