package business;

public class RegularKeyboard implements Keyboard {

	@Override
	public int getNumberOfKeys() {
		return (int) (Math.random()*24+84);
	}

	@Override
	public boolean hasBacklight() {
		return false;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*370+80);
	}

}
