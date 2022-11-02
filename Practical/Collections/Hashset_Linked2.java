package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Hashset_Linked2
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> obj =new ArrayList<>();
		
		//using add method
		obj.add(4);
		obj.add(7);
		obj.add(10);
		System.out.println("Array list is:"+obj);
		
		//creating hashset from an array list
		LinkedHashSet<Integer> obj2=new LinkedHashSet(obj);
		
		System.out.println("Linkedhashset is:"+obj2);


	}

}
