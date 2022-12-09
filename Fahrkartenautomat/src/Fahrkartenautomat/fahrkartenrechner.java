package Fahrkartenautomat;
import java.util.Scanner;
public class fahrkartenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner tastatur = new Scanner(System.in);
	        double ticketPreis;
	        double zuZahlenderBetrag;
	        double eingezahlterGesamtbetrag;
	        double eingeworfeneMuenze;
	        double rueckgabebetrag;
	        double nochZuZahlen;
	        int anzahlTickets;

	        // Fahrscheinausgabe
	        System.out.print("Preis pro Ticket (Euro): ");
	        ticketPreis = tastatur.nextDouble();
	        System.out.print("Anzahl der Tickets: ");
	        anzahlTickets = tastatur.nextInt();
	        zuZahlenderBetrag = ticketPreis * anzahlTickets;
	        System.out.printf("Zu zahlender Betrag: %.2f Euro\n", zuZahlenderBetrag);


	        // Geldbertrag eingeben
	        eingezahlterGesamtbetrag = 0.0;
	        nochZuZahlen = 0.0;
	        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
	            nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
	            System.out.printf("Noch zu zahlen: %.2f Euro \n", nochZuZahlen);
	            System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
	            eingeworfeneMuenze = tastatur.nextDouble();
	            eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
	        }

	        // Rückgeldberechnung und -ausgabe
	        System.out.println("\nFahrschein wird ausgegeben");
	        for (int i = 0; i < 8; i++) {
	            System.out.print("=");
	            try {
	                Thread.sleep(200);
	            }
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("\n\n");

	        // Geldeinwurf
	        rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
	        if (rueckgabebetrag > 0.0) {
	            System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro ", rueckgabebetrag);
	            System.out.println("wird in folgenden Münzen ausgezahlt:");
	            rueckgabebetrag = rueckgabebetrag*100;

	            while (rueckgabebetrag >= 200) { // 2-Euro-Münzen
	                System.out.println("2 Euro");
	                rueckgabebetrag = rueckgabebetrag - 200;

	            }
	            while (rueckgabebetrag >= 100) { // 1-Euro-Münzen
	                System.out.println("1 Euro");
	                rueckgabebetrag = rueckgabebetrag - 100;
	            }
	            while (rueckgabebetrag >= 50) { // 50-Cent-Münzen
	                System.out.println("50 Cent");
	                rueckgabebetrag = rueckgabebetrag - 50;
	            }
	            while (rueckgabebetrag >= 2) { // 20-Cent-Münzen
	                System.out.println("20 Cent");
	                rueckgabebetrag = rueckgabebetrag - 20;
	            }
	            while (rueckgabebetrag >= 1) { // 10-Cent-Münzen
	                System.out.println("10 Cent");
	                rueckgabebetrag = rueckgabebetrag - 10;
	            }
	            while (rueckgabebetrag >= 5) { // 5-Cent-Münzen
	                System.out.println("5 Cent");
	                rueckgabebetrag = rueckgabebetrag - 5;
	            }
	        }

	        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
	                + "Wir wünschen Ihnen eine gute Fahrt.");

	        tastatur.close();
	    }
	
		
	}


