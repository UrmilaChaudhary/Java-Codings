package type_casting;

import java.util.Scanner;

public class array {

	public static void main(String[] args)
	{
		int n;  
		 
		System.out.print("Enter the number of elements you want to store: ");  
		Scanner sc=new Scanner(System.in); 
		//reading the number of elements from user
		n=sc.nextInt();  
		//creates an array  
		int[] array = new int[n];  
		
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}   
	}

}
