package business;

public class CPU extends HardwareDevice {

	private int price;
	private final String version;
	private float frequency;
	
	public CPU(int price, String version, float frequency) {
		super();
		this.price = price;
		this.version = version;
		this.frequency = frequency;
	}
	
	public String getVersion() {
		return version;
	}
	
	public float getFrequency() {
		return frequency;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
