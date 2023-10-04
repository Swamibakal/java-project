package Dayone;

public class IfElse {

	public static void main (String[] args) {
		
		int a =25;
		int b =65;
		int c =55;
		if(a>b || a>c) {
			System.out.println("a is large");
		}
		else if (b>a || b>c) {
			System.out.println("b is large");
		}
		else {
			System.out.println("c is large");
		}
	}
}
