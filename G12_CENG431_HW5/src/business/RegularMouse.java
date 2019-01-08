package business;

public class RegularMouse implements Mouse {

	@Override
	public boolean isWireless() {
		return true;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*51+27);
	}

}
