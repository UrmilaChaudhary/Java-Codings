/*Print any multiplication table using for loop. take the input from the user in all the program.
 * Name : Urmila Chaudhary
 * Date :11/10/22
 */

package Loops;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
			int x = sc.nextInt();
			
		for(int j=1;j<=10;j++)	{
			
			System.out.println(j+" * "+ j +" = "+x*j);

	}		

	}

}
