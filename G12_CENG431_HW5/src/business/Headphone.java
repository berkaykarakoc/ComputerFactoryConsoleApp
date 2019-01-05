package business;

public class Headphone extends OutputDevice {

	private int price;
	private boolean isWireless;
	private boolean hasMicrophone;
	
	public Headphone(int price, boolean isWireless, boolean hasMicrophone) {
		super();
		this.price = price;
		this.isWireless = isWireless;
		this.hasMicrophone = hasMicrophone;
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
	
}
