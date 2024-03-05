package basicsofjava;

import java.util.Arrays;

public class Assignment46 {

	public static void main(String[] args) 
	{
		String name = "priya";
		
	char a1[]	= name.toCharArray();
	Arrays.sort(a1);
	System.out.println(Arrays.toString(a1));
	
	String name2 = "Myra";
	
	char a2[]=name2.toCharArray();
	Arrays.sort(a2);
	
	System.out.println(Arrays.toString(a2));
	
	
	
	if(name.length()==name2.length())
	{ System.out.println("It is equal");}
	
	else
	{System.out.println("It is not equal");}
	
	
	boolean answer = Arrays.equals(a1, a2);
	
	System.out.println(answer);
	
	if(answer==true)
	{System.out.println("it is an anagram");}
	
	else
	{System.out.println("it is not an anagram");}
	
	
	
	{
		
	}

	}

}
