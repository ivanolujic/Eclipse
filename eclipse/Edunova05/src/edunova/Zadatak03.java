package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak03 {

	public static void main(String[] args) {
		
		// Korisnik unosi dimenzije 
		// matrice (x i y)
		// program puni matricu slučajnim 
		// vrijednostima između 5 i 9
		// program ispisuje izgrađenu matricu
		
		int [][] matrica = new int [
		                            Integer.parseInt(
		                            		JOptionPane.showInputDialog("x")
		                            		)
		                            ]
		                            		[Integer.parseInt(
		                            				JOptionPane.showInputDialog("y")
		                            				)];
		
		for (int i=0; i<matrica.length;i++) {
			for (int j=0;j<matrica[i].length;j++) {
				matrica [i][j] = (int)((Math.random() * (9 - 5)) + 5);
			}
		}
		for (int i=0;i<matrica.length;i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}
		
				
	}

	
}
