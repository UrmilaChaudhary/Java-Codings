package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_Descending
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		Integer array[] = new Integer[n];
			System.out.println("Enter the number : ");	
		for(int i=0;i<n;i++)	
		{
			//System.out.println();
		   array[i] = sc.nextInt();
		}
			
		//sort the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Descending array " +Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Ascending array " +Arrays.toString(array));
	}

}
