package business;

public class GoldCabledComputer extends ComputerDecorator {

	public GoldCabledComputer(Computer computer) {
		super(computer);
	}
	
	@Override
	public void plugCable() {
		super.plugCable();
		super.add2Price(500);
		super.setCableType(CableType.GOLD);
	}

}
