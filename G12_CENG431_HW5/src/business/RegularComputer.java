package business;

public class RegularComputer extends Computer{
	
	private Device cpu;
	private Device ram;
	private Device monitor;
	private Device headphone;
	private Device keyboard;
	private Device mouse;
	
	private Cable cable = Cable.COPPER;
	
	private int totalPrice;
	
	public RegularComputer(Device cpu, Device ram, Device monitor, Device headphone, Device keyboard, Device mouse) {
		this.cpu = cpu;
		this.ram = ram;
		this.monitor = monitor;
		this.headphone = headphone;
		this.keyboard = keyboard;
		this.mouse = mouse;
		setTotalPrice(this.keyboard.getPrice() + this.mouse.getPrice() + this.monitor.getPrice() + 
				this.headphone.getPrice()+ this.cpu.getPrice() + this.ram.getPrice());
	}

	@Override
	public Device getCPU() {
		return cpu;
	}

	@Override
	public Device getRAM() {
		return ram;
	}

	@Override
	public Device getMonitor() {
		return monitor;
	}
	
	@Override
	public Device getHeadphone() {
		return headphone;
	}

	@Override
	public Device getKeyboard() {
		return keyboard;
	}

	@Override
	public Device getMouse() {
		return mouse;
	}

	@Override
	public Cable getCable() {
		return cable;
	}

	@Override
	public void setCable(Cable cable) {
		this.cable=cable;
	}

	@Override
	public int getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
	}
	
	
	
}