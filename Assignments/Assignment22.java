package basicsofjava;

public class Assignment22 {
	
	final static double pi=3.14;
	
	void Area_of_triangle()
	{
		int base= 36;
		double height =3.6;
		double answer= height*base/2;
		
		System.out.println(answer);
		
		
	}
	
	void Area_of_rectangle()
	{
		int length = 9;
		int width = 6;
		int area_of_rectangle= length*width;
		
		System.out.println(area_of_rectangle);
	}
	
	void Area_of_square()
	{
		int side_a = 105;
		int area_of_square = side_a*side_a;	
		
		System.out.println(area_of_square);
		
	}
	
	void Area_of_trapezium()
	{
		double base_one = 45.25;
		int base_two = 96;
		double height = 36.36;
		double area_of_trapezium = base_one+base_two/2*height;		
			System.out.println(area_of_trapezium);	
				
	}

	public static void main(String[] args) 
	{
		int r=60;
		double area_of_circle = pi*r*r;
		
		System.out.println(area_of_circle);
		
		Assignment22 A22 = new Assignment22();
		
		A22.Area_of_triangle();
		A22.Area_of_rectangle();
		A22.Area_of_square();
		A22.Area_of_trapezium();
		

	}

}
