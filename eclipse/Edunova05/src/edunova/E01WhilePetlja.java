package edunova;

public class E01WhilePetlja {

	public static void main(String[] args) {
		
		// while radi sa boolean tipom podatka
		// beskonačna petlja
		while(true) {
			break;
		}
		
		// ispisati brojeve od 1 do 10
		int i=0;
		while(i<10) {
			// System.out.println(i+1); ovako postavljeno stvara beskonačnu petlju
			System.out.println(++i);
		}
		
		// u for petlju se ne mora ući
		for (int t=10;t>10;t++) {
			System.out.println("Osijek");
		}
		
		// u while petlju se ne mora ući
		int t=2;
		while(t>2) {
			System.out.println("Edunova");
		}
		

	}

}
