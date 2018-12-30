package business;

public class Computer {
	
	private CPU cpu;
	private RAM ram;
	private Monitor monitor;
	private Headphone headphone;
	private Keyboard keyboard;
	private Mouse mouse;
	
	public Computer(CPU cpu, RAM ram, Monitor monitor, Headphone headphone, Keyboard keyboard, Mouse mouse) {
		this.cpu = cpu;
		this.ram = ram;
		this.monitor = monitor;
		this.headphone = headphone;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	public CPU getCpu() {
		return cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Headphone getHeadphone() {
		return headphone;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}
	
	
	
}
