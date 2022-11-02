package Lab_Loop;

import java.util.Scanner;

public class Nested_IF
{

	public static void main(String[] args)
	{
		System.out.print("enter your percentag to know your grade : ");
		 Scanner sc=new Scanner(System.in);
		int per=sc.nextInt();
		
		System.out.println("percentage :"+per);
		

		if(per>=90)
		{
				System.out.print("you get grade A");
			
		}
		
		else if(per>=84)
		   {
					System.out.print("you get grade A1");
				
		   }
		else if(per>=74)
		  {
				System.out.print("you get grade b");
		  }
	    else if(per>=64)
		  {
				System.out.print("you get grade C");
		  }
		else if(per>=42)
		  {
				System.out.print("you get grade C");
		  }
		else
		  {
			  System.out.print("you are fail");
		  }
		
		

	}

}
