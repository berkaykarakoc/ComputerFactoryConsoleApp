package business;

public class SilverCabledComputer extends ComputerDecorator {

	public SilverCabledComputer(Computer computer) {
		super(computer);
	}
	
	@Override
	public void plugCable() {
		super.plugCable();
		super.add2Price(350);
		super.setCableType(CableType.SILVER);
	}

}
