package basicsofjava;
// method overloading

public class Assignment18 {
	
	static void add()
	{
		System.out.println("My name is Priya");
	}
	
	static void add(int a)
	{
		System.out.println("My last name is Langalia");
	}
	
    static void add (double c)
    {
    	System.out.println("I have 2 beautiful daughters");
    }
    
    static void add (String d)
    {
    	
    	System.out.println("Myra and Meera");
    }
    
    void add(int e, double f)
    {
    	System.out.println("I have a loving husband");
    }
    
    void add (double a1, int b1)
    {
    	System.out.println("We are a happy family");
    }
    
    void add(char b1)
    {
    	System.out.println("We live in London");
    }
    
    void add(boolean d1)
    {
    	System.out.println("Langalia Family");
    }
	public static void main(String[] args)
	{
		add();
		add(100);
		add (5.6);
		 add ("priya");
		 
		 Assignment18 A18 = new Assignment18();
		  A18.add(200, 6.6);
		  A18.add(6.3, 300);
		  A18.add('s');
		  A18.add(true);
		 
		 
		

	}

}
