/* Program : Program of multi dimensional array
 * Name : Urmila Chaudhary
  * Date : 17-10-22
 */

package MultiD_Array;

//importing Scanner
import java.util.*;
public class Multi_Array {

	public static void main(String[] args) {
		
		int i, j, x, y; 
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user for enter number of rows
		System.out.print("Enter the no of rows :");
		x = sc.nextInt();
		
		//Taking input from user for enter number of columns
		System.out.print("Enter the no of column : ");
		y = sc.nextInt();
		
		int array[][] = new int[x][y];
		
		//Taking Number of array from user
		System.out.println("Enter the no of array :");
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		//Printing element of array is
		System.out.println("Element of array is ");
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				//Printing values of array of i j
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println();
		}

	}
		
}

