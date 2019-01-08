package business;

public class RegularComputerFactory implements ComputerFactory {

	@Override
	public Keyboard createKeyboard() {
		return new RegularKeyboard();
	}

	@Override
	public Mouse createMouse() {
		return new GamingMouse();
	}

	@Override
	public Headphone createHeadphone() {
		return new RegularHeadphone();
	}

	@Override
	public Monitor createMonitor() {
		return new RegularMonitor();
	}

	@Override
	public CPU createCPU() {
		return new RegularCPU();
	}

	@Override
	public RAM createRAM() {
		return new RegularRAM();
	}
	
}
