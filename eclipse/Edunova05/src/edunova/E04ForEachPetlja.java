package edunova;

public class E04ForEachPetlja {

	public static void main(String[] args) {
		
		int[] niz= {1,5,4,2,1,2,4};
		
		//ispiši svaki element niza jedno ispod drugog
		// sa for petljom
		
		for (int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		// foreach
		
		for (int broj:niz) {
			// nemamo pristup indeksu
			// ne može ispisivati unazad
			System.out.println(broj);
		}
		
	}

}
