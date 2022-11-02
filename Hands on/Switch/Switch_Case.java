package Loops;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);//Taking Input
		System.out.println("Enter the startig Alpha : ");
		String weaks = sc.nextLine();
		
		switch (weaks)//Switch Case
		{
		case "M":
			System.out.println(" Monday");
			break;
		case "T":
			System.out.println("Tuesday");
			break;
		case "W":
			System.out.println(" Wednesday");
			break;
		case "TH":
			System.out.println("Thusday");
			break;
		case "F":
			System.out.println("Friday");
			break;
		case "SA":
			System.out.println("Saturday");
			break;
		case "SU":
			System.out.println("Sunday");
			break;
			default://When the user put default value
			
		}

	}

}
