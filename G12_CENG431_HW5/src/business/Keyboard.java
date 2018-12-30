package business;

public class Keyboard extends InputDevice {

	private int numberOfKeys;
	private boolean hasBacklight;
	
	public Keyboard(int numberOfKeys, boolean hasBacklight) {
		super();
		this.numberOfKeys = numberOfKeys;
		this.hasBacklight = hasBacklight;
	}

	public int getNumberOfKeys() {
		return numberOfKeys;
	}

	public boolean hasBacklight() {
		return hasBacklight;
	}
	
	
	
}
