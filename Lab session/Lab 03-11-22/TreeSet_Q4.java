package Collections;
/*
 * Q4:-write a program to get the element in treeset which is strictly greater 
 *    than or equal to the given element
 *  Name:- Urmila Chaudhary
 *  Date:-03-11-22
 */
import java.util.TreeSet;

public class TreeSet_Q4 
{

	public static void main(String[] args)
	{
		// creating TreeSet 
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		     
		   // Add numbers in the tree
		   tree_num.add(10);
		   tree_num.add(22);
		   tree_num.add(36);
		   tree_num.add(25);
		   tree_num.add(70);
		   tree_num.add(82);
		   tree_num.add(89);
		   
		   System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
		   System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));
		   }    

}
