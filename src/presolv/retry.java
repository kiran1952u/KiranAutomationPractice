package presolv;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {
    private int retrycount = 0;
    private static final int maxRetryCount = 5;

    public boolean retry(ITestResult result) {
        if (retrycount < maxRetryCount) {
            retrycount++;
            return true;
        }

        return false;
    }
}