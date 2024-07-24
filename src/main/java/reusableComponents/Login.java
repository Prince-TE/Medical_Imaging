package reusableComponents;

import POM.HomePage;
import genericUtility.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public void superAdminLogin(HomePage home){
        home.setEmail("prince.k@revealhealthtech.com");
        home.setPassword("Prince@123");
        home.clickLogInButton();
    }
    public void aspManagerLogin(HomePage home){
        home.setEmail("anuj.mody@revealhealthtech.com");
        home.setPassword("Anuj@1234");
        home.clickLogInButton();
    }
    public void doctorLogin(HomePage home){
        home.setEmail("tejesh.p@revealhealthtech.com");
        home.setPassword("Tejesh@123");
        home.clickLogInButton();
    }
    public void patientLogin(HomePage home){
        home.setEmail("elton.dcunha@revealhealthtech.com");
        home.setPassword("Elton@123");
        home.clickLogInButton();
    }
    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

}
