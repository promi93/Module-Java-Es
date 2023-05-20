package esercizio.giornaliero;

public class GestioneDipendenti {

	public static void main(String[] args) {

		Dipendente[] arrayDipendenti = istanziaDipendenti();

		// Stampa lo stato prima delle promozioni
		stampaStatoDipendenti(arrayDipendenti);


		System.out.println("*********    PROMOZIONE DIPENDENTI     *********");
		// Promuove un operaio
		arrayDipendenti[0].promuovi();
		
		// Promuove l'impiegato
		arrayDipendenti[2].promuovi();
		
		// Stampa lo stato dopo le promozioni
		stampaStatoDipendenti(arrayDipendenti);
		
		int[] oreStraordinario = new int[]{5,5,5,5};
		
		double[] pagaDipendenti = calcolaPagaDipendenti(arrayDipendenti, oreStraordinario);
		
		stampaPagaDipendenti(arrayDipendenti, pagaDipendenti);

	}

	public static Dipendente[] istanziaDipendenti() {
		Dipendente[] arrayDipendenti = new Dipendente[4];

		// Istanzia gli operai
		arrayDipendenti[0] = new Dipendente("11111", Dipartimento.PRODUZIONE);
		arrayDipendenti[1] = new Dipendente("22222", Dipartimento.PRODUZIONE);

		// Istanzia un impiegato
		arrayDipendenti[2] = new Dipendente("33333", Dipartimento.AMMINISTRAZIONE,
				Dipendente.stipendioBase * Livello.IMPIEGATO.getMoltiplicatoreStipendio(), 30, Livello.IMPIEGATO);

		// Istanzia un dirigente
		arrayDipendenti[3] = new Dipendente("44444", Dipartimento.VENDITE,
				Dipendente.stipendioBase * Livello.DIRIGENTE.getMoltiplicatoreStipendio(), 30, Livello.DIRIGENTE);

		return arrayDipendenti;
	}

	public static void stampaStatoDipendenti(Dipendente[] arrayDipendenti) {
		System.out.println("*********       STATO DIPENDENTI       *********");

		for (int i = 0; i < arrayDipendenti.length; i++) {
			Dipendente dipendenteCorrente = arrayDipendenti[i];
			dipendenteCorrente.stampaDatiDipendente();
			System.out.println("-----------------------------------------------");
		}
	}
	
	public static double[] calcolaPagaDipendenti(Dipendente[] arrayDipendenti, int[] oreStraordinario) {
		double[] arrayPaghe;
		if (arrayDipendenti.length != oreStraordinario.length) {
			System.out.println("Array dipendenti e ore straordinario di dimensione differente, calcolo paghe interrotto");
			arrayPaghe = new double[0];
		} else {
			arrayPaghe = new double[arrayDipendenti.length];
			for (int i=0; i<arrayDipendenti.length;i++) {
				arrayPaghe[i] = Dipendente.calcolaPaga(arrayDipendenti[i], oreStraordinario[i]); 
			}
		}
		return arrayPaghe;
	}
	
	public static void stampaPagaDipendenti(Dipendente[] arrayDipendenti, double[] arrayPaghe) {
		if (arrayDipendenti.length != arrayPaghe.length) {
			System.out.println("Array dipendenti e paghe di dimensione differente, impossibile stampare paghe");
		} else {
			System.out.println("*********       PAGHE DIPENDENTI       *********");
			for (int i=0;i<arrayDipendenti.length;i++) {
				System.out.println("Dipendente: " + arrayDipendenti[i].getMatricola() + " - Paga: " + arrayPaghe[i]);
				System.out.println("-----------------------------------------------");
			}
			
			double totalePaghe = 0;
			for (int j=0; j<arrayPaghe.length; j++) {
				// Incrementa il valore precedente
				totalePaghe += arrayPaghe[j];
				
			}
			System.out.println("Totale paghe: " + totalePaghe);
		}
			
	}
}
