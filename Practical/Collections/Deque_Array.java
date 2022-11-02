package Collections;

import java.util.ArrayDeque;

public class Deque_Array
{

	public static void main(String[] args)
	{
		ArrayDeque<String> obj1 = new ArrayDeque<>();
		
		obj1.add("urmila");
		obj1.add("ritika");
		
		//using addFirst() method
		obj1.addFirst("rakhi");
		
		//using addLast() method
		obj1.addLast("nikita");
		obj1.addLast("ekta");
		System.out.println("Array Deque: " + obj1);


	}

}
