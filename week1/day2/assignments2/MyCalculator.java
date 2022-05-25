package week1.day2.assignments2;

public class MyCalculator {
	//accessModifier returnType methodName(args){actions}
	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		Calculator calc = new Calculator();
	int add = calc.addThreeNumbers(5, 11, 40);
	System.out.println(add);
	int sub = calc.subToTwoNumbers(5, 11);
	System.out.println(sub);
	double mul = calc.multToTwoNumbers(7.11, 22.33);
	System.out.println(mul);
	float divide = calc.divideToTwoNumbers(125f, 789f);
	System.out.println(divide);
	
	}

}
