package basicsofjava;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment45 {

	public static void main(String[] args)
	{
		int a[]= new int [3];
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<=3;i++) 
			
		{
			System.out.println("enter the value of Array");	
         a[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

}
