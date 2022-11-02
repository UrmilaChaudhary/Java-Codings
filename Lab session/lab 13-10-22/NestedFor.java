package Lab_Loop;

import java.util.Scanner;

public class NestedFor 
{

	public static void main(String[] args)
	{
		System.out.print("enter the number: ");
	    Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
	
	 
		
     	for (int i = 1; i <= rows; ++i) //Outer loop for rows
		{  
     		for (int j = 1; j <= i; ++j)  //Inner loop for Col
     			{

     				System.out.print("* ");

     			}

     				System.out.println();

		 }

	}

}
