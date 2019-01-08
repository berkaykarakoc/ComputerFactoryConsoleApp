package business;

public class GamingMouse implements Mouse {

	@Override
	public boolean isWireless() {
		return false;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*550+300);
	}

}
