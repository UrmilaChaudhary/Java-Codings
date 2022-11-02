package array;
/*
 * Q:-WAP of reverse order in array.
 * Name:-Urmila Chaudhary
 * Date:-20-10-22
 */

import java.util.Scanner;

public class Reverse_Array 
{

	public static void main(String[] args)
	{
		int i, j=0;
		
		// creating object of scanner
		Scanner sc = new Scanner(System.in);
		
		// taking input from user
		System.out.println("Enter the size of array : ");
		int n= sc.nextInt();
		int array[] = new int[n];
		int rev[] = new int[n];
		
		System.out.println("Enter elements ");
		
		// using for loop
		for(i=0;i<n;i++)	
		{
			
			array[i] = sc.nextInt();
		}
			
		System.out.println("Array in Reverse order : ");
		
		// using for loop
		for(i=n;i>0;i--,j++)	
		{
			
			rev[j] = array[i-1];
			
			System.out.println(rev[j]);	
		}

	}

}

