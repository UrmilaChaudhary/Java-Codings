package Exception_Handling;
/*Q:-Write a Program on ArrayIndexOutOfBoundsException
 * Name:-Urmila Chaudhary
 * Date:- 04-11-22
 */
public class Array_OutOfBound 
{

	public static void main(String[] args)
	{
		//creating array
		int areay[] = { 1, 2, 3, 4, 5 };
		try
        {
            for (int i = 0; i <= areay.length; i++)
            {
                System.out.print(areay[i]+" ");
            }
        }
        catch (Exception e)
        {
            System.out.println("\nException Found");
        }

	}

}
