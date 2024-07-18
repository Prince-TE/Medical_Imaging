package testData;

import org.testng.annotations.DataProvider;


public class PatientEnrollment {

    @DataProvider(name = "patientInfo")
    public Object[][] providepatientInfo() {
        return new Object[][] {
            {"Elton", "Dcunha", "63728371547q","931",}
        };
    }
    
    @DataProvider(name = "contactInformation")
    	public Object[][] provideContacInformation(){
    		return new Object[][]{
    		{"elton.dcunha@revealhealthtech.com","9483341418","Elton@123","Elton@123"}
    		};
    }
}

