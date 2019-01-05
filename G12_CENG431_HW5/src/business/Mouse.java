package business;

public class Mouse extends InputDevice {
	
	private int price;
	private boolean isWireless;
	
	public Mouse(int price, boolean isWireless) {
		super();
		this.price = price;
		this.isWireless = isWireless;
	}

	public boolean isWireless() {
		return isWireless;
	}

	
	public int getPrice() {
		return price;
	}
}
