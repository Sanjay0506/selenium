package week2.day1;

public class Charctercount {
	public static void main(String[] args) {

		//TODO Auto-generater method stub
		String str = "welcome to chennai";
		int totelCharacters =0;
		char temp;
		for (int i =0;i< str.length(); i++) {

			temp =str.charAt(i);
			if (temp == 'e')
				totelCharacters++;

		}
		System.out.println("e appears" + totelCharacters + "times in example");


	}

}
