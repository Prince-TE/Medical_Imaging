package genericUtility;

import POM.HomePage;
import POM.PatientEnrollmentPage;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BasePage extends BaseClass {
    protected HomePage home;
    protected PatientEnrollmentPage enroll;

    @BeforeClass
    public void initializePages() {
        home = new HomePage(driver);
        enroll = new PatientEnrollmentPage(driver);

    }
}
