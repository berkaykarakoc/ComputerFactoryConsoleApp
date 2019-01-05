package business;

public class CPU extends HardwareDevice {

	private final String version;
	private float frequency;
	
	private int price;
	
	public CPU(String version, float frequency, int price) {
		this.version = version;
		this.frequency = frequency;
		this.price = price;
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
	
	@Override
	public String toString() {
		return "\n--Version = " + this.getVersion() + "\n--Frequency = " + this.getFrequency()
				+ "\n--Price = " + this.getPrice();
	}
	
}
