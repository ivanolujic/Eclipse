package edunova.klase;

import java.util.Objects;

public class Pravokutnik {
	
	private int sirina;
	private int visina;
	
	// konstruktor je metoda koja se 
	// poziva s ključnom rječju new
	public Pravokutnik() {
		System.out.println("Pozvan konstruktor od pravokutnika");
	}
	
	public Pravokutnik(int sirina, int visina) {
		// super(); zasad obrisati
		this.sirina = sirina;
		this.visina = visina;
	}

	public int getSirina() {
		//int x; deklarirana varijabla na
		// razini klase i nije vidljiva u drugim klasama
		return sirina;
	}
	public void setSirina(int sirina) {
		// x=2; javlja grešku jer jer x
		// deklariran u drugoj klasi
		this.sirina = sirina;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	
	public int povrsina() {
		return sirina*visina;
		
	}
	
	// slijedeće se dobije upisivanje "to"+ctrl space i odabere se toString override...
	@Override
	public String toString() {
		return sirina + "-" + visina;
	}

	
	// slijedeće se dobije odabirom Source-Generate hashCode() and equals()... i odabirom Generate
	@Override
	public int hashCode() {
		return Objects.hash(sirina, visina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pravokutnik other = (Pravokutnik) obj;
		return sirina == other.sirina && visina == other.visina;
	}
	
	

}
