package edunova;

public class Zadatak06 {

	public static void main(String[] args) {
		
		// Za dani jednodimenzionalni niz
		// cijelih brojeva progrem ispisuje
		// najveći
		
		int[] niz = {5,5,8,6,-6,8,-1,0,9,0};
		// treba ispisati 9, jer je najveći
		
		int najveci=Integer.MIN_VALUE;
		for (int i:niz) {
			if(i>najveci) {
				najveci=i;
			}
			
		}
		System.out.println(najveci);

	}

}
