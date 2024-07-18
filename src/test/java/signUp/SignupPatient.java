package signUp;

import testData.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BasePage;

@Listeners(genericUtility.ListImp.class)



public class SignupPatient extends BasePage {

	@Test(dataProvider = "patientInfo", dataProviderClass = PatientEnrollment.class)
	public void patientInformation(String firstName,String lastName,String ohip, String mrn) throws Throwable {
		
			
		    home.clickSignUp();
			enroll.setFirstName(firstName);
			enroll.setLastName(lastName);
			enroll.setOhip(ohip);
			enroll.setMRN(mrn);
			enroll.clickNext();
			Thread.sleep(3000);
			
		
	}
	@Test(dependsOnMethods = "patientInformation", dataProvider="contactInformation", dataProviderClass = PatientEnrollment.class)
	public void contactInformation(String email,String mobile,String createPass, String confirmPass) throws Throwable{
		
	
		enroll.setEmail(email);
		enroll.setMobile(mobile);
		enroll.setCreatePassword(createPass);
		enroll.setConfirmPassword(confirmPass);
		enroll.clickNext();
		
	}
	
}
