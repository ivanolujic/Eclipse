package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	
	//Program učitava dva broja
		//ispisuje zbroj dvaju učitanih brojeva
		//Kreirati metode:
		//ucitaj
		//izracunaj
		//ispisi
		
	public static void main(String[] args) {
		ispisi(izracunaj(ucitaj("Prvi"),ucitaj("Drugi")));
		
	}	
	
			static int ucitaj (String poruka) { // učitavamo samo jedan broj, jer metoda vraća samo jedan podatak
				// ako trebamo više brojeva, onda pozovemo metodu više puta	
					return
							Integer.parseInt(
									JOptionPane.showInputDialog(poruka));
				}

				static int izracunaj (int a, int b) {//izračunava zbroj SAMO dvaju brojeva
					return a+b;
				}
				
				static void ispisi (int c) { // ispisuje broj(u ovom slučaju zbroj)
					System.out.println(c);
				}


}
