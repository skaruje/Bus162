package LS2_Konfiguration;
import java.util.Scanner;
public class Karten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    double[] prices = {2.0, 3.0, 8.8, 9.4}; // prices for each ticket option
		    double ticketPrice = 0;
		    int numberOfTickets = 0;
		    double payment = 0;
		    Scanner sc = new Scanner(System.in);
		    
		    while (ticketPrice == 0) {
		      System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:");
		      System.out.println("  Kurzstrecke AB [2,00 EUR] (1)");
		      System.out.println("  Einzelfahrschein AB [3,00 EUR] (2)");
		      System.out.println("  Tageskarte AB [8,80 EUR] (3)");
		      System.out.println("  4-Fahrten-Karte AB [9,40 EUR] (4)");
		      
		      int choice = sc.nextInt();
		      if (choice > 0 && choice < 5) {
		        ticketPrice = prices[choice - 1];
		        System.out.println("Anzahl der Tickets:");
		        numberOfTickets = sc.nextInt();
		        ticketPrice *= numberOfTickets;
		        System.out.println("Noch zu zahlen: " + ticketPrice + " €");
		      } else {
		        System.out.println("Falsche Eingabe");
		      }
		    }
		    
		    while (ticketPrice > 0) {
		      double input = sc.nextDouble();
		      if (input >= 0.05 && input <= 2.0) {
		        payment += input;
		        ticketPrice -= input;
		        System.out.println("Noch zu zahlen: " + ticketPrice + " €");
		      } else {
		        System.out.println("Ungültige Eingabe (mind. 5 Cent, höchstens 2 Euro)");
		      }
		    }
		    
		    System.out.println("Fahrschein wird ausgegeben");
		    System.out.println("========");
		    System.out.println("Vergessen Sie nicht, den Fahrschein vor Fahrtantritt entwerten zu lassen!");
		    System.out.println("Wir wünschen Ihnen eine gute Fahrt.");
		  }
		}	
		
	
