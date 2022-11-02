package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset_Linked
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> obj1=new LinkedHashSet<>();
		//using add method()
		
		obj1.add("JK");
		obj1.add("V");
		obj1.add("JIMIN");
		
		System.out.println("LinkedHashset is:"+obj1);
		
		System.out.println("LinkedHashset using iterator:");
		
		//calling iterator() method
		Iterator<String>obj2=obj1.iterator();
		while(obj2.hasNext()) 
		{
		
		System.out.print(obj2.next());
		
		System.out.print(",");
		}

	}

}
