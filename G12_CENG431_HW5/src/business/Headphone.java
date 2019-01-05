package business;

public class Headphone extends OutputDevice {

	private boolean isWireless;
	private boolean hasMicrophone;
	
	private int price;
	
	public Headphone(boolean isWireless, boolean hasMicrophone, int price) {
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
	
	@Override
	public String toString() {
		return "\n--Is wireless = " + this.isWireless() + "\n--Has microphone = " + this.hasMicrophone()
				+ "\n--Price = " + this.getPrice();
	}
	
}
