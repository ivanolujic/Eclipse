package edunova.zadatak1;

public class Toplokrvni extends Fauna {
	
	private Double temperatura;
	
	

	public Toplokrvni(String naziv, Double temperatura) {
		super(naziv);
		this.temperatura = temperatura;
	}

	public Toplokrvni(String naziv) {
		super(naziv);
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
