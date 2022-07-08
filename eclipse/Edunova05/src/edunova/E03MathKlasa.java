package edunova;

public class E03MathKlasa {

	public static void main(String[] args) {
		

		int i=0;
		while(true) {
			i = (int)(Math.random()*100);
			//System.out.println(i);
			if (i>=1 && i<=10) {
				System.out.println(i);
				break;
			}
		}
		
		// ili može i ovako
		// ((Math.random() * (max - min)) + min)
		
		int sb = (int) ((Math.random() * (10 - 1)) + 1);
		System.out.println(sb);
		
		

	}

}
