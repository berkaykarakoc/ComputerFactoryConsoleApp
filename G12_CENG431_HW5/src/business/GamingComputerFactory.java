package business;

public class GamingComputerFactory implements ComputerAbstractFactory {
	private Device cpu;
	private Device ram;
	private Device monitor;
	private Device headphone;
	private Device keyboard;
	private Device mouse;

	private int inchArray[] = {18,21,25,27};
	private String versionArray[] = {"i5", "i7"};
	private int capacityArray[] = {128,256};
	
	public GamingComputerFactory() {
		cpu = createCPU();// getRandomPriceWithRange(14000,24000), versionArray[(int)(Math.random()*2)], (float) (Math.random()*6.0+3.0));
		ram = createRAM();// getRandomPriceWithRange(7000,19000), capacityArray[(int)(Math.random()*2)]);
		monitor = createMonitor();// getRandomPriceWithRange(2500,3500), inchArray[(int)(Math.random()*2)]);
		headphone = createHeadphone();// getRandomPriceWithRange(600,1900), false, true);
		keyboard = createKeyboard();// getRandomPriceWithRange(500,1500), getRandomPriceWithRange(84,108), true);
		mouse = createMouse();// getRandomPriceWithRange(300,850), false);
	}
	public Computer createComputer() {
		return new GamingComputer(cpu, ram, monitor, headphone, keyboard, mouse);
		}

	@Override
	public Device createCPU() {		
		return new CPU( getRandomPriceWithRange(14000,24000), versionArray[(int)(Math.random()*2)], 
				(float) (Math.random()*6.0+3.0));
	}
	@Override
	public Device createRAM() {
		return new RAM( getRandomPriceWithRange(7000,19000), capacityArray[(int)(Math.random()*2)]);
	}
	@Override
	public Device createMonitor() {
		return new Monitor( getRandomPriceWithRange(2500,3500), inchArray[(int)(Math.random()*2)]);
	}
	@Override
	public Device createHeadphone() {
		return new Headphone(getRandomPriceWithRange(600,1900), false, true);
	}
	@Override
	public Device createKeyboard() {
		return new Keyboard(getRandomPriceWithRange(500,1500), getRandomPriceWithRange(84,108), true);
	}
	@Override
	public Device createMouse() {
		return new Mouse( getRandomPriceWithRange(300,850), false);
	}
	
	public int  getRandomPriceWithRange(int min, int max)
	{
	   int range = (max - min);     
	   return (int)(Math.random() * range) + min;
	}
	
}
