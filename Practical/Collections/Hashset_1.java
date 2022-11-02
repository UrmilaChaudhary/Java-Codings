package Collections;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset_1 
{

	public static void main(String[] args)
	{
		HashSet<String> obj1=new HashSet<>();    
		//using add method()
		
		obj1.add("Urmila");
		obj1.add("Aditya");
		obj1.add("Vishal");
		
		System.out.println("Hashset is:"+obj1);
		
		//calling iterator() method
		Iterator<String> obj2=obj1.iterator();
		
		System.out.println("hashset using iterator:");
		
		// hasnext() is method to check next value in array
		while(obj2.hasNext())	
		{
			System.out.print(obj2.next());
			
			System.out.print(",");
		}
		

	}

}
