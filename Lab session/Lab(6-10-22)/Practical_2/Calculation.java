/*	Program: Create a program for calculation read three values from the user for operation. First and second values 
 * 	are operands and Third value as operator.
 *	Name : Urmila Chaudhary
 *	date : 6/10/22
 */

package Practical_2;

public class Calculation {

	public static void main(String[] args) {
		
		int a, b, x;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// getting input from the user
	System.out.println("Enter the first number : ");
		 a = sc.nextInt();
	System.out.println("Enter the second number : ");
		 b = sc.nextInt();

	System.out.println("press 1 to add ");
	System.out.println("press 2 to divide ");
	System.out.println("press 3 to multiply ");
	System.out.println("press 4 to Substract ");
		 x = sc.nextInt();
	
		System.out.println();
	System.out.println("Answer is : ");
		switch(x)	{

		case(1):
				//Addition of two numbers
			System.out.println(a+b);
		break;

		case(2):
				//Division of two numbers
			System.out.println(a/b);
		break;

		case(3):
				//Multiplication of two numbers
			System.out.println(a*b);
		break;

		case(4):
				//Subtraction of two numbers
			System.out.println(a-b);
		break;

}

}

	}

