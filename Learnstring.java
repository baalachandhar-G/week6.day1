package week6.day1;

public class Learnstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= " Welcome to Test Leaf   ";
		
		String s2="Welcome";
		
		
	//	String s3= new String("Welcome");
		
	//	String s4= new String("Welcome");
		
		
		// Comparing the value
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.length());
		
		// Comparing the Memory
		
		System.out.println(s1==s2);
		
		//
		System.out.println(s1.toCharArray());
		
		System.out.println(s1.charAt(0));
		
		System.out.println(s1.indexOf('c'));
		
		System.out.println(s1.trim().substring(1));
		
		System.out.println(s1.substring(1, 7));
		
		String[] split = s1.trim().split(" ");
		
		System.out.println(split[2]);
		
		System.out.println(s1.replace("Test", "Grow"));
		
		System.out.println(s1.replace(" ", ""));
		
		
	}

}
