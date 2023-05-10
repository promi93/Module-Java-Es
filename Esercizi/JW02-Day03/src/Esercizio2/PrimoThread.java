package Esercizio2;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Esercizio1.starThread;

public class PrimoThread implements Runnable {

	private Logger log = LoggerFactory.getLogger(starThread.class);
	private int[] array;
	private int indiceIniziale;
	private int numeroElementi;
	static List<Integer> ListaRisultati;
	
	

	
public PrimoThread(int[] array, int indiceIniziale, int numeroElementi) {
		super();
		this.array = array;
		this.indiceIniziale = indiceIniziale;
		this.numeroElementi = numeroElementi;
	}





@Override
public void run() {
	int sommaParziale = 0;
	for (int i = indiceIniziale; i < indiceIniziale + numeroElementi; i++ ) {
		sommaParziale += array[i];
	}
	log.info("Somma ");
	ListaRisultati.add(sommaParziale);
		}
		

}
