package LS2_Konfiguration;
import java.util.Scanner;
public class Ticketauswahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double Ticketpreis = 3.00;
		int Ticketanzahl = 0;
		double Geld = 0;
		double ZSumme;
		double Rückgeld = 0;
		
		System.out.printf("Ticketpreis (Euro): %.2f", Ticketpreis);
		
		while (Ticketanzahl > 10 || Ticketanzahl < 1){
			System.out.print("\nBitte Geben sie die Anzahl der Tickets Ein \n");
			Ticketanzahl = sc.nextInt();
		
			if (Ticketanzahl > 10 || Ticketanzahl < 1){
				System.out.print("Die Ticketanzhal darf nicht kleiner als 1 oder Größer als 10 sein \n");
				System.out.print("Bitte Geben sie die Anzahl der Tickets Ein \n");
				Ticketanzahl = sc.nextInt();

			}else if(Ticketanzahl < 10 || Ticketanzahl > 1){
			
				System.out.print("Anzahl der Tickets: " + Ticketanzahl);
				
			}
		
			Ticketpreis = Ticketpreis * Ticketanzahl;
			
					
			
			while (Ticketpreis > Geld) {
				System.out.print("\nIhr Ticket Kostet:" + Ticketpreis);
				System.out.print("\nBitte werfen sie ihr Geld ein \n" + "Info: Höchstens 2€ Mindesttens 0,05Cent\n");
				ZSumme = sc.nextDouble();
				Geld = Geld + ZSumme;
				System.out.print("Ihr Derzeitg Eingeworfens Geld: " + Geld);
						
			}
			
			Rückgeld = Geld - Ticketpreis;
			System.out.print("\nIhr Rückgeld Berägt: " + Rückgeld);
			System.out.print("\nIhr Ticket Wird gedruckt");
		}
		
	}

}
