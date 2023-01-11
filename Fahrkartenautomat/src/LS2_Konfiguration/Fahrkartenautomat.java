package LS2_Konfiguration;
import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

 {
	Scanner tastatur = new Scanner(System.in);

				double zuZahlenderBetrag;
				double eingezahlterGesamtbetrag;
				double eingeworfeneMuenze;
				double rueckgabebetrag;
				double nochZuZahlen;
				int Ticketanzahl;
				// 1
				System.out.print("Zu zahlender Betrag (Euro): ");
				zuZahlenderBetrag = tastatur.nextDouble();
				
				
				
				//1.1
				System.out.print("Bitte nennen sie die Anzahl der Tickets: ");
				Ticketanzahl = tastatur.nextInt();
				if(Ticketanzahl > 15)
					Ticketanzahl = 1;
				if(Ticketanzahl < 1)
					Ticketanzahl = 1;
				System.out.print("Anzahl der Tickets: " + Ticketanzahl + "\n");
				

				// 2
				eingezahlterGesamtbetrag = 0.0;
				nochZuZahlen = 0.0;
				while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
					nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
					System.out.printf("Noch zu zahlen: %.2f %S ", nochZuZahlen, "Euro" );
					System.out.print("\nEingabe (mind. 5 Cent, höchstens 2 Euro): ");
					eingeworfeneMuenze = tastatur.nextDouble();
					eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
				}
				
				// 3
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
				
				// 4
				rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
				if (rueckgabebetrag > 0.0) {
					System.out.printf("Der Rückgabebetrag in Höhe von: %.2f %S", rueckgabebetrag," Euro");
					System.out.println("\nwird in folgenden Münzen ausgezahlt:");

					while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
						System.out.println("2 Euro");
						rueckgabebetrag = rueckgabebetrag - 2.0;
					}
					while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
						System.out.println("1 Euro");
						rueckgabebetrag = rueckgabebetrag - 1.0;
					}
					while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
						System.out.println("50 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.5;
					}
					while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
						System.out.println("20 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.2;
					}
					while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
						System.out.println("10 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.1;
					}
					while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
						System.out.println("5 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.05;
					}
				}

				System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
						+ "Wir wünschen Ihnen eine gute Fahrt.");

				tastatur.close();
			}
		}
	
}