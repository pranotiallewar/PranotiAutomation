package POM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@Test// all test method are written under @Test annotation
	public void test1 () 
	
	{
		System.out.println("TEST1 EXECATED");
	}
	
	@Test
	public void test2() 
	
	{
		System.out.println("TEST2 EXECATED");
	}
	
	@Test

	
	public void test()
	{
		
		System.out.println("TEST EXECATED");
	}
	
	@BeforeClass
     public void beforeClass() 
	{
		
		System.out.println("BEFORE CLASS  EXECATED");
	}
	
	@AfterClass
    public void afterClass() 
	{
		
		System.out.println("AFTER CLASS  EXECATED");
	}
	
	@BeforeMethod
      public void beforemethod()
	{
		
		System.out.println("BEFORE METHOD EXECATED");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AFTER METHOD EXECATED");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BEFORE TEST EXECATED");
	}	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AFTER TEST EXECATED");
	}
		
	
}


