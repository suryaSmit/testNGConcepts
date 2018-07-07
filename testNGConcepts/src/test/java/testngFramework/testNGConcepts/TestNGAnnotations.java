package testngFramework.testNGConcepts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	//@BeforeClass: which will run before running first @Test inside the class
//	@BeforeClass
//	public void launch() {
//		Reporter.log("launch Broser",true);
//	}
//	
//	//@AfterClass: which will run after running last @Test inside the class
//	@AfterClass
//	public void close() {
//		Reporter.log("closing brosesr",true);
//	}
//	
	// @BeforeMethod: which will run before each @Test
	@BeforeMethod
	public void login() {
		Reporter.log("login test case", true);
	}
	// @AfterMethod: which will run after each @Test
	@AfterMethod
	public void logout() {
		Reporter.log("logout test case", true);
		
	}
	// @Test: each and every test case is one Test annotation.
	@Test(testName = "compose main", priority = 0)
	public void composeMail() {
		Reporter.log("composing mail", true);
	}

	@Test(testName = "inbox", priority = 1)
	public void inboxChecking() {
		Reporter.log("inbox checking", true);
	}

}
