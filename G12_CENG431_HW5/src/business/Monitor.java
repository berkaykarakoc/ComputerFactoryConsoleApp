package business;

public class Monitor extends OutputDevice {

	private int price;
	private int inch;
	
	public Monitor(int price, int inch) {
		super();
		this.price = price;
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	public int getPrice() {
		return price;
	}
	
}
