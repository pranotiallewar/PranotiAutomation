package Automation;

public class Demo2Exception {
	
		
		public void mathematicalOperation(int a, int b)
		{
			System.out.println (a*b);
			
			try
			{
			   System.out.println(a/b);
			}
			finally 
			{
				System.out.println("Thanks for using");
				
			}
			
			System.out.println("No Exception");
			
			
		    }
		public  static void main(String[]args) {
			Demo2Exception obj = new Demo2Exception();
			obj.mathematicalOperation(5,0);
			
		}

	}



