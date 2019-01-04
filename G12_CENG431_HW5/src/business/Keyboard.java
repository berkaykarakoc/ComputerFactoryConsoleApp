package business;

public class Keyboard extends InputDevice {

	private int numberOfKeys;
	private boolean hasBacklight;
	
	private int price;
	
	public Keyboard(int numberOfKeys, boolean hasBacklight, int price) {
		super();
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
	
	public String toString() {
		return "Number of keys = " + this.getNumberOfKeys() + " Backlight = " + this.hasBacklight() + " Price = " + this.getPrice();
	}
	
}
