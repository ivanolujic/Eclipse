package edunova;

import javax.swing.JOptionPane;

public class Zadatak07 {

	public static void main(String[] args) {
		
		// program osigurava unos niza
		// znakova (String) koji ima
		// minimalno 3 znaka
		// ako nema tri znaka ispisuje korisniku
		// poruku: Minimalno 3 znaka
		
		String s;
		while(true) {
			s =JOptionPane.showInputDialog("Unesi naziv");
			if(s.length()<3) {
				JOptionPane.showMessageDialog(null, "Unijeti barem tri znaka");
				continue;
			}
			break;	
		}
		System.out.println(s);
		
		

	}

}
