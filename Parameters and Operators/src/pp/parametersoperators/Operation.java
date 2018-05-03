package pp.parametersoperators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
	
	public int verifyInput() {
		Scanner userInput = new Scanner(System.in);
		int number=0;
		
		try {
			System.out.println("Enter a number ");
			number = userInput.nextInt();
		}
		catch(InputMismatchException excpt)
		{
			System.out.println(userInput.next().toString()+" is Invalid \nOnly integers are allowed.");
			this.verifyInput();
		} 

		//userInput.close();
		return this.add(number,0);
	}
	
	
	
	
	public int add(int a, int b) {

		return a + b;
		
	}
	
	

}
