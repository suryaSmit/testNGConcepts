package testngFramework.testNGConcepts;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = {"groupOne", "groupTwo"})
	public void test1() {
		System.out.println("test one");
	}

	@Test(groups = {"groupTwo"})
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
	}

	@Test(groups = {"groupTwo"})
	public void test5() {
		System.out.println("test five");
	}

	@Test(groups = {"groupOne", "groupTwo"})
	public void test6() {
		System.out.println("test six");
	}
}
