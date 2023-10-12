package TESTNG_Group;

import org.testng.annotations.Test;

public class sample1 {
   @Test
   public void demo1() {
	   System.out.println("hii demo1");
   }
   
   @Test(groups= "smoke")
   public void demo2() {
	   System.out.println("hii demo2");
   }
}
