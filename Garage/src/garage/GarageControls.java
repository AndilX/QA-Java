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
		
		Scanner userInput = new Scanner(System.in);
		String command = userInput.nextLine();
		
		
		//
		switch (command){
		
			case "add"   :  Scanner addInfo = new Scanner(System.in);
							System.out.println("What do you want to add to the garage? (car/bike/truck) ");
							String addWhat = addInfo.nextLine();
							Vehicle v = new Car(addWhat, addWhat, id);  //
							garage.addVehicle(v, addWhat);
							
							break;
			case "print" : 	garage.printGarage(); 
							break;
			case "clear" : 	System.out.println("clearing garage");
	        				garage.clearGarage(); 
	        				break;
			case "bill"  :  System.out.println("Enter id: ");
							Scanner userIdB = new Scanner(System.in);
							int idNumB = userIdB.nextInt();
							System.out.println("calculating bill of Vehicle "+ idNumB);
						    double price = garage.calculateBill(idNumB);
						    System.out.println( "total cost £" + price);
						    System.out.println();
	        				break;
	        				
			case "remove":	System.out.println("Enter id: ");
							Scanner userIdR = new Scanner(System.in);
							int idNumR = userInput.nextInt();
							System.out.println("removing id: " + idNumR);
	        				garage.removeFromGaragebyID(idNumR);
	        				break;
			default      :  System.out.println("Invalid command. Ending Garage");
							userInput.close();
							break;
		
		}

        

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
