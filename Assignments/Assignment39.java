package basicsofjava;

interface One
{
 void add();
 void sub();
}

interface Two
{
	void mul();
	void div();
}

interface Three
{
	void add1();
	void add2();
}
interface Four
{
	void mul1();
	void div2();
}
public class Assignment39 implements One, Two, Three, Four
{

	public static void main(String[] args)
	{
		Assignment39 A39=new Assignment39();
		A39.add();
		A39.add1();
		A39.add2();
		A39.div();
		A39.div2();
		A39.mul();
		A39.mul1();
		A39.sub();
		
		

	}

	
	public void mul1()
	{
		
		System.out.println("Logic 1");
	}

	public void div2() 
	{
		System.out.println("Logic 2");
		
	}

	
	public void add1()
	{
		
		System.out.println("Logic 3");
	}


	public void add2() 
	{
		
		System.out.println("Logic 4");
	}

	
	public void mul()
	{
		System.out.println("Logic 5");
		
	}

	
	public void div()
	{
		
		System.out.println("Logic 6");
	}

	
	public void add()
	{
		System.out.println("Logic 7");
		
	}

	
	public void sub()
	{
		System.out.println("Logic 8");
		
	}

}
