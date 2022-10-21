package array;
/* Program to print Reverse of String
 * Name : Urmila Chaudhary
 * Date : 21-10-22
 */

import java.util.Scanner;

public class String_Rev_Array 
{

	public static void main(String[] args)
	{
		// creating 0bject of scanner 
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user
		System.out.print("Enter word : ");
		String x = sc.nextLine();
		char[] y= x.toCharArray();
		
		//System.out.println();
		
		//Printing values of String in reverse
		System.out.print("Reverse String is : ");
		
		//Using for loop
		for(int i=y.length-1;i>=0;i--)
		{
			System.out.print(y[i]+"");
		}
	}

}
