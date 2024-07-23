package genericUtility;

import POM.HomePage;
import POM.PatientEnrollmentPage;
import POM.SuperAdminHomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BasePage extends BaseClass {
    protected HomePage home;
    protected PatientEnrollmentPage enroll;
    protected SuperAdminHomePage superAdmin;

    @BeforeMethod
    public void initializePages() {
        home = new HomePage(driver);
        enroll = new PatientEnrollmentPage(driver);
        superAdmin = new SuperAdminHomePage(driver);

    }
}
