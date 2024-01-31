package TestNCuc;

import org.testng.annotations.Test;

public class MultipleTestr {
  @Test(priority= 1)
  public void test1() {
 System.out.println("Hello");
	  
  }
  @Test(groups= {"sanity"}, priority=2)
public void test2() {
	  
	System.out.println("Hello selenium");  
  }
  @Test(priority=3)
public void test3() {
	  
	System.out.println("I am coming for you");  
  }

  @Test(groups= {"sanity"}, priority=0)
  public void test4() {
  	  
  	System.out.println("I am coming for you");  
    }
  
}
