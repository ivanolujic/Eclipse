package edunova.klase;

public class Predavac extends Osoba {// nasljeđuje osobine klase Osoba
	
	private String iban;
	
	

	public Predavac() {// prazan konstruktor
	super();
}
	
// puni konstruktor Source-Generate Constructor, pa u gornjem izborniku odabarati (osoba(string,string)

	public Predavac(String ime, String prezime, String iban) { // puni konstruktor
		super(ime, prezime);// super predstavlja obraćanje SVIM klasama iznad
		this.iban = iban;// this predstavlja obraćanje ovoj klasi
	}





	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	@Override
		public String toString() {
			return super.toString() + " " + iban; //poziva toString metodu iz "super" metode (metode iznad), a što je klasa Osoba
			// koju ova klasa nasljeđuje
		}
	
	

}
