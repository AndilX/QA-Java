package wizard;

public class CheapoMax extends PaintProduct {
	

    protected CheapoMax(String brand, int capacity, int price) {

        super(brand,capacity, price);

    }

    @Override
    public double calculateCoverage(){
    	int area = 20;
    	int capacity = this.getCapacity();
    	
    	double result = area/capacity;
    	return result;
    }
    
    @Override
    public double calculatePriceperLitre(){
    	int price = this.getPrice();
    	int capacity = this.getCapacity();
    	
    	double result = price/capacity;
    	return result;
    }

}
