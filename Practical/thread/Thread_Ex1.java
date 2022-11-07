package thread;

public class Thread_Ex1 extends Thread
{
	public static int amount=0;
	public static void main(String[] args) 
	{
		Thread_Ex1 te=new Thread_Ex1();
		te.start();
		System.out.println(amount); 
		amount++;   
		System.out.println(amount);

	}
	public void run()
	{
		amount++; 
	}

}
