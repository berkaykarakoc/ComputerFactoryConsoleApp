package business;

public class Monitor extends OutputDevice {

	private double inch;
	
	public Monitor(double inch) {
		super();
		this.inch = inch;
	}
	
	public double getInch() {
		return inch;
	}
	
}
