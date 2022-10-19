package array;

import java.util.Arrays;
import java.util.Scanner;

public class Short_Array
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int s=sc.nextInt();
		
		int a[]=new int[s];
		
		System.out.println("Enter the "+ s+ " elements ");
		
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		//to arrange arrays in ascending order we used sort method.
		Arrays.sort(a);
		System.out.println("short number is ");
		
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		
	}

}

