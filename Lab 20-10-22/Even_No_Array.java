package array;
/* Q:- WAP to Enter even number in array and print in AscendingOrder 
 * name : Urmila Chaudhary
 * Date : 20-10-22
 */

import java.util.Arrays;
import java.util.Scanner;

public class Even_No_Array 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.print("Enter the size of array : ");
		int x= sc.nextInt();
		
		//Initializing array
		int array[] = new int[x];
				
		//System.out.println();
		//Printing Statement
		System.out.println("Enter the Number : ");
		
		//Using for Loop
		for(int i=0;i<x;i++)	
		{

			int n=sc.nextInt();
			if(n%2==0) {
			array[i] = n;
			}else {
				array[i]=1;
			}
		}
		Arrays.sort(array);

		System.out.println();
		//Printing Even numbers
		System.out.print("Even Number is : (");
		
		//Using for Loop
		for(int i=0;i<x;i++)	
		{	
			if(array[i]%2==0) {	
				System.out.print(array[i]+" ");
			}			
	}	
		System.out.print(")");
}

}

