package business;

public class GamingRAM implements RAM {

	private int capacityArr[] = {128,256};
	
	@Override
	public int getCapacity() {
		return capacityArr[(int)(Math.random()*2)];
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*12000+7000);
	}

}
