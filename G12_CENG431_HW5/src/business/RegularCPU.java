package business;

public class RegularCPU implements CPU {

	private String versionArr[] = {"i3","i5"};
	
	@Override
	public String getVersion() {
		return versionArr[(int)(Math.random()*2)];
	}

	@Override
	public Double getFrequency() {
		return Math.random()*2+1;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*4000+8000);
	}

}
