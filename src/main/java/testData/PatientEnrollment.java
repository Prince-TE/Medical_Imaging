package testData;

import org.testng.annotations.DataProvider;


public class PatientEnrollment {

    @DataProvider(name = "patientInfo & contactInformation")
    public Object[][] patientInfo() {
        return new Object[][] {
            {"Elton", "Dcunha", "63728371547q","931",
                    "elton.dcunha@revealhealthtech.com","9483341418","Elton@123","Elton@123","545454"}
        };
    }
}

