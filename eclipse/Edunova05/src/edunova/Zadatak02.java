package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {

	public static void main(String[] args) {
		
		// Program od korisnika unosi cijele
		// brojeve dok korisnik ne unese broj -1
		// program ispisuje sumu svih unesenih
		// brojeva, koristeći while
		
		int i=0, suma=0;
		while (i!=-1) {
			i=Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj"));
			suma += i!=-1 ? i : 0;
		}
		System.out.println(suma);
		
		// ili suma += i
	    //}
	    //System.out.println(suma+1); da dodamo -1 koji je zadnji unešen

	}

}
