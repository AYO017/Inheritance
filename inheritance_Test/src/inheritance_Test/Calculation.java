package inheritance_Test;

public class Calculation {
	int cal;
	
	public void add(int x, int y ){
		
		cal = x + y;
		System.out.println("the sum of the given number is :"+cal);
	}

	public void Sub(int x, int y ){
		
		cal = x - y;
		System.out.println("the difference of the given number is :"+cal);
	}
}
