package business;

public class RegularMonitor implements Monitor {

	private int inchArr[] = {18,21};
	
	@Override
	public int getInch() {
		return inchArr[(int)(Math.random()*2)];
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*600+900);
	}

}
