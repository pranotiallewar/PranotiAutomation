package Automation;

public class DemoException {
	public void mathematicalOperation (int a,int b)
	{
		System.out.println(a*b);
	 
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Invalid input by user");
			e.printStackTrace();
		}
	
		System.out.println("Thanks for using");
	}
	
	public static void main(String[]args) {
		DemoException obj =new DemoException();
		obj.mathematicalOperation(5, 0);
		
	}
}
		



