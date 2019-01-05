package business;

public class RegularComputerFactory implements ComputerAbstractFactory {
	private Device cpu;
	private Device ram;
	private Device monitor;
	private Device headphone;
	private Device keyboard;
	private Device mouse;
	
	private int inchArray[] = {18,21};
	private String versionArray[] = {"i3", "i5"};
	private int capacityArray[] = {32, 64 ,128};
	
	
	public Computer createComputer() {
		cpu = createCPU(); //getRandomPriceWithRange(8000,12000), versionArray[(int)(Math.random()*2)],  (float) (Math.random()*4.0+2.0));
		ram = createRAM();// getRandomPriceWithRange(1500,3500), capacityArray[(int)(Math.random()*3)]);
		monitor = createMonitor();// getRandomPriceWithRange(900,1500), inchArray[(int)(Math.random()*2)]);
		headphone = createHeadphone();// getRandomPriceWithRange(40,400), true, false);
		keyboard = createKeyboard();// getRandomPriceWithRange(80,450), getRandomPriceWithRange(84,108), true);
		mouse = createMouse();// getRandomPriceWithRange(27,78), false);

		
		return new RegularComputer(cpu, ram, monitor, headphone, keyboard, mouse);
		}

	@Override
	public Device createCPU() {
		return new CPU(getRandomPriceWithRange(8000,12000), versionArray[(int)(Math.random()*2)],  (float) (Math.random()*4.0+2.0));
	}

	@Override
	public Device createRAM() {
		return new RAM(getRandomPriceWithRange(1500,3500), capacityArray[(int)(Math.random()*3)]);
	}

	@Override
	public Device createMonitor() {
		return new Monitor( getRandomPriceWithRange(900,1500), inchArray[(int)(Math.random()*2)]);
	}

	@Override
	public Device createHeadphone() {
		return new Headphone(getRandomPriceWithRange(40,400), true, false);
	}

	@Override
	public Device createKeyboard() {
		return new Keyboard(getRandomPriceWithRange(80,450), getRandomPriceWithRange(84,108), true);
	}

	@Override
	public Device createMouse() {
		return new Mouse(getRandomPriceWithRange(27,78), false);
	}
	
	public int  getRandomPriceWithRange(int min, int max)
	{
	   int range = (max - min);     
	   return (int)(Math.random() * range) + min;
	}

}
