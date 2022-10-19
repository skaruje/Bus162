package LS2_Konfiguration;

public class Konfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String	typ = "Automat AVR";
		String	bezeichnung = "Q2021_FAB_A";
		String	name = typ + " " + bezeichnung;
		System.out.println("Name: " + name);

		
		char sprachModul = 'd';
		System.out.println("Sprache: " + sprachModul);
		
		byte PRUEFNR = 4;
		System.out.println("Prüfnummer : " + PRUEFNR);
		
		double maximum = 100.00;
		double patrone = 46.24;
		double prozent = maximum - patrone;
		System.out.println("Füllstand Patrone: " + prozent + " %");

	int muenzenCent = 1280;
	int muenzenEuro = 130;
	int summe = muenzenCent + muenzenEuro * 100;	
	int	euro = summe / 100;
	int	cent = summe % 100;
	
	System.out.println("Summe Euro: " + euro +  " Euro");
	System.out.println("Summe Rest: " + cent +  " Cent");

	
		boolean status = (euro <= 150) && (prozent >= 50.00) && (euro >= 50) && (cent != 0) && (sprachModul == 'd') &&  (!(PRUEFNR == 5 || PRUEFNR == 6));
		System.out.println("Status: " + status);


		
		
		
	}

}
