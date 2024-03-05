package basicsofjava;

public class Assignment7 {
	
	static void add()
	{
		int a= 26000;
		int b= 80000;
		int c= a+b;
		
		System.out.println(c);
		
	}

	
	static void sub()
	{
		double d= 86000.258;
		double d1= 50000.6632;
		double d2 = d-d1;	
		
		System.out.println(d2);
	}
	
	static void mul()
	{
		int x=66000;
		int y=894752;
		int z= x*y;
		
		System.out.println(z);
		
	}
	
	static void div()
	{
		byte p= -60;
		byte q= 127;
		int r = p/q;		
		System.out.println(r);
	}
	
    static void mod()
    {
    	int l=389222;
    	int m=78542;
    	int n=l%m;
    	System.out.println(n);
    }
    
	
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		mod();
		


	}

}
