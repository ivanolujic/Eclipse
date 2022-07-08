package edunova;

public class Zadatak01 {
	
	//Kreirati program koji prvo traži
	//broj predmeta. Zatim za svaki predmet 
	// unosi naziv i zaključenu ocjenu
	// program ispisuje popis svih predmeta s
	// ocjenama i prosjek ocjena
	
	public static void main(String[] args) {
		
		Predmet[] predmeti = new
				Predmet[Pomocno
				        .ucitajInt("Unesi broj predmeta")];
		
		Predmet predmet;
		for (int i=0;i<predmeti.length;i++) {
			predmet = new Predmet();
			predmet.setNaziv(Pomocno.ucitajString(
					"Unesi naziv za "+ (i+1) + " predmet"));
			predmet.setOcjena(Pomocno.ucitajInt(
					"Unesi ocjenu za "+ (i+1) + " predmet"));
			
			predmeti[i]=predmet;
			
		
		}
		
		int suma=0;
		for(Predmet p:predmeti) {
			suma+=p.getOcjena();
			System.out.println(p.getNaziv() + 
					": " + p.getOcjena());
			}
		
		float prosjek = suma/(float)predmeti.length;
		System.out.println("Prosjek: " + prosjek);
		
		
		
	}

}
