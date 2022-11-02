package Collections;

import java.util.Vector;

public class Vector
{

	public static void main(String[] args)
	{
		Vector<String> obj1=new Vector<>();
		//Using add() method
		
		obj1.add("urmila");
		obj1.add("rakhi");
		obj1.add("ritika");
		
		System.out.println("vector is:"+obj1);
		//using index number
		obj1.add(2,"aditya");
		System.out.println("after adding vector is:"+obj1);
		
		//using addAll() method
		Vector<String>obj2=new Vector<>();
		obj2.add("ekta");
		obj2.add("nikita");
		obj2.addAll(obj1);
		System.out.println("new vector:"+obj2);
		
		//using remove() method
		String s=obj1.remove(3);
		System.out.println("Remove element :"+s);
		System.out.println("after remove vector is:"+obj1);
		
		//using clear() method
		obj2.clear();
		System.out.println("vector after:"+obj2);

	}

}
