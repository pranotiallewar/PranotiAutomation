package POM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class CollectionFramework {
	public static void main(String[] args) {
		//ArrayList li = new ArrayList();
		
		//li.add("Velocity");
		//li.add(45);
		//li.add('x');
	    //li.add(40.5);
       //li.add(true);
        
        //System.out.println(li.get(0));
        //System.out.println(li.get(1));
        //System.out.println(li.get(2));
        //System.out.println(li.get(3));
        //System.out.println(li.get(4));
        
		//LinkedList<Integer> li =new LinkedList<Integer>();
		//li.add(67);
		//li.add(null);
		//li.add(null);
		//li.add(10);
		//li.add(10);
		
		//System.out.println(li.get(0));
		//System.out.println(li.get(1));
		//System.out.println(li.get(2));
		//System.out.println(li.get(3));
	
		
		//priorityQueue<String> p = new priorityQueue<String>();
		//p.add("Velocity");
		//p.add(null);
		//p.add("katraj");
		//p.add("Velocity");
		
		//Iterator i = p.iterator();
		
		//while(i.hasNext())
		//{
		//	System.out.println(i.next());
		//}
	
		//HashMap hm = new HashMap();
		//hm.put(1,null);
		//hm.put("two",null);
		//hm.put('c',"katraj");
		//hm.put(null,"pune");
		
		
		//System.out.println(hm.get(1));
		//System.out.println(hm.get(null));
		//System.out.println(hm.get("two"));
		
		//Hashtable<Integer,String> ht = new Hashtable<>();
		//ht.put(1,"pune");
		//ht.put(2,"pune");
		//ht.put(3,"Hello");
		
		//System.out.println(ht.get(1));
		//System.out.println(ht.get(2));
		//System.out.println(ht.get(3));
		
		HashSet hs = new HashSet();
		hs.add(34);
		hs.add("Hello");
		hs.add(null);
		hs.add("Hello");
		
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}	

}		

		
		
		  
	


