package garage;

public class Car extends Vehicle {
	
	private int numberOfDoor;

    protected Car(String brand, String modelName, int modelYear) {

        super(brand, modelName, modelYear);
        this.numberOfDoor = 4;
    }

    @Override
    public void setNumberOfWheels() {
        this.numberOfWheels = 4;
    }

    @Override
    public double calculateBill() {
        int total = 100;
        total += (20*numberOfDoor);
        return total;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

}
