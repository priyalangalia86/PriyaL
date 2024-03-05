package basicsofjava;

public class Assignment47 {

	public static void main(String[] args) 
	{
		String a = "mango123";
		      char a1[] =  a.toCharArray();
		    		  
		    		  for(int i=0; i<=a.length()-1;i++)
		    		  {		  
		  boolean answer = Character.isAlphabetic(a1[i]);
		  
		  if(answer==true)
		  {
			  System.out.println("it is alpha");
		  }
		  else
		  {System.out.println("it is numeric");}
		  
		    		  }

	}

}
