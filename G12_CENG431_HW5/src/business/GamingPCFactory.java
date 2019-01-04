package business;

public class GamingPCFactory implements ComputerAbstractFactory {

	private CPU cpu;
	private RAM ram;
	private Monitor monitor;
	private Headphone headphone;
	private Keyboard keyboard;
	private Mouse mouse;
	
	private int[] inchArr = {18,21,25,27}; 
	private String[] cpuArr = {"i5", "i7"};
	private int[] ramArr = {128, 256};
	
	public GamingPCFactory() {
		this.cpu = new CPU(this.cpuArr[(int) (Math.random() * 2.0)], (Math.random()) * 6.0, (int) (Math.random() * 24000.0 + 14000.0));
		this.ram = new RAM(this.ramArr[(int) (Math.random() * 2.0)], (int) (Math.random() * 7000.0 + 19000.0));
		this.monitor = new Monitor(this.inchArr[(int) (Math.random() * 4.0)], (int) (Math.random() * 3500.0 + 2500.0));
		this.headphone = new Headphone(false, true, (int) (Math.random() * 1900.0 + 600.0));
		this.keyboard = new Keyboard((int) (Math.random() * 108.0 + 84.0), true, (int) (Math.random() * 1500.0 + 500.0));
		this.mouse = new Mouse(false, (int) (Math.random() * 850.0 + 300.0));
	}
	
	@Override
	public Computer createComputer() {
		return new GamingPC(cpu, ram, monitor, headphone, keyboard, mouse);
	}

}
