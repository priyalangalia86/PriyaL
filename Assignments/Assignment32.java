package basicsofjava;

class Super_Most
{
	void add(int a, int b ) 
	{
		System.out.println(a+b);
		
	}
}

class Super extends Super_Most
{
	
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
}

public class Assignment32 extends Super
{
	
	void mul(int a, int b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) 
	{
		 Assignment32 A32=new  Assignment32();
		 A32.add(36, 63 ); 
		 A32.sub(36, 63 );
		 A32.mul(36, 63 );
		 
		

	}

}
