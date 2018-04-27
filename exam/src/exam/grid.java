package exam;

public class grid{
	
	int [][] gridMap = new int [10][10]; //map size TODO: ask user to enter size and randomise treasure location
	
	compass object = new compass();
	
	public void create() {
		
		// columns
		for (int i = 0; i<gridMap.length; i++) {
			// rows
			for (int j = 0; j<gridMap[i].length; j++) {
				
				
				if(i==1 & j ==7) {
					gridMap[i][j]=7; // 7 as position in the array to place the treasure
					
					object.setTreasureLoc(i,j);
					
				}if(i==4 & j==0) {
					gridMap[i][j]=1; // Tag as '1' as starting position of the player to be randomised
					object.setPlayerLoc(i,j);
					
				}else if (i!=0 & i!=4 & j!=0 & j!=7) {
					gridMap[i][j]=0;	
				}
				
				//System.out.print(gridMap[i][j]); //prints map for debug
				
			}
			
			//System.out.println();
		}
		
	}
	
	public void showMap() {
		
		// columns
				for (int i = 0; i<gridMap.length; i++) {
					// rows
					for (int j = 0; j<gridMap[i].length; j++) {
						
						
						if(i==1 & j ==7) {
							gridMap[i][j]=7; // 7 as position in the array to place the treasure
							
						}else {
							gridMap[i][j]=0;
							
						}						
						System.out.print(gridMap[i][j]); //prints map for debug
						
					}
					
					System.out.println();
				}
				
	}
	
	//TODO add update method you show movement of the player on the grid
	
	

}
