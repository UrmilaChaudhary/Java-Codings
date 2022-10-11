package Operators;

class Assignment_Operators {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int a = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int b = sc.nextInt();
		
		//adding and assigning values
		a+= b;
		System.out.println("a = : " + a);
		
		a-= b;
		System.out.println("a = : " + a);
		
		a*= b;
		System.out.println("a = : " + a);
		
		a/= b;
		System.out.println("a = : " + a);
		
		a%= b;
		System.out.println("a = : " + a);
	}

}
