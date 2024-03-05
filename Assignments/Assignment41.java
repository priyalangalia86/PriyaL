package basicsofjava;
public class Assignment41 {
	
public static void main(String[] args)
	{
	String a="malayalam";	
	String b="";
	for(int i=0;i<a.length();i++)
	{
		char c= a.charAt(i);
		b=c+b;
	}
	System.out.println(a.equals(b) + " it is a Palindrome");
	
	
	
	}

}
