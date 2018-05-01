package garage;

import java.util.Scanner;

public class GarageControls {
	
	public static void main (String [] args) {
        int id =1;
        Garage garage = new Garage(id);
        Car car1 = new Car("Smart", "Roadster Coupe Brabus", 2006);
        car1.setNumberOfDoor(2);
        car1.setFuelType("petrol");
        car1.setCurrPrice(4231);
        car1.setenginePower(101);
        car1.setengineSize(698);
        Car car2 = new Car("Smart", "forfour brabus", 2005);
        car2.setNumberOfDoor(4);
        car2.setFuelType("petrol");
        car2.setCurrPrice(3995);
        car2.setenginePower(177);
        car2.setengineSize(1468);
        Bike bike1 = new Bike("Yamaha", "fz250", 2012);
        bike1.setFuelType("petrol");
        Bike bike2 = new Bike ("Vincent", "Black shadow", 1948);
        bike2.setFuelType("petrol");
        bike2.setHasSidecar(true);
        Truck truck2 = new Truck("MAN", "2&half", 2008);
        truck2.setBedLength(2.5);

        garage.addToGarage(car1);
        garage.addToGarage(car2);
        garage.addToGarage(bike1);
        garage.addToGarage(bike2);
        garage.addToGarage(truck2);
        
        System.out.println("--------Garage-------");
		System.out.println("___Enter a command___");
		System.out.println("_.'add' a vehicle______");
		System.out.println("_.'remove' a vehicle___");
		System.out.println("_.'bill' repair cost___");
		System.out.println("_.'print' garage_______");
		System.out.println("_.'clear' garage_______");
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		String command = userInput.nextLine();
		garage.garageCommands(command);
        

        //System.out.println("calculating bill of Vehicle 3");
        //double price = garage.calculateBill(3);
        //System.out.println( "total cost £" + price);
        //System.out.println();

        //System.out.println("removing id 3");
        //garage.removeFromGaragebyID(3);
        //garage.printGarage();


        //System.out.println("removing type car");
        //garage.removeFromGaragebyType(car1);
        //garage.printGarage();

    
    }


}
