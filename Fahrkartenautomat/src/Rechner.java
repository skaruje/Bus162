
import java.util.Scanner;
public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		double ergebniszehncent = 0; 
		double ergebniszwanzigcent = 0;
		double ergebnisfünzigcent = 0;
		double ergebniseinE = 0;
		double ergebnisZweiE = 0;
		double ergebnisfünfer = 0;
		double ergebnisZehnE = 0;
		double ergebniszwanzigE = 0;
		double ergebnisfünfzigE = 0;

		double ergebnis1 = 0;
		double ergebnis2 = 0;
		double ergebnis3 = 0;
		double ergebnis4 = 0;
		double ergebnis5 = 0;
		double ergebnis6 = 0;
		double ergebnis7 = 0;
		double ergebnis8 = 0;
		double ergebnis9 = 0;

		
		double zehncent = 0.10;
		double zwanzigcent = 0.20;
		double fünzigcent = 0.50;
		double einE = 1.00;
		double ZweiE = 2.00;
		double fünfer = 5.00;
		double ZehnE = 10.00;
		double zwanzigE = 20.00;
		double fünfzigE = 50.00;
		
		Scanner tastatur = new Scanner(System.in);
		
		System.out.println("bitte werfen sie ihre 10Cent Münzen ein");
		ergebniszehncent = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 20Cent Münzen ein");
		ergebniszwanzigcent = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 50Cent Münzen ein");
		ergebnisfünzigcent = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 1Euro Münzen ein");
		ergebniseinE = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 2Euro Münzen ein");
		ergebnisZweiE = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 5Euro Scheine ein");
		ergebnisfünfer = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 10Euro Scheine ein");
		ergebnisZehnE = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 20Euro Scheine ein");
		ergebniszwanzigE = tastatur.nextInt();
		System.out.println("bitte werfen sie ihre 50Euro Scheine ein");
		ergebnisfünfzigE = tastatur.nextInt();
		
		tastatur.close();
		
		ergebnis1 = zehncent * ergebniszehncent;
		ergebnis2 = zwanzigcent * ergebniszwanzigcent;
		ergebnis3 = fünzigcent * ergebnisfünzigcent;
		ergebnis4 = einE * ergebniseinE;
		ergebnis5 = ZweiE * ergebnisZweiE;
		ergebnis6 = fünfer * ergebnisfünfer;
		ergebnis7 = ZehnE * ergebnisZehnE;
		ergebnis8 = zwanzigE * ergebniszwanzigE;
		ergebnis9 = fünfzigE * ergebnisfünfzigE;
		
		
		
		System.out.println( ergebnis1 + ergebnis2 + ergebnis3 + ergebnis4 + ergebnis5 + ergebnis6 + ergebnis7 + ergebnis8 + ergebnis9);
		
		
		
		
		double Einzelfahrschein = 3.20;
		double Tageskarte = 7.00;
		double Monatskarte = 98.50;
		double zwölfuhrkarte = 70.20;
		double vierfahrten = 12.10;
		double ermäßigt = 48.90;
		
		
		
		
		
		
	}

}
