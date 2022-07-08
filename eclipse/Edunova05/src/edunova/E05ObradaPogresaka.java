package edunova;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class E05ObradaPogresaka {

	public static void main(String[] args) {
		
		int i=0 ; // deklarirati varijablu prije petlje
		while(true) {
		try {
			i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			break; // izlazak iz petlje zato što je unešen ispravan broj
		} catch (Exception e) {
			//System.out.println("Neispravan unos");
			JOptionPane.showMessageDialog(null,"Neispravan unos");	
		}

	}
		System.out.println(i);
	}

}
