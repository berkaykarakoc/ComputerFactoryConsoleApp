package business;

public class ComputerComparisonApp {

	public static void main(String[] args) {
		Computer gamingComputer = ComputerFactory.getComputer(new GamingComputerFactory());
		Computer regularComputer = ComputerFactory.getComputer(new RegularComputerFactory());
		
		Computer goldGamingComputer = new GoldCableDecorator(ComputerFactory.getComputer(new GamingComputerFactory()));
		goldGamingComputer.plug();
		
		System.out.println("--GAMING COMPUTER SPECIFICATIONS--" + gamingComputer);
		System.out.println("********************************");
		System.out.println("--REGULAR COMPUTER SPECIFICATIONS--" + regularComputer);
		System.out.println("********************************");
		System.out.println("--RED GAMING COMPUTER SPECIFICATIONS--" + goldGamingComputer);
		
	}

}
