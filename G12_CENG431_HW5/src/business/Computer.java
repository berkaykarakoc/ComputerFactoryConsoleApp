package business;

public abstract class Computer {

	public abstract Device getKeyboard();
	public abstract Device getMouse();
	public abstract Device getMonitor();
	public abstract Device getHeadphone();
	public abstract Device getCPU();
	public abstract Device getRAM();
	
	public abstract int getTotalPrice();
	
	
	@Override
	public String toString() {
		return "\nInput Device:" + "\n-Keyboard:" + this.getKeyboard() + "\n-Mouse:" + this.getMouse()
		+ "\nOutput Device:" + "\n-Monitor:" + this.getMonitor() + "\n-Headphone:" + this.getHeadphone()
		+ "\nHardware Device:" + "\n-CPU:" + this.getCPU() + "\n-RAM:" + this.getRAM() + "\n-Total Price: " + this.getTotalPrice() + " TL";
	}
	
}
