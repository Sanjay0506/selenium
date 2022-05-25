package week1.day2.assignments2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int count = 1;
		for (int i : arr) {
			if(i != count ) {

				System.out.println("Missing element in the array " + count);
				break;
			}
			count++;	
		}

	}

}
