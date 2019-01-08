package business;

public class GamingMonitor implements Monitor {

	private int inchArr[] = {18,21,25,27};
	
	@Override
	public int getInch() {
		return inchArr[(int)(Math.random()*4)];
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*1000+2500);
	}

}
