package business;

public class Monitor extends OutputDevice {

	private int inch;
	
	private int price;
	
	public Monitor(int inch, int price) {
		this.inch = inch;
		this.price = price;
	}

	public int getInch() {
		return inch;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "\n--Inch = " + this.getInch()
				+ "\n--Price = " + this.getPrice();
	}
	
}
