package basicsofjava;

public class Assignment19 

{
	Assignment19()
	{
		System.out.println("A");
	}
	Assignment19(int z )
	{
		System.out.println("B");
	}
	
	Assignment19(int a, double b){
		System.out.println("C");
	}
	
	Assignment19(byte d ){
		System.out.println("D");
	}
	
	Assignment19(double a1){
		System.out.println("E");
	}
	
	Assignment19( String x){
		System.out.println("F");
	}
	
	Assignment19(char y){
		System.out.println("G");
	}
	
	Assignment19(String v, char w)
	{System.out.println("H");}
	
	Assignment19(boolean h){
		System.out.println("I");
	}
	
	Assignment19( double c, int q)
	{
		System.out.println("J");
	}
	

	public static void main(String[] args) 
	
	{
		
		
		new Assignment19();
		
		new Assignment19(100);
		
		new Assignment19(100, 5.5);
		
		new Assignment19(125);
		
		new Assignment19(56.3);
		new Assignment19( "priya");
		new Assignment19('m');
		new Assignment19("myra", 'h');
		new Assignment19(true);
		new Assignment19(5.2 , 45);
	
	}
}
	


