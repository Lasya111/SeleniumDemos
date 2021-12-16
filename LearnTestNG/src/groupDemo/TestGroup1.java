package groupDemo;

import org.testng.annotations.Test;

public class TestGroup1 {
	
  @Test(groups = {"smoke"})
  public void Test1() 
  {
	  System.out.println("My first smoke test case");
  }
  
  @Test(groups = {"smoke"})
  public void Test2()
  {
	  System.out.println("My second smoke Test case");
  }
  
  @Test(groups = {"functional"})
  public void Test3()
  {
	  System.out.println("My first functional test case");
  }
  
  @Test(groups = {"regresstion"})
  public void Test4()
  {
	  System.out.println("My first regression test case");
  }
}
