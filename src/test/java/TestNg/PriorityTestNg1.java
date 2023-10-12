package TestNg;

import org.testng.annotations.Test;

public class PriorityTestNg1 {
	@Test
	public void test1() {
		System.out.println("hii Test1");
	}
	@Test 
	public void test2() {
		System.out.println("hii Test2");
	}
	@Test(priority = -1 ,invocationCount=2,enabled=false)
	public void test3() {
		System.out.println("hii Test3");
	}
}
