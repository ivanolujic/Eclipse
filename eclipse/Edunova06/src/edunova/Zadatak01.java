package edunova;

public class Zadatak01 {
	
	// Metoda prima niz cijelih brojeva
	// metoda vraća najmanji element niza
	// metoda se zove najmanji
	
	
	static int najmanji (int[] niz) {
		int nm=Integer.MAX_VALUE;
		for (int i:niz) {
			if(i>nm) {
				nm=i;
			}
			
		}
		return nm;
	}
	
	


}
