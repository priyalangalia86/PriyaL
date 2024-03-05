package basicsofjava;

import java.util.Scanner;

public class Assignment27 {
	
 void add() {
	
 Scanner s1=new Scanner(System.in);
         int a= s1.nextInt();
         int b= s1.nextInt();
        
         int sum = a+b;
         System.out.println(sum);
}
 
 void sub() {
		
	 Scanner s1=new Scanner(System.in);
	         byte a= s1.nextByte();
	         byte b= s1.nextByte();
	        
	         int c = a-b;
	         System.out.println(c);
	}
 
 void mul() {
		
	 Scanner s1=new Scanner(System.in);
	         short a= s1.nextShort();
	         short b= s1.nextShort();
	        
	         int c = a*b;
	         System.out.println(c);
	}
	
 void div() {
		
	 Scanner s1=new Scanner(System.in);
	         long a= s1.nextLong();
	         long b= s1.nextLong();
	        
	         long c = a/b;
	         System.out.println(c);
	}
 
 void mod() {
		
	 Scanner s1=new Scanner(System.in);
	         double a= s1.nextDouble();
	         double b= s1.nextDouble();
	        
	         double c = a%b;
	         System.out.println(c);
	}
		
		
		
	

	public static void main(String[] args)
	{
		Assignment27 a1= new Assignment27();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();
		
 
 

	}
}
