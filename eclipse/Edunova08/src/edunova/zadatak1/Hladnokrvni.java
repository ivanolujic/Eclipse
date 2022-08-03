package edunova.zadatak1;

public class Hladnokrvni extends Fauna {
	
	private String xxx;
	
	
	public Hladnokrvni(String naziv) {
		super(naziv);
	}
	
	

	public Hladnokrvni(String naziv, String xxx) {
		super(naziv);
		this.xxx = xxx;
	}



	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}
	
	

}
