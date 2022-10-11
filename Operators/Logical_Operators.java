package Operators;

class Logical_Operators {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int a = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int b = sc.nextInt();

		System.out.print("Enter the third No. : ");
		int c = sc.nextInt();
		
		System.out.println();
		System.out.println("Performing AND operations");
		//using logical AND to verify Constraint
			
		if((a<b)&&(b==c))
			
		{
			int sum = a+b+c;
			System.out.println("Sum is : " + sum);
		}
			else {
			System.out.println("false condition");
		}
		System.out.println();
		System.out.println("Performing OR operations");
		//using logical OR to verify String
		
		if((a<b)||(b==c))
			
		{
			int sum = a+b+c;
			System.out.println("Sum is : " + sum);
		}
			else {
			System.out.println("false condition");
		}
		System.out.println();
		System.out.println("Perform NOT operation");
		
		System.out.println("!(a<b)" + !(a<b));
		
		System.out.println("!(b==c)" + !(b==c));
	}

}
