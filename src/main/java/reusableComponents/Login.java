package reusableComponents;

import genericUtility.BasePage;

public class Login extends BasePage {

    public void superAdminLogin(){
        home.setEmail("prince.k@revealhealthtech.com");
        home.setPassword("Prince@123");
        home.clickLogInButton();
    }
    public void aspManagerLogin(){
        home.setEmail("anuj.mody@revealhealthtech.com");
        home.setPassword("Anuj@1234");
        home.clickLogInButton();
    }
    public void doctorLogin(){
        home.setEmail("tejesh.p@revealhealthtech.com");
        home.setPassword("Tejesh@123");
        home.clickLogInButton();
    }
    public void patientLogin(){
        home.setEmail("elton.dcunha@revealhealthtech.com");
        home.setPassword("Elton@123");
        home.clickLogInButton();
    }

}
