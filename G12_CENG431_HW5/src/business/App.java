package business;

public class App {

	public static void main(String[] args) {
		Computer gamingPc = ComputerFactory.getComputer(new GamingPCFactory());
		Computer regularPc = ComputerFactory.getComputer(new RegularPCFactory());
		
		System.out.println("Gaming PC specifications: " + gamingPc);
		System.out.println();
		System.out.println("Regular PC specifications: " + regularPc);

	}

}
