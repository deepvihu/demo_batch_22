package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ "  test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ "  successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ "  Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ "  testcase skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ "  testcase failed due to per");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ "  test failed due to timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		String testname= context.getName();
		System.out.println(testname+ "  On start");
	}

	@Override
	public void onFinish(ITestContext context) {
		String testname= context.getName();
		System.out.println(testname+ "  On finish");
	}

}
