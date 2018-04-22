package Core;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteInitializer implements ISuiteListener {

	public void onFinish(ISuite suite) {
		System.out.println("Finished Suite");

	}

	public void onStart(ISuite suite) {
		System.out.println("Started Suite");

	}

}
