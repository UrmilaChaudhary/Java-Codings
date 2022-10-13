package Lab_Loop;
import java.util.Scanner;

public class natural_num 
{

	public static void main(String[] args) 
	{
		int i=1;
        int sum = 0;
        System.out.println("Enter Number  :");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
         while(i<= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
		    }
}

