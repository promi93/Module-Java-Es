package Esercizio1;

public class Rettangolo {
	
	double altezza;
	double base;
	
	
	// COSTRUTTORE
	public Rettangolo (double altezza, double base) {
		this.altezza = altezza;
		this.base = base;
	}
	
	
	// CALCOLO DELL'AREA DEL RETTANGOLO
	public double calcolaArea () {
		
		return this.altezza * this.base;
	}
	
	
	// CALCOLO DEL PERIMETRO DEL RETTANGOLO
	public double calcolaPerimetro () {
		
		return (this.altezza) * 2 +  (this.base) * 2;
	}
	
	
	
	

}
