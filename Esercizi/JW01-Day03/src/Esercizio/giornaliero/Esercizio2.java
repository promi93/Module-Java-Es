package Esercizio.giornaliero;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		// Inizializza lo scanner per l'acquisizione dell'input utente
		Scanner scanner = new Scanner(System.in);
		System.out.println("Conversione numeri in lettere");
		System.out.println("Inserire un numero intero seguito dal tasto Invio");
		int numero = scanner.nextInt();
		String numeroInLettere = null;
		
		switch (numero) {
		case 0: {
			numeroInLettere = "Zero";
			break;
		}
		case 1: {
			numeroInLettere = "Uno";
			break;
		}
		case 2: {
			numeroInLettere = "Due";
			break;
		}
		case 3: {
			numeroInLettere = "Tre";
			break;
		}
		default:
			numeroInLettere = "Numero non compreso tra 0 e 3, impossibile convertire";
		}
		
		System.out.println("Risultato: " + numeroInLettere);
	}

}
