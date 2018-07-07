package testngFramework.testNGConcepts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass2 {
	// @BeforeTest: which will run before running first @Test inside any class of test tag
	@BeforeTest
	public void launch() {
		Reporter.log("launch Broser", true);
	}

	// @AfterTest: which will run after running last @Test inside any class of test tag
	@AfterTest
	public void close() {
		Reporter.log("closing brosesr", true);
	}

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
	
	@Test(priority = 0)
	public void deleteJunk() {
		Reporter.log("Deleting Junk Mails", true);
	}
	
	@Test(priority = 1)
	public void deleteSentMails() {
		Reporter.log("Deleting sent mails",true);
	}

}
