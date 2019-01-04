package business;

public class RAM extends HardwareDevice {
	
	private int capacity;
	
	private int price;
	
	public RAM(int capacity, int price) {
		super();
		this.capacity = capacity;
		this.price = price;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Capacity = " + this.getCapacity() + " Price = " + this.getPrice();
	}
	
}
