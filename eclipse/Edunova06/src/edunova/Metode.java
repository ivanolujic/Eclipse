package edunova;

import javax.swing.JButton;

public class Metode {
	
	// Još uvijek ćemo se zadržati na
	// static metodama
	
	//main je metoda
	public static void main(String[] args) {
		ime();
		ime();
		//int i=broj();
		//System.out.println(i);
		System.out.println(broj());
		
		int broj1=4;
		int broj2=3;
		zbroj(broj1,broj2);
		zbroj(3,9);
		int[] nn= {2,2,2};
		System.out.println(suma(nn));
		suma(3,56);
		
		System.out.println(Zadatak01.najmanji(nn)); // pozvana metoda iz Zadatak01
		
	}
	
	// kreiranje metode
	static void ime() { //procedura
		System.out.println("Osijek");
		System.out.println("Edunova");
	}
	
	static int broj() {
		return (int)(Math.random()*100);
	}
	
	static void zbroj(int i, int j) {
		System.out.println(i+j);
	}
	
	static int suma(int[] niz) {// zbraja sve brojeve u nizu
		int s=0;
		for(int i:niz) {
			s+=i;
		}
		
		return s;
	}
	
	// potpis metode: tip podatka + naziv + lista parametara
	static int suma(int a, int b) {
		return a+b;
	}
	

}
