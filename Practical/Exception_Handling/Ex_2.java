package Exception_Handling;

class Ex_2
{
	//creating static method
	public static void dividebyzero()
		{
			//throw an exception
			throw new
			ArithmeticException("Trying to divide by 0");
		}
	public static void main(String[] args)
		{
		dividebyzero();

		}


}
