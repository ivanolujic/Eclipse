package edunova;

import javax.swing.JOptionPane;

public class Pomocno {
	
	/**
	 * Metoda osigurava unos cijelog broja
	 * koji može biti u cijelom rasponu
	 * int tip podatka
	 * @param poruka Koja se prikazuje korisniku
	 * @return Učitani cijeli broj
	 */
	public static int ucitajInt(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null,
						"Niste unijeli cijeli broj");
			}
				
			}
		}
	
	public static String ucitajString(String poruka) {
		String s;
		while(true) {
			s=JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) { // "trim" čisti slučajno unešeni razmak u stringu
				// čisti razmak sa lijeve i desne strane, ali ne i u sredini
				// npr.ako unese "_Ivan_" briše oba razmaka, ali ako unese
				// "Ivan_Ante", neće obrisati razmak u sredini
				JOptionPane.showMessageDialog(null, "Obavezan unos");
			}
			return s;
			
		}
	}
	
		
		// return 0; ovaj je samo upisan da nam ne baca grešku
	// dok upisujemo try catch. Poslije se može obrisati
	
	
	// slijedeća metoda provjerava da li je unešeni broj
	// pozitivan. Ima isti naziv kao i prethodna, pa se može odabrati
	// da li će kontrolirati samo unos cijelog broja ili i unos
	// pozitivnog broja - Pogledati Zadatak04 za korištenje
	
	public static int ucitajInt(String poruka, boolean pozitivni) {
		int i=ucitajInt(poruka);
		if(!pozitivni) {
			return i;
		}
		while(true) {
			if(i<0) {
				JOptionPane.showMessageDialog(null,
						"Učitani broj mora biti pozitiva");
				i=ucitajInt(poruka);
				continue;			
			}
			return i;
		}
	}
	
	/**
	 * Metoda vraća slučajni broj u rasponu od unešenih maksimalnom i minimalnog broja
	 * @param min
	 * @param max
	 * @return slučajni broj
	 */
	public static int slucajniBroj(int min,int max) {
		return min+(int)(Math.random()*((max-min)+1));
	}
	}


