package garage;

public class Truck extends Vehicle {
	
    private double bedLength;
    private double bedWidth;
    protected Truck(String brand, String modelName, int modelYear) {

        super(brand, modelName, modelYear);
        this.bedWidth =0;
        this.bedLength =0;
    }

    @Override
    public void setNumberOfWheels() {
        this.numberOfWheels = 8;
    }

    @Override
    public double calculateBill() {
        double total = 200;
        total += (bedLength*bedWidth * 0.23);
        return total;
    }

    public void setBedLength(double length){
        this.bedLength = length;
    }

    public void setBedWidth(double width){
        this.bedWidth = width;
    }

}
