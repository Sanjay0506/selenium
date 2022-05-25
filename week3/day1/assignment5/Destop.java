package week3.day1.assignment5;

public class Desktop extends Computer{
	
	public void DesktopSize () {
		System.out.println("Screen size is 12 inches");
	}
	
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.DesktopSize();
		desktop.computerModel();
	}
}
