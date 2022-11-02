public class Banks {

		void Banklocation()
		{
			System.out.println("thane");
		}

		void Bank_client_name()
		{
			System.out.println("urmi,rakhi");
		}

	}
public class Banks
 {

		public static void main(String[] args)
		{
			Banks b1 = new Banks();

			b1.Banklocation();
			b1.Bank_client_name();

			Kotak k1= new Kotak();

			k1.Banklocation();
			k1.Bank_client_name();
		}

}
public class Kotak extends Banks 
{


		void Banklocation()			//override
		{
			System.out.println("The Bank Location is thane");
		}
		void Bank_client_name()
		{
			super.Bank_client_name();
			System.out.println("urmi,rakhi");
		}


	}
public class Sbi_Bank 
{

	void Banklocation()
	{
		System.out.println("thane");
	}

	void Bank_client_name()
	{
		System.out.println("urmi,rakhi");
	}


}