package business;

public abstract class CableDecorator extends Computer {

	protected Computer decoratedComputer;
	
	public CableDecorator(Computer decoratedComputer) {
		super();
		this.decoratedComputer = decoratedComputer;
	}

}
