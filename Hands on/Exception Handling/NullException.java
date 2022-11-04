package Exception_Handling;
/*Q:-Write a Program on NullPointerException
 * Name:-Urmila Chaudhary
 * Date:-04-11-22
 */
public class NullException 
{

	public static void main(String[] args) 
	{
		// Initialize null value in String
        String str = null;
 
        // Checking if str.equals null or works fine.
        try
        {
            if (str.equals("urmila"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Found");
        }

	}

}
