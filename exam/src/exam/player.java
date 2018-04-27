package exam;

import java.util.Scanner;


public class player{
	
	compass objectCompass = new compass();  // might not be needed
	
	Scanner playerInput = new Scanner(System.in);
	grid mapGrid = new grid(); 
	
	public void begin(String text){
		
		switch (text) {
		
			case "Start": System.out.println("Let the adventure begin!"); 
						//map will be created, compass will initialise and locate treasure  
						mapGrid.create();
						
						System.out.println("Grey foggy clouds float oppressively close to you...");
						System.out.println("Where do you want to go...");
						System.out.println("_____^_____");
						System.out.println("_____N_____");
						System.out.println("<W___+___E>");
						System.out.println("_____S_____");
						System.out.println("_____v_____");
						
						String textEntered1 = playerInput.nextLine();
						this.start(textEntered1,5,1); // set player location
						
						break;
						  
			case "?" :  System.out.println("------------Find the treasure--------------");
						System.out.println("1. Type the word 'north/east/south/west' to navigate the area");
						System.out.println("2. Type the word 'compass' to have an indication to where the treasure is");
						System.out.println("3. The game will automatically shows the progress in terms of distance with the compass");
						System.out.println("4. The game will end when you (the player) are within 1m distance to the treasure");
						System.out.println("");
						System.out.println("___Enter 'Start' to begin or '?' for help___");
						
						String textEntered2 = playerInput.nextLine();
						this.begin(textEntered2);
						break;
			// error handling cases
				//case "":    System.out.println("___Enter 'Start' to begin or '?' for help___");
		}
		
	}
	
	public void start(String text,int x, int y) {
		

		//TODO : allow player to go north-east/north-west/south-east/south-west
		
		switch(text) {
		
			case "compass": this.movement(x,y);
							String textEntered3 = playerInput.nextLine();
							this.start(textEntered3,x, y);
							break;
				
			case "north": 	System.out.println("You are going north by one block");
							
							this.movement((x-1), y); //shows compass value
							
							String textEntered4 = playerInput.nextLine();
							this.start(textEntered4,x-1, y);
							break;
				
			case "east": 	System.out.println("You are going east by one block");
							
							this.movement(x, (y+1));
							
							String textEntered5 = playerInput.nextLine();
							this.start(textEntered5,x,y+1);	
							break;
				
			case "west": 	System.out.println("You are going west by one block");

							this.movement(x, (y-1));
			
							String textEntered6 = playerInput.nextLine();
							this.start(textEntered6,x,y-1);	
							break;
				
			case "south":	System.out.println("You are going south by one block");
		
							this.movement((x+1), y);
			
							String textEntered7 = playerInput.nextLine();
							this.start(textEntered7,x+1, y);	
							break;
							
			// for debugging
			case "end": 	System.out.println("Game Over");
							playerInput.close();
							break;
							
			case "map": 	System.out.println("The map....");
							mapGrid.showMap();
							String textEntered8 = playerInput.nextLine();
							this.start(textEntered8,x, y);	
			
							break;
			
			case "reset": 	objectCompass.setPlayerLoc(4, 0); //fixed position of player for debug
			
							break;
			//default: 		throw new Exception("Invalid word") TODO add error handling in case user enter wrong words
							
		}
	}
	
	public void movement(int x1,int y1) {
		
		int x2, y2;
		x2 = 1; y2 = 7; // treasure fixed position TODO randomise treasure
		
		
		double h = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))); // with array2D indices calculate distance x1,y1 is the player / x2,y2 is the treasure location
		
		System.out.println("The dial reads.."+"'"+ h +"m' from the treasure");
		System.out.println("You are at: "+"x: "+x1+" y: "+y1);
		
		if (h == 1) {
			System.out.println("You see a box sitting on the plain.Its filled with treasure!You win!");
			System.out.println("Game Over");
			String textEntered8 = playerInput.nextLine();
			this.start(textEntered8, 4, 0); // reset player position and new game
			
		}if (h > 10) {
			System.out.println("You heading too far from the treasure and the foggy clouds approaches you");
			String textEntered8 = playerInput.nextLine();
			this.start(textEntered8, x1, y1);
			
		}else {
			
		String textEntered5 = playerInput.nextLine();
		this.start(textEntered5, x1, y1); //passing back new player position	
			
		}
		
	}
	


}
