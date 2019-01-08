package business;

public class RegularHeadphone implements Headphone {

	@Override
	public boolean isWireless() {
		return true;
	}

	@Override
	public boolean hasMicrophone() {
		return false;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*360+40);
	}

}
