package week3.day1.assignment5;

public class Automation implements Language, TestTool {
	 

	public void Selenium() {
		System.out.println(testTool+" is a Automation Testing tool");
	}

	public void Java() {
		System.out.println("Java is a Language");
		this.lang();
	}
	
	public static final void callByFinal() {
		System.out.println("\ncreated a final method");
	}

	public static void main(String[] args) {
		
		Automation automation = new Automation();
		automation.Java();
		automation.Selenium();
		Automation.callByFinal();

	}

}
