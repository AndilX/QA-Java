package exam;

import java.util.Scanner;

public class mainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating player object at the start
		player ref = new player();
		//grid map = new grid(); 
		
		System.out.println("-------The Adventures of Barren Moore-------");
		System.out.println("___Enter 'Start' to begin or '?' for help___");
		
		Scanner playerInput = new Scanner(System.in);
		String textEntered = playerInput.nextLine();
		
		//map.create();
		ref.begin(textEntered);
		
		

	}
	
}
