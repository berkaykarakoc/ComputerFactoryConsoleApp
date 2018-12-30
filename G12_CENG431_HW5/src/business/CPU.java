package business;

public class CPU extends HardwareDevice {

	private String version;
	private double frequency;
	
	public CPU(String version, double frequency) {
		super();
		this.version = version;
		this.frequency = frequency;
	}
	
	public String getVersion() {
		return version;
	}
	
	public double getFrequency() {
		return frequency;
	}
	
}
