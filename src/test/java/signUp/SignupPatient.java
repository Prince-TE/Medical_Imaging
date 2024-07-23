package signUp;

import genericUtility.BasePage;
<<<<<<< HEAD
import org.testng.Assert;
=======
>>>>>>> d77b5611c3a47f1c9f4ed17aa6c97850a061e91c
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import stringConstants.PatientEnrollmentString;
import testData.*;

@Listeners(genericUtility.ListImp.class)



public class SignupPatient extends BasePage {

<<<<<<< HEAD
	//SoftAssert softAssert = new SoftAssert();
=======
	SoftAssert softAssert = new SoftAssert();
>>>>>>> d77b5611c3a47f1c9f4ed17aa6c97850a061e91c

	@Test(priority = 2,dataProvider = "patientInfo & contactInformation", dataProviderClass = PatientEnrollment.class)
	public void completingTheAssessmentForEligiblePatient(String firstName,String lastName,String ohip,
								   String mrn,String email,String mobile,String createPass, String confirmPass,String otp) throws Throwable {
<<<<<<< HEAD

			home.clickLogo();
			home.clickSignUp();
=======
		
			
		    home.clickSignUp();
>>>>>>> d77b5611c3a47f1c9f4ed17aa6c97850a061e91c
			enroll.setFirstName(firstName);
			enroll.setLastName(lastName);
			enroll.setOhip(ohip);
			enroll.setMRN(mrn);
			enroll.clickNext();
			Thread.sleep(3000);
			enroll.setEmail(email);
			enroll.setMobile(mobile);
			enroll.setCreatePassword(createPass);
			enroll.setConfirmPassword(confirmPass);
			enroll.clickNext();

			enroll.clickNo();//Q1
			enroll.clickNext();
			enroll.clickNo();//Q2
			enroll.clickNext();
			enroll.clickNo();//Q3
			enroll.clickNext();
			enroll.clickNo();//Q4
			enroll.clickNext();
			enroll.clickPositive();//Q5
			enroll.clickNext();
			enroll.clickNo();//Q6
			enroll.clickNext();
			enroll.clickNo();//Q7
			enroll.clickSubmit();
			enroll.setOtp(otp);
			enroll.clickVerify();
	}

	@Test(priority = 1,dataProvider = "patientInfo & contactInformation", dataProviderClass = PatientEnrollment.class)
	public void completingTheAssessmentForInEligiblePatient(String firstName,String lastName,String ohip,
															String mrn,String email,String mobile,String createPass, String confirmPass,String otp) throws Throwable {

		home.clickSignUp();
		enroll.setFirstName(firstName);
		enroll.setLastName(lastName);
		enroll.setOhip(ohip);
		enroll.setMRN(mrn);
		enroll.clickNext();
		Thread.sleep(3000);
		enroll.setEmail(email);
		enroll.setMobile(mobile);
		enroll.setCreatePassword(createPass);
		enroll.setConfirmPassword(confirmPass);
		enroll.clickNext();
		
		enroll.clickYes();//Q1
		enroll.clickNext();
		enroll.clickYes();//Q2
		enroll.clickNext();
		enroll.clickYes();//Q3
		enroll.clickNext();
		enroll.clickYes();//Q4
		enroll.clickNext();
		enroll.clickNegative();//Q5
		enroll.clickNext();
		enroll.clickYes();//Q6
		enroll.clickNext();
		enroll.clickYes();//Q7
		enroll.clickSubmit();
<<<<<<< HEAD
		//softAssert.assertEquals(enroll.getThankYou().getText(),PatientEnrollmentString.InEligibleThankyou_Text);
		Assert.assertTrue(enroll.getThankYou().getText().contains(PatientEnrollmentString.InEligibleThankyou_Text));
=======
		softAssert.assertEquals(enroll.getThankYou().getText(),PatientEnrollmentString.InEligibleThankyou_Text);
>>>>>>> d77b5611c3a47f1c9f4ed17aa6c97850a061e91c
	}

	
}
