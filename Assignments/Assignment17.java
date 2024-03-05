package basicsofjava;

public class Assignment17 {
	
	void add()
	{
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
	}
	
	void sub()
	{
		int a=6000;
		int b=33000;
		
		System.out.println(b-a);
		
	}
	
	Assignment17()
	{
		System.out.println("Constructor");
	}
    
	public static void main(String[] args) 
	{
		Assignment17 A17 = new Assignment17();
		
		A17.add();
		A17.sub();
		mul();
		div();

	}
	
	static void mul()
	{
		int a=99;
		int b=2000;
		System.out.println(a*b);
		
	}
	
	static void div()
	{
		int a=50;
		int b=10;
		
		System.out.println(a/b);
		
		
		new Assignment17();
		
		
	}

}
