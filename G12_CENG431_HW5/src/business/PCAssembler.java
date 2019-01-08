package business;

public class PCAssembler {

	private Keyboard keyboard;
	private Mouse mouse;
	private Headphone headphone;
	private Monitor monitor;
	private CPU cpu;
	private RAM ram;
	
	private ComputerFactory factory;
	
	public PCAssembler(ComputerFactory factory) {
		this.factory = factory;
	}
	
	public PC assembleComputer() {
		keyboard = factory.createKeyboard();
		mouse = factory.createMouse();
		headphone = factory.createHeadphone();
		monitor = factory.createMonitor();
		cpu = factory.createCPU();
		ram = factory.createRAM();
		return new PC(keyboard,mouse,headphone,monitor,cpu,ram);
	}
	
}
