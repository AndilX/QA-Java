package pp.calculator;

public class Calculator {

	public int operate(int a, int b, char c) {
		if (c=='a') {
			return a+b;
		}
		else if (c=='s') {
			return a-b;
		}
		else if (c=='m') {
			return a*b;
		}
		else return 0;
	}
	
}
