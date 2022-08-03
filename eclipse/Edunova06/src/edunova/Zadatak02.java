package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
	// Za primljeni cijeli broj
	// metoda naziva isPrime
	// vraća true ako je prim (prosti)
	// ili false ako nije
	
	static boolean isPrime (int broj) {
		for(int i=2;i<broj;i++) {
			if(broj%i==0) {
				return false; // short cuircuit
			}
		}
		return true;
	}

}
