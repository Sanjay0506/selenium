package week2.day1;

public class ReverseEvenWords {
	
public static void main(String[] args) {
	
	String test = "I am a software tester";
	String[] words = test.split(" ");
	char temp;
	for (int i =0; i< words.length; i++) {
		if (i % 2 == 0) {
			System.out.println(words[i] + " ");
			
		}else if (i % 2 == 1) {
			char[] t = words[i].toCharArray();
			for (int j =0; j< t.length / 2; j++);{
				temp = t[i];
				t[i] = t[t.length - 1 - i];
				t[t.length -1 -i] = temp;
				
			}
			System.out.println(String.valueOf(t)+ "");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
