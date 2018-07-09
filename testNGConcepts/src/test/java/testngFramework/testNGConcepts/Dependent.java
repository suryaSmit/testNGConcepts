package testngFramework.testNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent {
	@Test(groups = {"groupOne"})
	public void test1() {
		System.out.println("test one");
		Assert.assertTrue(true);
	}

	//this test case execution depends on test1 result
	@Test(groups = {"groupTwo"},dependsOnMethods= {"test1"})
	public void test2() {
		System.out.println("test two");
	}

	@Test(groups = {"groupOne"})
	public void test3() {
		System.out.println("test three");
	}

	@Test(groups = {"groupOne"})
	public void test4() {
		System.out.println("test four");
		Assert.assertTrue(false);
	}

	//this test case execution depends on groupOne result
	@Test(groups = {"groupTwo"}, dependsOnGroups= {"groupOne"})
	public void test5() {
		System.out.println("test five");
	}

	@Test(groups = {"groupTwo"})
	public void test6() {
		System.out.println("test six");
	}
}
