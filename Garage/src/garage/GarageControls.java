package garage;

public class GarageControls {
	
	public static void main (String [] args) {
        int id =1;
        Garage garage = new Garage(id);
        Car car1 = new Car("Smart", "roadster coupe brabus", 2006);
        car1.setNumberOfDoor(2);
        Car car2 = new Car("Smart", "forfour brabus", 2005);
        car1.setNumberOfDoor(4);
        Bike bike1 = new Bike("Yamaha", "fz250", 2012);
        Bike bike2 = new Bike ("Vincent", "Black shadow", 1948);
        bike2.setHasSidecar(true);
        Truck truck2 = new Truck("MAN", "2&half", 2008);
        truck2.setBedLength(2.5);

        garage.addToGarage(car1);
        garage.addToGarage(car2);
        garage.addToGarage(bike1);
        garage.addToGarage(bike2);
        garage.addToGarage(truck2);

        garage.printGarage();

        System.out.println("calculateing bill of Vehicle 3");
        double price = garage.calculateBill(3);
        System.out.println( "total cost £" + price);
        System.out.println();

        System.out.println("removing id 3");
        garage.removeFromGaragebyID(3);
        garage.printGarage();


        System.out.println("removing type car");
        garage.removeFromGaragebyType(car1);
        garage.printGarage();

        System.out.println("clearing garage");
        garage.clearGarage();

        garage.printGarage();


    }


}
