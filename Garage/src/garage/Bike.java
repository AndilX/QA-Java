package garage;

public class Bike extends Vehicle {
    private boolean hasSidecar;
    protected Bike(String brand, String modelName, int modelYear) {
        super(brand, modelName, modelYear);
        this.hasSidecar=false;
    }


    @Override
    public void setNumberOfWheels() {
        this.numberOfWheels=2;
    }

    @Override
    public double calculateBill() {
        double total = 50;
        if (hasSidecar){
            total += 50;
        }
        return total;
    }


    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

}
