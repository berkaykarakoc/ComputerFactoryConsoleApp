package business;

public class ComputerDecorator implements Computer {

	protected Computer computer;
	
	public ComputerDecorator(Computer computer) {
		this.computer = computer;
	}
	
	@Override
	public void plugCable() {
		this.computer.plugCable();
	}
	
	public Computer getComputer() {
		return computer;
	}

	@Override
	public void add2Price(int price) {
		this.computer.add2Price(price);
	}

	@Override
	public void setCableType(CableType type) {
		this.computer.setCableType(type);
	}
	
	@Override
	public String toString() {
		return this.computer.toString();
	}

}
