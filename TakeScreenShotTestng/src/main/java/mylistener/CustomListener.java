package mylistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testngListenerConcept.SccreenShotTest;

public class CustomListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Failed");
		SccreenShotTest.failed(result.getMethod().getMethodName(),Long.toString(result.getEndMillis()));
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
