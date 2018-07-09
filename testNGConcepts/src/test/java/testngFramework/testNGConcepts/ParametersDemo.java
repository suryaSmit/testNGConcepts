package testngFramework.testNGConcepts;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	@Test
	@Parameters({"spmtr","tpmtr"})
	public void testCaseOne(String arg1, String arg2) {
		Reporter.log("test case one",true);
		Reporter.log("suite parameter is: "+arg1,true);
		Reporter.log("test parameter is: "+arg2,true);
	}

}
