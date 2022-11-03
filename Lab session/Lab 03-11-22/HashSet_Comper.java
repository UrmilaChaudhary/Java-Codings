package Collections;
/*
 *Q3:- write a program to compare two sets and retain elements which are
 *     same on both sets using retainAll method
 * Name:-Urmila Chaudhary
 * Date:-03-11-22
 */

import java.util.HashSet;

public class HashSet_Comper 
{

	public static void main(String[] args)
	{
		// Create a hash set
        HashSet<String> h_set1 = new HashSet<String>();
        
        // use add() method to add value
          h_set1.add("URMILA");
          h_set1.add("RAKHI");
          h_set1.add("NIKITA");
          h_set1.add("RITIKA");
          System.out.println("Frist HashSet : "+h_set1);
          
          // Create a hash set
          HashSet<String>h_set2 = new HashSet<String>();
          
       // Create a empty hash set
          h_set2.add("TULSI");
          h_set2.add("EKTA");
          h_set2.add("RAKHI");
          h_set2.add("URMILA");
          System.out.println("Second HashSet : "+h_set2);
          
          
          h_set1.retainAll(h_set2);
          System.out.println("Same element are :");
          System.out.println(h_set1);

	}

}
