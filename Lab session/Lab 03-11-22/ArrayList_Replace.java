package Collections;
/*
 *Q1:- write a java program to replace the second element of ArrayList 
 *    with the specified element.
 * Name:-Urmila Chaudhary
 * Date:-03-11-22
 */

import java.util.ArrayList;

public class ArrayList_Replace
{

	public static void main(String[] args)
	{
		ArrayList<String>  Name = new ArrayList<String>();

		  Name.add("Urmila");
		  Name.add("rakhi");

		  System.out.println("Original array list: " + Name);
		  String new_Name = "nikita";
		  Name.set(1,new_Name);

		  int num=Name.size();
		  System.out.println("Replace second element with 'nikita '."); 
		  
		  for(int i=0;i<num;i++)
		  {
			  System.out.println(Name.get(i));
		  }
	}

}
