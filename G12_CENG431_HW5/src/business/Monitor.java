package business;

public class Monitor extends OutputDevice {

	private int inch;
	
	private int price;
	
	public Monitor(int inch, int price) {
		super();
		this.inch = inch;
		this.price = price;
	}
	
	public int getInch() {
		return inch;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Inch = " + this.getInch() + " Price = " + this.getPrice();
	}
	
}
