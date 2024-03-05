package basicsofjava;
abstract class Pkl
{
	abstract void add();
	
	abstract void subtract();
}

public class Assignment37 extends Pkl
{        void add()
	{
	System.out.println("Myra");
	}
void subtract()
{System.out.println("Meera");
	}
	public static void main(String[] args) 
	{
				Assignment37 A37=new Assignment37();
		
		A37.add();
		A37.subtract();
	}

}
