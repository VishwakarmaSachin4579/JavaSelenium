package TestNg;

import org.testng.annotations.Test;

public class PriorityTestNg {
	@Test(priority = -1)
	public void test1() {
		System.out.println("hii Test1");
	}
	@Test (priority = 1)
	public void test2() {
		System.out.println("hii Test2");
	}
	@Test(priority = -6)
	public void test3() {
		System.out.println("hii Test3");
	}
}
