package Collections;
/*Q5:- write a program to get the element in treeset which is strictly greater
 *   than or equal to the given element
 * Name :- Urmila Chaudhary
 * Date:-03-11-22
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_Q5
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> n = new PriorityQueue<>(5, Collections.reverseOrder());
	      
		   // Add numbers in the Queue
		   n.add(1);
		   n.add(5);
		   n.add(24);
		   n.add(8);
		   n.add(56);
		   System.out.println("\nOriginal Priority Queue: "+n);

		System.out.print("\nMaximum Priority Queue: ");
		Integer val = null;
		while( (val = n.poll()) != null)
		{
		    System.out.print(val+"  ");
		}
			  System.out.print("\n");

	}

}
