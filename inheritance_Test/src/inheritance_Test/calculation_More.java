package inheritance_Test;

public class calculation_More extends Calculation {
	
	public void multiply (int x, int y){
		
		cal = x * y;
		System.out.println("the product of the given number is :"+cal);
	}

	
	public void division (int x, int y){
		
		cal = x / y;
		System.out.println("the Quotient of the given number is :"+cal);
	}

}
