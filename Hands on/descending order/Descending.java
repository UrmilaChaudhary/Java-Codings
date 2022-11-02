package array;
/*
 * Q:- WAP to print number in  Descending order .
 * Name:-Urmila Chaudhary
 * Date:-20-10-22
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Descending 
{

	public static void main(String[] args)
	{
		// creating object of scanner
		Scanner sc = new Scanner(System.in);
		
		// taking input from user
		System.out.println("Enter the size of array ");
		int a = sc.nextInt();
		Integer array[] = new Integer[a];
				
		System.out.println("Enter elements ");
		
		//using for loop
		for(int i=0;i<a;i++)	
		{
			array[i] = sc.nextInt();
		}
		
		//Print original array
		System.out.println("Original array " +Arrays.toString(array));
		
		
		//sort the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("descending array is" +Arrays.toString(array));

	}

}
