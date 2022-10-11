package Operators;

import java.util.Scanner;

class Arithmatic_Operators {

	public static void main(String[] args) {
		
			// creating scanner class object to take the input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st No. : ");
		double num1 = sc.nextInt();
		
		System.out.print("Enter 2nd No : ");
		double num2 = sc.nextInt();
		
		
		//Writing operation
	
		double add, sub, mod, mul, div;
		add = num1 + num2;
		sub = num1 - num2;
		div = num1/ num2;
		mul = num1 * num2;
		mod = num1% num2;
		
		//printing values 
		System.out.println("Addition is : " + add);
		System.out.println("Subtraction is : " + sub);
		System.out.println("division is : " + div);
		System.out.println("multiplication is : " + mul);
		System.out.println("modules is : " + mod);
	
	}

}
