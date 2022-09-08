package POM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodOfTestNG {
	@Test(priority = 2, timeOut = 2000)
	public void test1() throws InterruptedException {
	    Thread.sleep(3000);
	    System.out.println("Test1 executed");
	}
	@Test(priority = 1, invocationCount = 2)
	public void test2()
	{
	    System.out.println("Test2 executed");
	}
	
	@Test(priority = 3,enabled = false)
	public void test() 
	{
	    System.out.println("Test executed");
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test4() 
	{
	    System.out.println("Test 4 executed");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method executed");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method executed");
	}
}
	


