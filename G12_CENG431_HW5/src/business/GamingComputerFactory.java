package business;

public class GamingComputerFactory implements ComputerAbstractFactory {
	
	private int inchArray[] = {18,21,25,27};
	private String versionArray[] = {"i5", "i7"};
	private int capacityArray[] = {128,256};
	
	private Device keyboard;
	private Device mouse;
	private Device monitor;
	private Device headphone;
	private Device CPU;
	private Device RAM;
	
	private int totalPrice;
	
	public GamingComputerFactory() 
	{
		this.keyboard = new Keyboard((int) (Math.random()*108+84),
									true,
									(int) (Math.random()*1500+500));
		this.mouse = new Mouse(false,
								(int) (Math.random()*850+300));
		this.monitor = new Monitor(inchArray[(int)(Math.random()*4)],
									(int)(Math.random()*3500+2500));
		this.headphone = new Headphone(true, true, 
										(int)(Math.random()*1900+600));
		this.CPU = new CPU(versionArray[(int)(Math.random()*2)],
							(float) (Math.random()*6.0+3.0),
							(int) (Math.random()*24000+14000));
		this.RAM = new RAM(capacityArray[(int)(Math.random()*2)],
							(int) (Math.random()*19000+7000));
		this.totalPrice = this.keyboard.getPrice() + this.mouse.getPrice()
		+ this.monitor.getPrice() + this.headphone.getPrice()
		+ this.CPU.getPrice() + this.RAM.getPrice();
	}
	
	public Computer createComputer() {
		return new GamingComputer(keyboard, mouse, monitor, headphone, CPU, RAM);		
	};
	
}
