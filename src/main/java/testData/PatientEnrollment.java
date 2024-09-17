package testData;

import org.testng.annotations.DataProvider;


public class PatientEnrollment {

    @DataProvider(name = "patientInfo & contactInformation")
    public Object[][] patientInfo() {
        return new Object[][] {
            {"Sophia", "Jones", "30642876179S","931",
                    "elton.dcunha@revealhealthtech.com","1234567890","Elton@123","Elton@123","545454"}
        };
    }
}

