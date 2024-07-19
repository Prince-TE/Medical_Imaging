package testData;

import org.testng.annotations.DataProvider;

public class Login {
	
	@DataProvider(name = "invalidCredentials")
    public Object[][] providepatientInfo() {
        return new Object[][] {
            {"elton.dcuha1234@revealhealthtech.com","Elton@10"},
            {"elton.dcunha@revealhealthtech.com","Elton123"}
        };
    }
    
    @DataProvider(name = "disableLogin")
    	public Object[][] provideContacInformation(){
    		return new Object[][]{
    		{"elton.dcunha@revealhealthtech","123456"},
    		{"elon.dcunha@revealhealthtech.com","Elton@123"},
    		{"","Elton@123"},
    		{"elon.dcunha@revealhealthtech.com",""}
    		};
    }

}
