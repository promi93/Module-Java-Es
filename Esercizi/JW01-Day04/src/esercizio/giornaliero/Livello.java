package esercizio.giornaliero;

public enum Livello {
	OPERAIO(1),
	IMPIEGATO(1.2),
	QUADRO(1.5),
	DIRIGENTE(2);
	
	private double moltiplicatoreStipendio;
	
	private Livello(double value) {
		this.moltiplicatoreStipendio = value;
	}
	
	public double getMoltiplicatoreStipendio() {
		return this.moltiplicatoreStipendio;
	}

}
