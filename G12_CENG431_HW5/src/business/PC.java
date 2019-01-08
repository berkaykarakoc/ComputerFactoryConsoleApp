package business;

public class PC implements Computer {

	private Keyboard keyboard;
	private Mouse mouse;
	private Headphone headphone;
	private Monitor monitor;
	private CPU cpu;
	private RAM ram;
	
	private int totalPrice;
	
	private CableType type;
	
	public PC(Keyboard keyboard,
					Mouse mouse,
					Headphone headphone,
					Monitor monitor,
					CPU cpu,
					RAM ram) {
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.headphone = headphone;
		this.monitor = monitor;
		this.cpu = cpu;
		this.ram = ram;
		this.type = CableType.COPPER;
		this.totalPrice = keyboard.getPrice()+
						  mouse.getPrice()+
						  headphone.getPrice()+
						  monitor.getPrice()+
						  cpu.getPrice()+
						  ram.getPrice();
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public Headphone getHeadphone() {
		return headphone;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public CPU getCpu() {
		return cpu;
	}

	public RAM getRam() {
		return ram;
	}
	
	public CableType getCableType() {
		return type;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public String toString() {
		return "\nKeyboard:" + "\n-Number of keys: " + keyboard.getNumberOfKeys() + "\n-Backlight: " + keyboard.hasBacklight() + "\n-Price: " + keyboard.getPrice() +
			   "\nMouse:" + "\n-Wireless: " + mouse.isWireless() + "\n-Price: " + mouse.getPrice() +
			   "\nHeadphone:" + "\n-Wireless: " + headphone.isWireless() + "\n-Microphone: " + headphone.hasMicrophone() + "\n-Price: " + headphone.getPrice() +
			   "\nMonitor:" + "\n-Inch: " + monitor.getInch() + "\n-Price: " + monitor.getPrice() +
			   "\nCPU: " + "\n-Version: " + cpu.getVersion() + "\n-Frequency: " + cpu.getFrequency() + "\n-Price: " + cpu.getPrice() +
			   "\nRAM: " + "\n-Capacity: " + ram.getCapacity() + "\n-Price: " + ram.getPrice() +
			   "\nCable Type: " + getCableType() +
			   "\nTotal Price: " + getTotalPrice();
	}
	
	@Override
	public void add2Price(int price) {
		this.totalPrice += price;
	}

	@Override
	public void plugCable() {
		
	}
	
	@Override
	public void setCableType(CableType type) {
		this.type = type;
	}

}
