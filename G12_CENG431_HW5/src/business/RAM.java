package business;

public class RAM extends HardwareDevice {
	
	private double capacity;
	
	public RAM(double capacity) {
		super();
		this.capacity = capacity;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
}
