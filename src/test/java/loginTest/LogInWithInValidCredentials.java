package loginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtility.*;
import stringConstants.LandingPage;
import testData.Login;
import testData.PatientEnrollment;

@Listeners(genericUtility.ListImp.class)

public class LogInWithInValidCredentials extends BasePage {
	
	SoftAssert s = new SoftAssert(); //assertion
	
	@Test(dataProvider = "invalidCredentials", dataProviderClass = Login.class)
	public void inValidCredentials(String email, String password) throws Throwable {
			
			
			s.assertEquals(home.getEmailPlaceholder().getText(), LandingPage.emailPlaceholderText);
			s.assertEquals(home.getPasswordPlaceholder().getText(), LandingPage.passwordPlaceholderText);
			
			home.setEmail(email);
			home.setPassword(password);
			
			Thread.sleep(2000);
			home.clickLogInButton();
			Thread.sleep(2000);
			s.assertEquals(home.getInvalidCredentialsErrorMessage(),LandingPage.InValid_Credentials_ErrorMessage );
			home.clearData();
			
		}
	
	@Test(dependsOnMethods = "inValidCredentials", dataProvider="disableLogin", dataProviderClass = Login.class)
	public void disablingLogInButton(String email, String password) throws InterruptedException, EncryptedDocumentException, IOException {
			
	
				home.setEmail(email);
				Thread.sleep(1000);
				home.setPassword(password);
				Thread.sleep(2000);
				s.assertTrue(home.isLoginDisabled(), "Login button is disabled");
				Thread.sleep(2000);
				home.clearData();
			}
		}
