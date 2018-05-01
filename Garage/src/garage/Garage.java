package garage;

import java.util.ArrayList;

public class Garage {
	
	 private ArrayList<Vehicle> vehicleList;
	 private int CurrID;

	    public Garage(int id){
	        this.CurrID = id;
	        vehicleList = new ArrayList<>();
	    }

	    public void addToGarage(Vehicle v){
	        v.setID(CurrID);
	        CurrID++;
	        vehicleList.add(v);
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
	            System.out.println();
	        }
	    }

}
