package business;

public class App {

	public static void main(String[] args) {
		Computer gamingPc = ComputerFactory.getComputer(new GamingPCFactory());
		Computer regularPc = ComputerFactory.getComputer(new RegularPCFactory());
		
		System.out.println("Gaming PC spesifications: " + gamingPc);
		System.out.println();
		System.out.println("Regular PC spesifications: " + regularPc);

	}

}
