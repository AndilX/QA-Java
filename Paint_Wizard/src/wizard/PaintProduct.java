package wizard;

public abstract class PaintProduct {
	
	private String brand;
    private int capacity;
    private int price;
    public int coverage;
    
    protected PaintProduct(String brand, int capacity, int price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }
    
    public abstract double calculateCoverage();
    public abstract double calculatePriceperLitre();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
