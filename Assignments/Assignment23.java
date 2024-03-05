package basicsofjava;

public class Assignment23 
{       String name = "Priya";

	
	static void add () 
	{
		int a = 100;
		int b = 200;
		int sum = (a+b);
		
		System.out.println(sum);
	}
	
	void sub ()
	{
	int a=100;
	int b= 300;
	int sum = b-a;
	
	System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		 add();
		 Assignment23 A23 = new Assignment23 ();
		 A23.sub();
		 System.out.println(A23.name);
		 

	}

}
