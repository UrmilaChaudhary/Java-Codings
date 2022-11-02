package array;

import java.util.Scanner;

/*Q:- WAP 4*4 matrix take the input from user.
 * Name:-Urmila Chaudhary
 * Date:-27/10/22
*/

public class Matrix_4
{

	public static void main(String[] args)
	{
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the row :");
		//taking input
		int r=sc.nextInt();
		
		System.out.println("enter the column :");
		//taking input
		int c=sc.nextInt();
		int[] [] matrix=new int[r][c];	//declaring 2d matrix
				
		System.out.println("enter the element of  matrix:");
		//for loop for row and column
		for (int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
					matrix[i][j]=sc.nextInt();
			}
		
		//for loop for printing
		for (int i=0;i<r;i++) 
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				
				System.out.println();
				sc.close();
			}
	}
}
			
