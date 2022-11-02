package Collections;
import java.util.Stack;


public class Stack
{

	public static void main(String[] args)
	{
		Stack<String> obj1=new Stack<>();
		
		obj1.push("urmila");
		obj1.push("rakhi");
		obj1.push("nikita");
		obj1.push("ekta");
		
		System.out.println("Stack value: "+obj1);
		
		//pop elements from the top
		obj1.pop();
		System.out.println("Stack after pop:"+obj1);

	}

}
