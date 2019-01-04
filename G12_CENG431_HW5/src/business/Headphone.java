package business;

public class Headphone extends OutputDevice {

	private boolean isWireless;
	private boolean hasMicrophone;
	
	private int price;
	
	public Headphone(boolean isWireless, boolean hasMicrophone, int price) {
		super();
		this.isWireless = isWireless;
		this.hasMicrophone = hasMicrophone;
		this.price = price;
	}
	
	public boolean isWireless() {
		return isWireless;
	}
	
	public boolean hasMicrophone() {
		return hasMicrophone;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Wireless = " + this.isWireless() + " Microphone = " + this.hasMicrophone() + " Price = " + this.getPrice();
	}
}
