package garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
	
	 private ArrayList<Vehicle> vehicleList;
	 private int CurrID;
	 
	 Scanner vehicleInfo = new Scanner(System.in);

	    public Garage(int id){
	        this.CurrID = id;
	        vehicleList = new ArrayList<>();
	    }
	    
		public void garageCommands(String command) {
			
			switch (command){
			
				case "add"   :  //Scanner addInfo = new Scanner(System.in);
								System.out.println("What do you want to add to the garage? ('car'/'bike'/'truck') ");
								String addWhat = vehicleInfo.nextLine();
								Vehicle v = new Car(addWhat, addWhat, this.CurrID);  //
								this.addVehicle(v, addWhat);
								
								break;
				case "print" : 	this.printGarage(); 
								break;
				case "clear" : 	System.out.println("clearing garage");
		        				this.clearGarage(); 
		        				break;
				case "bill"  :  System.out.println("Enter id: ");
								//Scanner userIdB = new Scanner(System.in);
								int idNumB = vehicleInfo.nextInt();
								System.out.println("calculating bill of Vehicle "+ idNumB);
							    double price = this.calculateBill(idNumB);
							    System.out.println( "total cost £" + price);
							    System.out.println();
		        				break;
		        				
				case "remove":	System.out.println("Enter id: ");
								//Scanner userIdR = new Scanner(System.in);
								int idNumR = vehicleInfo.nextInt();
								System.out.println("removing id: " + idNumR);
		        				this.removeFromGaragebyID(idNumR);
		        				this.printGarage();
		        				break;
				default      :  System.out.println("Invalid command. Ending Garage");
								vehicleInfo.close();
								break;
		
		}
			
		}

	    public void addVehicle(Vehicle v, String what) {
	    	
	    	switch (what) {
	    	
		    	case "car"   :	
								System.out.println("Enter brand name: ");
								String carBrand = vehicleInfo.nextLine();
								System.out.println("Enter model name: ");
								String carModel = vehicleInfo.nextLine();
								System.out.println("Enter year: ");
								int modelYear = vehicleInfo.nextInt();
								System.out.println("Enter fuel type: ");
								String carFuel = vehicleInfo.nextLine();
								
		    					Car car = new Car(carBrand, carModel , modelYear);
		    					//car.setFuelType(carFuel);
		    					this.addToGarage(car);
		    					//this.printGarage();
		    				  	break;
		    	case "bike"  :	
		    					break;
		    	
		    	case "truck" :	
		    					break;
	    	
	    	
	    	}
	    	
	    	
	    	//this.addToGarage(v);
	    	
	    }
	    
	    
	    
	    public void addToGarage(Vehicle v){
	        v.setID(CurrID);
	        CurrID++;
	        vehicleList.add(v);
	        
	        //this.garageCommands();
	    }

	    public void removeFromGaragebyID(int id){
	        for (int i = 0; i< vehicleList.size(); i++){
	            if (vehicleList.get(i).getID()==id){
	                vehicleList.remove(i);
	            }
	        }
	    }

	    public void removeFromGaragebyType(Vehicle v){
	        for (int i = 0; i< vehicleList.size(); i++){
	            if (v instanceof Car && vehicleList.get(i) instanceof Car){
	                vehicleList.remove(i);
	            }
	            if (v instanceof Bike && vehicleList.get(i) instanceof Bike){
	                vehicleList.remove(i);
	            }
	            if (v instanceof Truck && vehicleList.get(i) instanceof Truck){
	                vehicleList.remove(i);
	            }
	        }
	    }

	    public double calculateBill(int id){
	        double total = 0;
	        for (int i = 0; i< vehicleList.size(); i++){
	            if (vehicleList.get(i).getID()==id){
	                total = vehicleList.get(i).calculateBill();
	            }
	        }
	        return total;
	    }

	    public ArrayList<Vehicle> getGarage(){
	        return this.vehicleList;
	    }

	    public void clearGarage(){
	        vehicleList.clear();
	    }

	    public void printGarage(){
	        for (Vehicle v:vehicleList){
	            System.out.println("*****"+v.getID()+ "*****");
	            System.out.println("Brand: "+v.getBrand());
	            System.out.println("Model: "+v.getModelName());
	            System.out.println("Year: "+v.getModelYear());
	            System.out.println("Fuel type: "+v.getFuelType());
	            System.out.println("Current price £"+v.getCurrPrice());
	            System.out.println("Engine size: "+v.getengineSize()+"cc");
	            System.out.println("Engine power: "+v.getenginePower()+"bhp");;
	            System.out.println();
	        }
	        //this.garageCommands(command);
	        //carInfo.close();
	    }

}
