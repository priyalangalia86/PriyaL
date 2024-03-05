package basicsofjava;


class M2 
{
void Priya()
{
System.out.println("Family");	
}
}

public class Assignment35 extends M2

{ void Priya()
	{super.Priya();
	System.out.println("M&M");
	
	}

	public static void main(String[] args) 
	{
		Assignment35 A35=new Assignment35();
		
		A35.Priya();

	}

}
