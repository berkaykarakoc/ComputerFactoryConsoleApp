package business;

public class SilverCableDecorator extends CableDecorator {
	
	public SilverCableDecorator(Computer decoratedComputer) {
		super(decoratedComputer);
	}

	@Override
	public Device getKeyboard() {
		return decoratedComputer.getKeyboard();
	}

	@Override
	public Device getMouse() {
		return decoratedComputer.getMouse();
	}

	@Override
	public Device getMonitor() {
		return decoratedComputer.getMonitor();
	}

	@Override
	public Device getHeadphone() {
		return decoratedComputer.getHeadphone();
	}

	@Override
	public Device getCPU() {
		return decoratedComputer.getCPU();
	}

	@Override
	public Device getRAM() {
		return decoratedComputer.getRAM();
	}

	@Override
	public int getTotalPrice() {
		return decoratedComputer.getTotalPrice();
	}

	@Override
	public void setTotalPrice(int totalPrice) {
		decoratedComputer.setTotalPrice(totalPrice);
	}

	@Override
	public Cable getCable() {
		return decoratedComputer.getCable();
	}

	@Override
	public void setCable(Cable cable) {
		decoratedComputer.setCable(cable);
	}
	
	@Override
	public void plug() {
		decoratedComputer.plug();
		add2Price();
	}
	
	private void add2Price() {
		decoratedComputer.setCable(Cable.SILVER);
		setTotalPrice(decoratedComputer.getTotalPrice()+350);
	}

}
