package TestNg;
import org.testng.annotations.Test;

public class Priority_Invocation_Enable {
      @Test(priority=-7,invocationCount=-1)
     
       public void demo1() {
    	 System.out.println("hii demo1");  
       }
      
      @Test(priority=-1,invocationCount=2,enabled=false)
      
      public void demo2() {
   	 System.out.println("hii demo2");  
      }
      
      @Test(priority=-5)
      
      public void demo3() {
   	 System.out.println("hii demo3");  
      }
    
}
