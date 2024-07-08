package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListImp implements IRetryAnalyzer {

	int count = 0;
	int limitCount = 5;
	public boolean retry(ITestResult result) {

        if(count<limitCount) {
        	count++;
        	return true;
        }
		return false;
	}

}
