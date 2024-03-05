package basicsofjava;

class Myra
{
	Myra(int a)
	{
		System.out.println("Myra Constructor");
	}

}

class Meera extends Myra
{
	Meera(int b)
	{
		super(100);
		System.out.println("Meera Constructor");
	}

}

public class Assignment34 extends Meera
{
	
	Assignment34()
	{
		super(100);
		System.out.println("Priya");
	}
    
	public static void main(String[] args) 
	{
	 
		
		new Assignment34();
		

	}

}
