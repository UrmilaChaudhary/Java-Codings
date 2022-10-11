/*
 * Test whether the person is eligible to give vote using (if-else)
 * Name ; urmila Chaudhary
 * Date : 11/10/22
 */

package Loops;

import java.util.Scanner;

public class Eligibility_Check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		
		int x = sc.nextInt();
		
		if(x>=18) {
	
			System.out.println("You are Eligble to Vote");
		}
		else
		{
			
			System.out.println("You are Not Eligible to vote ");
		}

	}

}
