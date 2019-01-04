package business;

public class RegularPCFactory implements ComputerAbstractFactory {

	private CPU cpu;
	private RAM ram;
	private Monitor monitor;
	private Headphone headphone;
	private Keyboard keyboard;
	private Mouse mouse;
	
	private int[] inchArr = {18,21}; 
	private String[] cpuArr = {"i3", "i5"};
	private int[] ramArr = {32, 64, 128};
	
	public RegularPCFactory() {
		this.cpu = new CPU(this.cpuArr[(int) (Math.random() * 2.0)], (Math.random() * 4.0), (int) (Math.random() * 12000.0 + 8000.0));
		this.ram = new RAM(this.ramArr[(int) (Math.random() * 3.0)], (int) (Math.random() * 3500.0 + 1500.0));
		this.monitor = new Monitor(this.inchArr[(int) (Math.random() * 2.0)], (int) (Math.random() * 1500.0 + 900.0));
		this.headphone = new Headphone(true, false, (int) (Math.random() * 400.0 + 40.0));
		this.keyboard = new Keyboard((int) (Math.random() * 108.0 + 84.0), false, (int) (Math.random() * 450.0 + 80.0));
		this.mouse = new Mouse(true, (int) (Math.random() * 78.0 + 27.0));
	}
	
	@Override
	public Computer createComputer() {
		return new RegularPC(cpu, ram, monitor, headphone, keyboard, mouse);
	}

}
