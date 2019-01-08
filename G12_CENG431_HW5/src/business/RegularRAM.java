package business;

public class RegularRAM implements RAM {

	private int capacityArr[] = {32,64,128};
	
	@Override
	public int getCapacity() {
		return capacityArr[(int)(Math.random()*3)];
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*2000+1500);
	}

}
