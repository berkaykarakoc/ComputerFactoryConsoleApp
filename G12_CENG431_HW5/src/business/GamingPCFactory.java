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
		this.cpu = new CPU(this.cpuArr[(int) (Math.random() * 2)], Math.random() * 6.0, (int) Math.random() * 24000 + 14000);
		this.ram = new RAM(this.ramArr[(int) Math.random() * 2], (int) Math.random() * 7000 + 19000);
		this.monitor = new Monitor(this.inchArr[(int) (Math.random() * 4)], (int) Math.random() * 3500 + 2500);
		this.headphone = new Headphone(false, true, (int) Math.random() * 1900 + 600);
		this.keyboard = new Keyboard((int) Math.random() * 108 + 84,true, (int) Math.random() * 1500 + 500);
		this.mouse = new Mouse(false, (int) Math.random() * 850 + 300);
	}
	
	@Override
	public Computer createComputer() {
		return new GamingPC(cpu, ram, monitor, headphone, keyboard, mouse);
	}

}
