package business;

public class Demo {

	public static void main(String[] args) {
		
		ComputerFactory gamingFactory = new GamingComputerFactory();
		ComputerFactory regularFactory = new RegularComputerFactory();
		
		PCAssembler gamingPC = new PCAssembler(gamingFactory);
		PCAssembler regularPC = new PCAssembler(regularFactory);
		
		System.out.println("Gaming Computer:");
		System.out.println(gamingPC.assembleComputer());
		
		System.out.println();
		
		System.out.println("Gold Cabled Gaming Computer:");
		Computer goldGaming = new GoldCabledComputer(gamingPC.assembleComputer());
		goldGaming.plugCable();
		System.out.println(goldGaming);
		
		System.out.println();
		
		System.out.println("Silver Cabled Gaming Computer:");
		Computer silverGaming = new SilverCabledComputer(gamingPC.assembleComputer());
		silverGaming.plugCable();
		System.out.println(silverGaming);
		
		System.out.println();
		
		System.out.println("Regular Computer:");
		System.out.println(regularPC.assembleComputer());
		
		System.out.println();
		
		System.out.println("Gold Cabled Regular Computer:");
		Computer goldRegular = new GoldCabledComputer(regularPC.assembleComputer());
		goldRegular.plugCable();
		System.out.println(goldRegular);
		
		System.out.println();
		
		System.out.println("Silver Cabled Regular Computer:");
		Computer silverRegular = new SilverCabledComputer(regularPC.assembleComputer());
		silverRegular.plugCable();
		System.out.println(silverRegular);
	}

}
