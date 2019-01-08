package business;

public class GamingHeadphone implements Headphone {

	@Override
	public boolean isWireless() {
		return false;
	}

	@Override
	public boolean hasMicrophone() {
		return true;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*1300+600);
	}

}
