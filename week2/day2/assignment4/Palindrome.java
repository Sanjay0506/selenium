package week2.day2.assignment4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		a) Declare A String value as"madam"
		String example = "madam";
		//			b) Declare another String rev value as ""
		String rev = "";
		//		c) Iterate over the String in reverse order
		for (int i = example.length()-1; i >=0; i--) {
			char charAt = example.charAt(i);
			//			System.out.println(charAt);
			//			d) Add the char into rev
			rev = rev + charAt;
			//			System.out.println(rev);
		}
		if (example.equalsIgnoreCase(rev)) {
			System.out.println("Given input string is a palindrome");
		} 
	}

}
