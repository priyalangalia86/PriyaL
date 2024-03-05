package basicsofjava;

import java.util.Date;

public class Assignment42
{

	public static void main(String[] args)
	{
	
		
		Date d1 = new Date();
		
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime() + (1000*60*60*24*10));
		Date d4 = new Date(d1.getTime() + (1000*60*60*24*-10));
		
		System.out.println(d2 );
		String d3=d2.toString();
	String month=	d3.substring(4, 7);
	System.out.println(month);
	
	String date = d3.substring(11, 13);
		System.out.println(date);
		
		String year = d3.substring(24, 28);
				System.out.println(year);
		
				System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		
System.out.println(d2);
System.out.println(d4);
	}

}
