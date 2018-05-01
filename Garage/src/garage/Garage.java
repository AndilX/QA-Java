package garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
	
	 private ArrayList<Vehicle> vehicleList;
	 private int CurrID;

	    public Garage(int id){
	        this.CurrID = id;
	        vehicleList = new ArrayList<>();
	    }

	    public void addVehicle(Vehicle v, String what) {
	    	
	    	switch (what) {
	    	
		    	case "car"   :	Scanner carInfo = new Scanner(System.in);
								System.out.println("Enter brand name: ");
								String carBrand = carInfo.nextLine();
								System.out.println("Enter model name: ");
								String carModel = carInfo.nextLine();
								System.out.println("Enter year: ");
								int modelYear = carInfo.nextInt();
								System.out.println("Enter fuel type: ");
								String carFuel = carInfo.nextLine();
								
		    					Car car = new Car(carBrand, carModel , modelYear);
		    					//car.setFuelType(carFuel);
		    					this.addToGarage(car);
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
	        
	        // this.garageCommands()
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
	    }

}
