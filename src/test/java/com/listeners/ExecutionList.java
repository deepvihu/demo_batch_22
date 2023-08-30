package com.listeners;

import org.testng.IExecutionListener;

public class ExecutionList implements IExecutionListener {

	@Override
	public void onExecutionStart() {
	System.out.println("Started");
	}

	@Override
	public void onExecutionFinish() {
	System.out.println("Finished");
	}

}
