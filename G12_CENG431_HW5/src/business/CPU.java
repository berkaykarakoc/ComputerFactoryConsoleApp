package business;

public class CPU extends HardwareDevice {

	private String version;
	private double frequency;
	
	private int price;
	
	public CPU(String version, double frequency, int price) {
		super();
		this.version = version;
		this.frequency = frequency;
		this.price = price;
	}
	
	public String getVersion() {
		return version;
	}
	
	public double getFrequency() {
		return frequency;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Version = " + this.getVersion() + " Frequency = " + this.getFrequency() + " Price = " + this.getPrice();
	}
	
}
