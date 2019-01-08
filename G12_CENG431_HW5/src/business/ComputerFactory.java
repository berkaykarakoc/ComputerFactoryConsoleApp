package business;

public interface ComputerFactory {

	Keyboard createKeyboard();
	Mouse createMouse();
	Headphone createHeadphone();
	Monitor createMonitor();
	CPU createCPU();
	RAM createRAM();
	
}
