package Esercizio1;

public class EsercizioRettangolo {

	public static void main(String[] args) {		

		Rettangolo n  = new Rettangolo(3, 6);
		Rettangolo n1 = new Rettangolo(2, 3);
		Rettangolo n2 = new Rettangolo(4, 2);
		
		stampaRettangolo(n);
		
		stampaDueRettangoli(n1, n2);
		
		
		
	}
	
	
	public static void stampaRettangolo(Rettangolo n) {
		System.out.println("l'area del rettangolo è " + n.calcolaArea() + " e il suo perimetro è di " + n.calcolaPerimetro() );
	}
	
	public static void stampaDueRettangoli(Rettangolo n1, Rettangolo n2) {
		stampaRettangolo(n1);
		stampaRettangolo(n2);
		System.out.println("Somma area dei due rettangoli: " + (n1.calcolaArea() + n2.calcolaArea()));
		System.out.println("Somma perimetro dei due rettangoli: " + (n1.calcolaPerimetro() + n2.calcolaPerimetro()));
	}
	
	
}

