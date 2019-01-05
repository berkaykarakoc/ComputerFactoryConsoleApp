package business;

public class RAM extends HardwareDevice {

	private int capacity;
	
	private int price;
	
	public RAM(int capacity, int price) {
		this.capacity = capacity;
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "\n--Capacity = " + this.getCapacity()
				+ "\n--Price = " + this.getPrice();
	}
	
}
