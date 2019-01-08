package business;

public class GamingKeyboard implements Keyboard {

	@Override
	public int getNumberOfKeys() {
		return (int) (Math.random()*24+84);
	}

	@Override
	public boolean hasBacklight() {
		return true;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*1000+500);
	}

}
