package week2.day1;

public class FindTypes {
 public static void main(String[] args) {
    
	 //TODO Auto-generated method stub
	 // Here is the input 
	 String test ="$$ Welcome to 2nd Class of Automation $$";
	 
	 // Here is what the count you need to find 
	 int letter =0,space =0, num =0,specialChar =0;
	 // Build the logic to find the count of each
	  /* Pseudo code:
	     a) Covert the String to character array 
	     b) Traverse through each character (using loop)
	     c) Find if the given character is what type using (if)
	            i) character.isLetter
	            ii) character.isDigit
	            iii) character.isSpaceChar
	            iv) else -> consider as special character
	            
	       */
	 
	 
char[] charArray = test.toCharArray();
 for (char c : charArray) {
	 if(Character.isDigit(c)) {
		 num++;
	 }else if (Character.isLetter(c)) {
		 letter++;
	 }else if(Character.isSpaceChar(c)) {
		 space++;
	 }else {
		 specialChar++;
		 
	 }
 }
 // Print the count here 
    System.out.println("letter: " + letter);
    System.out.println("space:" + space);
    System.out.println("number: " + num);
    System.out.println("specialCharacter: " + specialChar);
    
	 
}

}
