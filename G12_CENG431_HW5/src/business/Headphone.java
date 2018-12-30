package business;

public class Headphone extends OutputDevice {

	private boolean isWireless;
	private boolean hasMicrophone;
	
	public Headphone(boolean isWireless, boolean hasMicrophone) {
		super();
		this.isWireless = isWireless;
		this.hasMicrophone = hasMicrophone;
	}
	
	public boolean isWireless() {
		return isWireless;
	}
	
	public boolean hasMicrophone() {
		return hasMicrophone;
	}
	
}
