package basicsofjava;

class Super_Class{
	
	static void add(int a, int b)
	{
	System.out.println(a+b);	
	}
}

public class Assignment31 extends Super_Class
{
	static void sub(int a, double b)
	{
		System.out.println(a-b);
	}
    
	static void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		add(5,-5);
		sub(10,8.5);
		multiply(5,10);

	}

}
