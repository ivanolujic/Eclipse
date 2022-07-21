package edunova;

import edunova.klase.Osoba;
import edunova.klase.Polaznik;
import edunova.klase.Pravokutnik;
import edunova.klase.Predavac;
import util.Pomocno;

public class Start {
	
	public static void main(String[] args) {
		
		//deklaracija
		Pravokutnik p = new Pravokutnik(); // nakon unošenja
		// Pravokutnik, pritisnuti ctrl razmak da bi se klasa
		// učitala (gore) jer se klasa Pravokutnik nalazi u
		// drugom paketu (edunova.klasa)
		
		// instanciranje - pozivanje posebne metode konstruktor
		p = new Pravokutnik(20,10);
		
		//postavljanje vrijednosti za širinu
		// i visinu sa konstruktorom
		
		//p.setSirina(20); nisu potrebni ako koristimo konstruktor
		//p.setVisina(10);
		
		// ovo se ne radi
		//System.out.println(p.getSirina()*p.getVisina());
		
		System.out.println(p.povrsina());
		
		Osoba o=new Osoba();// "prazan" konstruktor
		o.setIme("Pero");
		o.setPrezime("Perić");
		
		o=new Osoba("Maja","Majić");// "puni" konstruktor
		// ovdje je jedan red u odnosu na dva reda
		// kod praznog konstruktora
		
		Polaznik polaznik = new Polaznik();
		
		Predavac predavac = new Predavac();
		//predavac.set
		
		// tekstualni reprezentant objekta
		
		p = new Pravokutnik(5,5);
		
		System.out.println(p);
		// edunova.klase.Pravokutnik@6a5fc7f7  - ova info nakon što se program starta dolazi iz metode
		// Object.toString
		// Rješava se unosom u klasi Pravokutnik - redovi 44 do 47
		
		
		Pravokutnik drugi = new Pravokutnik(5,5);
		System.out.println(p.equals(drugi));// ispisuje "false", zato što equals ne provjerava vrijednosti svojstava, nego
		// provjerava memorijsku lokaciju
		
		System.out.println(p.hashCode());
		System.out.println(drugi.hashCode());// kad se izvede vidi se da "p" i "drugi" imaju različite memorijske lokacije
		
		// da bi se to ispravilo, u klasi Pravokutnik se generira hashCode - od linije 51 do 67
		// problem je ako se u klasi Pravokutni dodaje nešto novo. Tada treba ponovno generirti
		// hashCode da bi se sve "osvježilo"
		
		
		polaznik = new Polaznik("Pero", "Perić", "2022/12");
		predavac = new Predavac("Maja","Majić", "HR25456");
		
		System.out.println(polaznik);// na polazniku nema metode toString
		System.out.println(predavac);
		
		// povezivanje sa drugim klasama iz drugih paketa
		
		// konkretno povezivanje sa pomoćnim programima, koji su u projektu Edunova07
		// 1. kliknemo desnim mišem na projekt u koji želimo kopirati (konkretno Edunova08)
		// 2. odaberemo Properties
		// 3. u lijevom izborniku odaberemo Java build path
		// 4. u desnom izborniku označiti Classpath i pritisnuti Add na desnoj strani
		// 5. odabrati projekte koje se želi kopirati (konkretno Edunova07)
		// 6. pritisnuti Apply and Close
		// 7. još je potrebno u clasi module-info projekta u koji smo kopirali (Edunova08) upisati
		// "requires edunova07"
		
		
		predavac.setIme(Pomocno.ucitajString("Daj ime"));
		
		
		
		
	}

}
