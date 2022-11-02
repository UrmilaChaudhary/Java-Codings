/*	to demonstrate while loop continues until entered number is positive and take input from user.
 * 	name : Urmila Chaudhary
 * 	Date 12/10/22
 */

package Loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//while loop
		while(true)
		{
			//Taking input from users
			System.out.print("Enter any number : ");
			int x = sc.nextInt();
				
			//if condition
			if(x<0) {
				System.out.println("THE END");
				break;
			}
		}

	}

}
