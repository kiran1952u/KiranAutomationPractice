package presolv;

import org.testng.ITestListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class listeners  implements ITestListener {
    public void onTeststart(ITestListener result) {
        System.out.println("Test case is starting ");

    }

    public void onTestSuccess(ITestListener result) {
        System.out.println("Test failed -screenshot captured ");


    }

    public void onTestFailure(ITestListener result) {
        System.out.println("test failed-screenshot captured");


    }

    public void onTestSkipped(ITestListener result) {
        System.out.println("test failed-screenshot captured");


    }
}

