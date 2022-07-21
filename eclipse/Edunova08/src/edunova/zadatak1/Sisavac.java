package edunova.zadatak1;

public class Sisavac extends Toplokrvni {
	
	private int danitrudnoce;
	
	
	public Sisavac(String naziv, Double temperatura) {
		super(naziv, temperatura);
	}
	
	

	public Sisavac(String naziv, Double temperatura, int danitrudnoce) {
		super(naziv, temperatura);
		this.danitrudnoce = danitrudnoce;
	}



	public int getDanitrudnoce() {
		return danitrudnoce;
	}

	public void setDanitrudnoce(int danitrudnoce) {
		this.danitrudnoce = danitrudnoce;
	}
	
	

}
