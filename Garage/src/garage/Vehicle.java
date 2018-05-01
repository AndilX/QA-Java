package garage;

public abstract class Vehicle {
	
	private String brand;
    private String modelName;
    private int modelYear;
    private int currPrice;
    public int numberOfWheels;
    
    private int engineSize;
    private int enginePower;
    private String fuelType;
    
    //private double repairCost;
    private int ID;

    protected Vehicle(String brand, String modelName, int modelYear) {
        this.brand = brand;
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public abstract void setNumberOfWheels();
    public abstract double calculateBill();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(int currPrice) {
        this.currPrice = currPrice;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
