/* Program: write a program for adddition of two matrix
 * Name : Urmila Chaudhary
 * Date : 17-10-22
 */

package MultiD_Array;
import java.util.*;
public class Addition_Matrix {

	public static void main(String[] args) {
		
		int a, b, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first matrix row");
		a = sc.nextInt();
		
		System.out.println("Enter first matrix column");
		b = sc.nextInt();
		
		
	    //Taking input for first matrix from user
		int array1[][]=new int[a][b];
		System.out.println("Enter the no of first matrix ");
		
		//using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of first matrix
		System.out.println("Element of first matrix is ");
		
		//Using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				System.out.print(array1[i][j]+" ");
			} System.out.println();
			
			System.out.println();
		}
		System.out.println();
		

		int array2[][]=new int[a][b];
		//Taking input for second matrix from user
		System.out.println("Enter the no of Second matrix ");
		
		//using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of second matrix
		System.out.println("Element of second matrix is ");
		
		//using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				System.out.print(array2[i][j]+" ");
			} System.out.println();
			
			System.out.println();
		}
		System.out.println();
		
		
		int array3[][]=new int[a][b];
		
			//Addition of two numbers
			System.out.println("Adding of two matrix");
			
			//Using for loop
			for(i=0;i<a;i++)	
			{
				
				for(j=0;j<b;j++)	
				{
					array3[i][j]=array1[i][j]+array2[i][j];  
					System.out.print(array3[i][j]+" "); 
				}
				 System.out.println();
			}
		
		}
	}


