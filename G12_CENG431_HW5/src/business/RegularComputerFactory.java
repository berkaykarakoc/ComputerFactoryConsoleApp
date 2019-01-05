package business;

public class RegularComputerFactory implements ComputerAbstractFactory {

	private int inchArray[] = {18,21};
	private String versionArray[] = {"i3", "i5"};
	private int capacityArray[] = {32,64,128};
	
	private Device keyboard;
	private Device mouse;
	private Device monitor;
	private Device headphone;
	private Device CPU;
	private Device RAM;
	
	private int totalPrice;
	
	public RegularComputerFactory() 
	{
		this.keyboard = new Keyboard((int) (Math.random()*108+84),
									true,
									(int) (Math.random()*450+80));
		this.mouse = new Mouse(false,
								(int) (Math.random()*78+27));
		this.monitor = new Monitor(inchArray[(int)(Math.random()*2)],
									(int)(Math.random()*1500+900));
		this.headphone = new Headphone(false, true, 
										(int)(Math.random()*400+40));
		this.CPU = new CPU(versionArray[(int)(Math.random()*2)],
							(float) (Math.random()*6.0+3.0),
							(int) (Math.random()*12000+8000));
		this.RAM = new RAM(capacityArray[(int)(Math.random()*3)],
							(int) (Math.random()*3500+1500));
		this.totalPrice = this.keyboard.getPrice() + this.mouse.getPrice()
		+ this.monitor.getPrice() + this.headphone.getPrice()
		+ this.CPU.getPrice() + this.RAM.getPrice();
	}
	
	public Computer createComputer() {
		return new GamingComputer(keyboard, mouse, monitor, headphone, CPU, RAM);		
	};

}
