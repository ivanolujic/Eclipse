package edunova.zadatak2;

import util.Pomocno;

public class Main {

	public static void main(String[] args) {
		
		Racunalo r = new Racunalo();
		r.setNaziv(Pomocno.ucitajString("Unesi naziv proizvođača"));
		
		Televizor t = new Televizor();
		r.setVrstaPrikljucka(Pomocno.ucitajString("Unesi naziv priključka"));
		
		

	}

}
