package business;

public interface ComputerAbstractFactory {
	public Computer createComputer();
	
	public Device createCPU();
	public Device createRAM();
	public Device createMonitor();
	public Device createHeadphone();
	public Device createKeyboard();
	public Device createMouse();
	
	/*
	public CPU createCPU(int price, String version, float frequency);
	public RAM createRAM(int price, int capacity);
	public Monitor createMonitor(int price, int inch);
	public Headphone createHeadphone(int price, boolean isWireless, boolean hasMicrophone);
	public Keyboard createKeyboard(int price, int numberOfKeys, boolean hasBacklight);
	public Mouse createMouse(int price, boolean isWireless);
	 */
}
