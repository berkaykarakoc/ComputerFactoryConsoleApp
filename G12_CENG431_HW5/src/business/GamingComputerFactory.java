package business;

public class GamingComputerFactory implements ComputerFactory {

	@Override
	public Keyboard createKeyboard() {
		return new GamingKeyboard();
	}

	@Override
	public Mouse createMouse() {
		return new GamingMouse();
	}

	@Override
	public Headphone createHeadphone() {
		return new GamingHeadphone();
	}

	@Override
	public Monitor createMonitor() {
		return new GamingMonitor();
	}

	@Override
	public CPU createCPU() {
		return new GamingCPU();
	}

	@Override
	public RAM createRAM() {
		return new GamingRAM();
	}

}
