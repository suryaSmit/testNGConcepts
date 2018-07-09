package testngFramework.testNGConcepts;

import org.testng.annotations.Test;

public class Parallel {

	@Test
	public void testCase1() throws InterruptedException {
		System.out.println("test case one");
		Thread.sleep(2000);
		System.out.println("TC1 Parrallel id : "+Thread.currentThread().getId());
	}

	@Test
	public void testCase2() throws InterruptedException {
		System.out.println("test case two");
		Thread.sleep(4000);
		System.out.println("TC2 Parallel id: "+Thread.currentThread().getId());
	}

}
