package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Tree_Set
{

	public static void main(String[] args)
	{
		 SortedSet<String> fruits=new TreeSet<>();
		    
		    fruits.add("apple");
		    fruits.add("mango");
		    fruits.add("banana");
		    fruits.add("grapes");
		    
		    System.out.println("Fruits are:"+fruits);
		    //duplicates elements  are ignored
		    fruits.add("Apple");
		    System.out.println("after adding duplicates elements:"+fruits);
		    

	}

}
