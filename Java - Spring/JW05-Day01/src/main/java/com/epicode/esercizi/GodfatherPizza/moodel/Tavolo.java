package com.epicode.esercizi.GodfatherPizza.moodel;

import lombok.Data;

@Data

public class Tavolo {
	
	private int numeroTavolo;
	private int numeroCoperti;
	private boolean disponibilita = false;
	
	
	public Tavolo(int numeroTavolo, int numeroCoperti) {
		super();
		this.numeroTavolo = numeroTavolo;
		this.numeroCoperti = numeroCoperti;
		this.disponibilita = false;
	}


	
	
}
