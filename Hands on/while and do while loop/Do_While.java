/* Program to demonstrate do while and print  the reverse counting from the user input number
 * name : Urmila Chaudhary
 * date 12/10/22
 */

package Loops;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//Taking input
		System.out.print("Enter number of counts : ");
		int count = sc.nextInt();
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println();
		//do while loop
		do
		{
				System.out.print(n+"  ");
				n--;
				count--;		
		}
		
		while(count>=1);


	}

}
