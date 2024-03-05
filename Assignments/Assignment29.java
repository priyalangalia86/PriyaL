package basicsofjava;

import java.util.Scanner;



public class Assignment29 {
	
	Scanner s1= new Scanner(System.in);
	
int a =s1.nextInt();
int b =s1.nextInt();

void add() 
{     int c = a+b;
  System.out.println(c);
	
}



void sub() 
{     int c = a-b;
  System.out.println(c);
	
}


void mul() 
{     int c = a*b;
  System.out.println(c);
	
}


void div() 
{     int c = a/b;
  System.out.println(c);
	
}

void mod() 
{     int c = a%b;
  System.out.println(c);
	
}



	

	public static void main(String[] args)
	{
		
		Assignment29 a1 = new Assignment29();
		
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();
		
	}

}
