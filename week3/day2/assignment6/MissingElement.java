package week3.day2.assignment6;

public class MissingElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
		int count = 1;
		for (int i=0; i<= a.length-1; i++) {
			if(a[i]!=i+count) {;
			System.out.println(i+count);
			count++;

			}

		}
	}

}
