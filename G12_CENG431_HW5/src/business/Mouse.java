package business;

public class Mouse extends InputDevice {
	
	private boolean isWireless;
	
	private int price;
	
	public Mouse(boolean isWireless, int price) {
		super();
		this.isWireless = isWireless;
		this.price = price;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Wireless = " + this.isWireless() + " Price = " + this.getPrice();
	}

}
