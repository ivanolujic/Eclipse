package edunova;

public class E02DoWhilePetlja {

	public static void main(String[] args) {
		
		// Osigurava minimalno jednu iteraciju petlje
		// uvjet izlaska iz petlje je na kraju
		int i=10;
		do {
			System.out.println("Osijek");
		}while (i>10);
		
		// sve ostalo što vrijedi za for i while
		// vrijedi i za dowhile
		
		// beskonačna do while
		
		do {
			break;
		}while(true);

	}

}
