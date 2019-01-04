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
		this.cpu = new CPU(this.cpuArr[(int) (Math.random() * 2)], Math.random() * 4.0, (int) Math.random() * 12000 + 8000);
		this.ram = new RAM(this.ramArr[(int) Math.random() * 3], (int) Math.random() * 3500 + 1500);
		this.monitor = new Monitor(this.inchArr[(int) (Math.random() * 2)], (int) Math.random() * 1500 + 900);
		this.headphone = new Headphone(true, false, (int) Math.random() * 400 + 40);
		this.keyboard = new Keyboard((int) Math.random() * 108 + 84, false, (int) Math.random() * 450 + 80);
		this.mouse = new Mouse(true, (int) Math.random() * 78 + 27);
	}
	
	@Override
	public Computer createComputer() {
		return new RegularPC(cpu, ram, monitor, headphone, keyboard, mouse);
	}

}
