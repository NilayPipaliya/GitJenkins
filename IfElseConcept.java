package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater");
		}else {
			System.out.println("a is greater");
		}
		
		int i= 600;
		int j = 2800;
		int k = 300;
		
		if(i>j & i>k) {
			System.out.println("i is greatest");
		} else if(j>k) {
			System.out.println("j is greatest");
		}else {
			System.out.println("k is gretest");
		}
		
		
	}

}
