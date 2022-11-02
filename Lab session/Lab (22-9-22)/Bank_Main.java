public class Bank 
{
	void Banklocation()
	{
		System.out.println("korea");
	}

	void Bank_client_name()
	{
		System.out.println("rakhi,niki,ritika,urmi");
	}

}
public class Bank_Main
 {

	public static void main(String[] args)
	{
		Bank b1 = new Bank();

		b1.Banklocation();
		b1.Bank_client_name();

		panjab_Bank p1= new panjab_Bank();

		p1.Banklocation();
		p1.Bank_client_name();
	}

}
public class panjab_Bank extends Bank 
{


	void Banklocation()			//override
	{
		System.out.println("The Bank Location is korea");
	}
	void Bank_client_name()
	{
		super.Bank_client_name();
		System.out.println("urmi,rakhi,niki,ritika");
	}


}
 