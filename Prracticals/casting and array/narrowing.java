package type_casting;

import java.util.Scanner;

public class narrowing 
{

	public static void main(String[] args)
	{
		// input from user 
		System.out.print("enter the number : ");
		Scanner sc=new Scanner(System.in);
		float f =sc.nextFloat();
		
		//converting double data type into long data type  
		long l = (long)f; 
		
		//converting long data type into int data type  
		int i = (int)l;  
		
		// printing output
		System.out.println("float type: "+f);  
		System.out.println("long type: "+l);   
		System.out.println("int type: "+i);  
		}  
}
