class Object
	{
		int id;
		String name;
		static String section="BCom";
		String company;
		Object(int x, String y)
	{
	id=x;
name=y;
	}
void display()
	{
System.out.println(id+" "+name+" "+section+" "+company);
	}
public static void main(String[] args)
	{

Object a1=new Object(1,"urmila");
Object a2=new Object(2,"rakhi");
Object a3=new Object(3,"niki");
a1.company="it";
a2.company="bcom";
a3.company="bbi";

a1.display();
a2.display();
a3.display();
}}