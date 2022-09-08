package POM;

public class BufferAndBuilder {
	public static void main(String[] args) {
		String s = "Velocity";
		
		s.concat("katraj");
		
		 System.out.println(s);
		 
		 StringBuffer sf = new StringBuffer("Hello");
		 sf.append("Everyone");
		 
		 System.out.println(sf);
		 
		 StringBuilder sb = new StringBuilder("Good");
		 sb.append("Morning");
		 
		 System.out.println(sb);
		 
		 System.out.println(sf.reverse());
		 
		
		
	}
	
	

}
