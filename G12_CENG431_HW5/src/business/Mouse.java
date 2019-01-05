package business;

public class Mouse extends InputDevice {

	private boolean isWireless;
	
	private int price;
	
	public Mouse(boolean isWireless, int price) {
		this.isWireless = isWireless;
		this.price = price;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "\n--Is wireless = " + this.isWireless()
				+ "\n--Price = " + this.getPrice();
	}
	
}
