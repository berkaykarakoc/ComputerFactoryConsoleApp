package business;

public abstract class Computer {
	

	public abstract CPU getCpu();

	public abstract RAM getRam();

	public abstract Monitor getMonitor();

	public abstract Headphone getHeadphone();

	public abstract Keyboard getKeyboard();

	public abstract Mouse getMouse();
	
	public String toString() {
		return "\nCPU: " + this.getCpu() + "\nRAM: " + this.getRam() + "\nMONITOR: " + this.getMonitor()
		+ "\nHEADPHONE: " + this.getHeadphone() + "\nKEYBOARD: " + this.getKeyboard()
		+ "\nMOUSE: " + this.getMouse();
	}
	
}
