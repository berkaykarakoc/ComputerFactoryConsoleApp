package business;

public class ComputerComparisonApp {

	public static void main(String[] args) {
		Computer gamingComputer = ComputerFactory.getComputer(new GamingComputerFactory());
		Computer regularComputer = ComputerFactory.getComputer(new RegularComputerFactory());
		
		Computer goldGamingComputer = new GoldCableDecorator(ComputerFactory.getComputer(new GamingComputerFactory()));
		goldGamingComputer.plug();
		
		Computer silverGamingComputer = new SilverCableDecorator(ComputerFactory.getComputer(new GamingComputerFactory()));
		silverGamingComputer.plug();
		
		Computer goldRegularComputer = new GoldCableDecorator(ComputerFactory.getComputer(new RegularComputerFactory()));
		goldRegularComputer.plug();
		
		Computer silverRegularComputer = new SilverCableDecorator(ComputerFactory.getComputer(new RegularComputerFactory()));
		silverRegularComputer.plug();
		
		System.out.println("--GAMING COMPUTER SPECIFICATIONS--" + gamingComputer);
		System.out.println("********************************");
		System.out.println("--REGULAR COMPUTER SPECIFICATIONS--" + regularComputer);
		System.out.println("********************************");
		System.out.println("--GOLD GAMING COMPUTER SPECIFICATIONS--" + goldGamingComputer);
		System.out.println("********************************");
		System.out.println("--SILVER GAMING COMPUTER SPECIFICATIONS--" + silverGamingComputer);
		System.out.println("********************************");
		System.out.println("--GOLD REGULAR COMPUTER SPECIFICATIONS--" + goldRegularComputer);
		System.out.println("********************************");
		System.out.println("--SILVER REGULAR COMPUTER SPECIFICATIONS--" + silverRegularComputer);
		
	}

}
