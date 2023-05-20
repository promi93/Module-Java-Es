package Esercizio.giornaliero;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		verificaStringaPariDispari();
		
		verificaAnnoBisestile();
		
		
	}
	
	public static void verificaStringaPariDispari() {
		// Inizializza lo scanner per l'acquisizione dell'input utente
		Scanner scanner = new Scanner(System.in);
		System.out.println("Verifica se il numero di caratteri della stringa � pari o dispari");
		System.out.println("Inserire la stringa da verificare seguita dal tasto Invio");
		String stringa = scanner.nextLine();
		
		boolean pari = stringaPariDispari(stringa);
		
		if (pari == true) {
			System.out.println("Pari");
		} else {
			System.out.println("Dispari");
		}
		
	}
	
	public static void verificaAnnoBisestile() {
		// Inizializza lo scanner per l'acquisizione dell'input utente
		Scanner scanner = new Scanner(System.in);
		System.out.println("Verifica se l'anno � bisestile");
		System.out.println("Inserire l'anno da verificare seguito dal tasto Invio");
		int anno = scanner.nextInt();
		
		boolean bisestile = annoBisestile(anno);
		
		if (bisestile == true) {
			System.out.println("L'anno " + anno + " � bisestile");
		} else {
			System.out.println("L'anno " + anno + " non � bisestile");
		}
		
	}
	
	public static boolean stringaPariDispari(String stringa) {
		// Recupera il numero di caratteri che compongono la stringa
		int numCaratteri = stringa.length();
		
		// Usa l'operazione modulo (%) per verificare se pari o dispari
		if ( numCaratteri % 2 == 0) {
			// Divisibile per due, quindi pari
			return true;
		} else {
			// Non divisibile per due, quindi dispari
			return false;
		}
		
	}
	
	public static boolean annoBisestile(int anno) {
		if ( anno % 4 == 0) {
			// Divisibile per 4
			return true;
		} else	if ( anno % 100 == 0 && anno % 400 == 0) {
			// Divisibile per 100 AND divisibile per 400
				return true;
		}
		return false;
	}
	

}
