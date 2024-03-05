package basicsofjava;

public class Assignment38 {

	public static void main(String[] args) {
		String name = "priya";
		String surname="langalia ";
		String husband="khanjan ";
		 int a1= name.length();
		 
		System.out.println(a1);
		
		String a2= name.toUpperCase();
		
		System.out.println(a2);
		
		char a3=name.charAt(4);
		System.out.println(a3);
		
		String a4=name.trim();
		System.out.println(a4);
		
		String a5=name.concat(surname);
		System.out.println(a5);
		
		String a6=name.concat(husband).concat(surname);
		System.out.println(a6);
		
		boolean a7=name.endsWith("a");
		System.out.println(a7);
		
		String a8=name.replace('p', 'm');
		System.out.println(a8);
		
		String a9=name.replaceAll("priya", "myra");
		System.out.println(a9);
		
		
	

	}
	

}
