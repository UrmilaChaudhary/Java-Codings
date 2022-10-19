package array;

/*
 *  write a program of single dimensional array
 * Name : Urmila Chaudhary
 * Date : 19-10-22
 */


import java.util.Scanner;

public class single_array
{

	public static void main(String[] args)
	{
	 int a,i;
	 
    // creating scanner object
	 Scanner sc=new Scanner(System.in);
	 
	 //taking input from user 
	 System.out.println("enter the length ");
	  a = sc.nextInt();
	  
	// Create one-dimensional array with size a.
	  int array[]=new int[a];
	  System.out.println("enter the no. ");
	  
	// Store number into the array using for loop.
	  for(i=0;i<a;i++)
	  {
		  array[i]=sc.nextInt();
	  }
	  
	// printing number into the array using for loop.
	  System.out.print("array is {");
	  
	  for(i=0;i<a;i++)
	  {
		  
		  System.out.print(array[i]+" ");
	  }	
	  System.out.print("}");
	 

	}

}
