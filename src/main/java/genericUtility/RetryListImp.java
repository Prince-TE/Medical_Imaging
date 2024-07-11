package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class RetryListImp implements IRetryAnalyzer, ITestNGListener {

	int count = 0;
	int limitCount = 3;
	public boolean retry(ITestResult result) {

        if(count<limitCount) {
        	count++;
        	return true;
        }
		return false;
	}

}
