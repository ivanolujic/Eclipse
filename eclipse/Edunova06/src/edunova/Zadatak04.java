package edunova;

public class Zadatak04 {
	
	// za dva učitana broja ispiši manji
	
	public static void main(String[] args) {
		int a=Pomocno.ucitajInt("Prvi"); // poziva pomoćnu metodu za unos brojeva
		int b=Pomocno.ucitajInt("Drugi",true); // ovdje je pozvana druga ucitajInt metodu, koja provjerava i da li je broj pozitivan
		
		System.out.println(a>=b ? b :a );// ako je a veće od b, ispisuje b, suprotno ispisuje a
		
		System.out.println(Pomocno.slucajniBroj(1,100));
		
		
		
	}

}
