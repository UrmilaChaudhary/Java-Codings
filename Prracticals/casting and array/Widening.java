package type_casting;

import java.util.Scanner;

public class Widening {

	public static void main(String[] args) {
		// input from user 
				System.out.print("enter the number : ");
				Scanner sc=new Scanner(System.in);
				int i=sc.nextInt();
				// storing int value in long and float
				long l=i;
				float f=l;
				
				// printing output
				System.out.println("int value"+i); 
				System.out.println("long value"+l);
				System.out.print("float alue"+f);


	}

}
