package business;

public class GamingCPU implements CPU {
	
	private String versionArr[] = {"i5", "i7"};
	
	@Override
	public String getVersion() {
		return versionArr[(int)(Math.random()*2)];
	}

	@Override
	public Double getFrequency() {
		return Math.random()*2+3;
	}
	
	@Override
	public int getPrice() {
		return (int)(Math.random()*10000+14000);
	}

}
