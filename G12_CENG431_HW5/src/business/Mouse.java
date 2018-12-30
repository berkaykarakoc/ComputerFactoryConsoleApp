package business;

public class Mouse extends InputDevice {
	
	private boolean isWireless;
	
	public Mouse(boolean isWireless) {
		super();
		this.isWireless = isWireless;
	}

	public boolean isWireless() {
		return isWireless;
	}

}
