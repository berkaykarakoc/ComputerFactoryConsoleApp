package business;

public class RAM extends HardwareDevice {
	
	private int price;
	private int capacity;
	
	public RAM(int price, int capacity) {
		super();
		this.price = price;
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getPrice() {
		return price;
	}
}
