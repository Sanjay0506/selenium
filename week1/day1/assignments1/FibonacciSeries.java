package week1.day1.assignments1;

public class FibonacciSeries {
	// * Goal: To find Fibonacci Series for a given range
	// input(range) : 8 output: 0,1,1,2,3,5,8,13
	public static void main(String[] args) {
		int n =8, firstTeam = 0, secondTeam = 1;
		System.out.println("Fibonscci Series till " + n + " terms:");

		for (int i =1; i<= n; ++i) {
			System.out.println(firstTeam +",");
			int nextTeam = firstTeam + secondTeam;
			firstTeam = secondTeam;
			secondTeam= nextTeam;

		}




	}	

}
