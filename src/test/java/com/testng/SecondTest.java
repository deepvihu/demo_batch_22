package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class SecondTest {
  @Test (priority=0)
  public void log() 
  {
	 System.out.println("login method");
	 Assert.assertEquals(false, true);
  }
  
  @Test (priority=1)
  public void search()
  {
	  System.out.println("search method");
	  Assert.assertEquals(false, true);
  }
  
  @Test (priority=2)
  public void addtocart()
  {
	  System.out.println("add to cart method");
  }
  
  @Test  (priority=3)
  public void checkout()
  {
	  System.out.println("checkout method");
  }
}
