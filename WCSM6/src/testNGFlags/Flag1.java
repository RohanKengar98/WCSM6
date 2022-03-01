package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;
//priority flag

public class Flag1 {
  @Test(priority =1)
  public void x()
  {
	  Reporter.log("x method",true);
  }
  
 
  @Test(priority =2)
  public void w()
  {
	  Reporter.log("w method",true);
  }
  
  
  @Test(priority =2)
  public void j()
  {
	  Reporter.log("j method",true);
  }
  
  
  
  @Test(priority = 0)
  public void c()
  {
	  Reporter.log("c method",true);
  }
  
  
  @Test
  public void b()
  {
	  Reporter.log("b method",true);
  }
  
  @Test(priority =3)
  public void p()
  {
	  Reporter.log("p method",true);
  }
  
  
  @Test(priority =3)
  public void g()
  {
	  Reporter.log("g method",true);
  }
  
  
  @Test(priority = -1)
  public void h()
  {
	  Reporter.log("h method",true);
  }
  
  
  @Test(priority =2)
  public void q()
  {
	  Reporter.log("q method",true);
  }
}