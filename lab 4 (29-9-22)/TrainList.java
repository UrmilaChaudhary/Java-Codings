public class delhiexp{
	
	int train_number;
	String timing;

	public delhiexp(int train_number,String timing) {
		super();
		this.train_number=train_number;
		this.timing=timing;
		
	}
	public String toString() {
		return "delhiexp Train number is : "+train_number+ " "+"Time is :"+timing;
	}

}
public class kanpurexp {

	int train_number;
	String timing;

	public kanpurexp(int train_number,String timing) {
		super();
		this.train_number=train_number;
		this.timing=timing;
		
	}
	public String toString() {
		return "kanpurexp Train number is :" +train_number+ " "+"Time is :"+timing;
	}

}
public class Train {
	String Station;
	int Platform_no;
	delhiexp delhiexp;
	kanpurexp kanpurexp;
	
	
	public Train(delhiexp delhiexp,kanpurexp kanpurexp,String Station,int Platform_no) {
		super();
		this.delhiexp=delhiexp;
		this.kanpurexp=kanpurexp;
		this.Platform_no=Platform_no;
		this.Station=Station;
	}
	
	void display()
	{
		System.out.println(delhiexp);
		System.out.println(kanpurexp);
		System.out.println("Platform number is "+Platform_no);
		System.out.println("The Station name is "+Station);
	}
	

}
public class TrainList
{

	public static void main(String[] args) {
		
		
		delhiexp r1 = new delhiexp(0404, "6.00 pm");
		kanpurexp n1 = new kanpurexp(7777,"7.00 am");
		Train p1 = new Train(r1,n1,"delhi+",3);
		p1.display();

	}

}