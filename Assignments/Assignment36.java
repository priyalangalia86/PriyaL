package basicsofjava;

public class Assignment36 {
	int a;
	String b;
	void add (int a, String b ) 
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args)
	{
		Assignment36 A36= new Assignment36 ();
		
		A36.add(100,"priya");
		System.out.println(A36.a);
		System.out.println(A36.b);

	}

}
