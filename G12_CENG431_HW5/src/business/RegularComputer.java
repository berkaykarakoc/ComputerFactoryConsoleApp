package business;

public class RegularComputer extends Computer {

	private Device keyboard;
	private Device mouse;
	private Device monitor;
	private Device headphone;
	private Device CPU;
	private Device RAM;
	
	private int totalPrice;

	public RegularComputer(Device keyboard, Device mouse,
			Device monitor, Device headphone,
			Device CPU, Device RAM) 
	{
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.monitor = monitor;
		this.headphone = headphone;
		this.CPU = CPU;
		this.RAM = RAM;
		this.totalPrice = this.keyboard.getPrice() + this.mouse.getPrice()
						+ this.monitor.getPrice() + this.headphone.getPrice()
						+ this.CPU.getPrice() + this.RAM.getPrice();
	}

	public Device getKeyboard() {
		return keyboard;
	}

	public Device getMouse() {
		return mouse;
	}

	public Device getMonitor() {
		return monitor;
	}

	public Device getHeadphone() {
		return headphone;
	}

	public Device getCPU() {
		return CPU;
	}

	public Device getRAM() {
		return RAM;
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	
	
}
