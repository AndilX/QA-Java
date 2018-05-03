package garage;

public class Van extends Vehicle{
	private int numberOfDoor;
	private String fuelType;
	private boolean hasSideDoor;

    protected Van(String brand, String modelName, int modelYear) {

        super(brand, modelName, modelYear);
        this.numberOfDoor = 2;
        this.hasSideDoor = false;
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
    
    public boolean isHasSideDoor() {
        return hasSideDoor;
    }

    public void setHasSideDoor(boolean hasSideDoor) {
        this.hasSideDoor = hasSideDoor;
    }
    
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
