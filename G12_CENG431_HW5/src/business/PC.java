package business;

public abstract class PC extends Computer {

	private CPU cpu;
	private RAM ram;
	private Monitor monitor;
	private Headphone headphone;
	private Keyboard keyboard;
	private Mouse mouse;
	
	public PC(CPU cpu, RAM ram, Monitor monitor, Headphone headphone, Keyboard keyboard, Mouse mouse) {
		this.cpu = cpu;
		this.ram = ram;
		this.monitor = monitor;
		this.headphone = headphone;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	@Override
	public CPU getCpu() {
		return this.cpu;
	}

	@Override
	public RAM getRam() {
		return this.ram;
	}

	@Override
	public Monitor getMonitor() {
		return this.monitor;
	}

	@Override
	public Headphone getHeadphone() {
		return this.headphone;
	}

	@Override
	public Keyboard getKeyboard() {
		return this.keyboard;
	}

	@Override
	public Mouse getMouse() {
		return this.mouse;
	}

}
