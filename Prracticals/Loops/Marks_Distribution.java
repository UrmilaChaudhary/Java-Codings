/*.demonstrate if-else statement of 5 subjects.the person who gets above 60% will be 
 passed otherwise failed.output should be like:Enter your name,Enter marks for the 5 
 subjects.
 * Name : urmila Chaudhary
 * Date : 11/10/22
 */

package Loops;

import java.util.Scanner;

public class Marks_Distribution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your SPM Marks: ");
		int a=sc.nextInt();
		System.out.println("Enter your AWP Marks: ");
		int b=sc.nextInt();
		System.out.println("Enter your NGT Marks: ");
		int c=sc.nextInt();
		System.out.println("Enter your IOT Marks: ");
		int d=sc.nextInt();
		System.out.println("Enter your AI Marks: ");
		int e=sc.nextInt();
		
			int per = ((a+b+c+d+e)/5);
			if(per>=60)	{
				
				
				System.out.println("Your are Pass ");
				
			}
			else	{
				System.out.println("You are Fail ");
			}

		
	}

}
