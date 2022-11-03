package Collections;
/*
 * Q2 :-write a java program to check if a particular element exists in a linked list
 * Name:-Urmila Chaudhary
 * Date:-03-11-22
 */

import java.util.LinkedList;

public class LinkedList_Check
{

	public static void main(String[] args)
	{
		 // create an empty linked list
		  LinkedList <String> BTS = new LinkedList <String> ();
		          
		          BTS.add("RM");
		          BTS.add("J-HOPE");
		          BTS.add("SUGA");
		          
		          
		     System.out.println("rappers of BTS member : " + BTS);
		           
		     // Checks whether the suga exists or not.
		    if (BTS.contains("SUGA"))
		    {
		       System.out.println("SUGA is a rapper of BTS band. ");
		    }
		    else 
		    {
		       System.out.println("SUGA is not a rapper of BTS band." );
		    }
		    
		     // Checks whether the jk exists or not.
		    if (BTS.contains("JK")) 
		    {
		       System.out.println("JK is a rapper of BTS band.");
		    }
		    else 
		    {
		       System.out.println("JK is not a rapper of BTS band.");
		     
		    }

	}

}
