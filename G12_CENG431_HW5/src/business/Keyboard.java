package business;

public class Keyboard extends InputDevice {

	private int numberOfKeys;
	private boolean hasBacklight;
	
	private int price;
	
	public Keyboard(int numberOfKeys, boolean hasBacklight, int price) {
		this.numberOfKeys = numberOfKeys;
		this.hasBacklight = hasBacklight;
		this.price = price;
	}

	public int getNumberOfKeys() {
		return numberOfKeys;
	}

	public boolean hasBacklight() {
		return hasBacklight;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "\n--Number of keys = " + this.getNumberOfKeys() + "\n--Has backlight = " + this.hasBacklight()
				+ "\n--Price = " + this.getPrice();
	}
	
}
