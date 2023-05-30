package com.epicode.esercizi.GodfatherPizza.moodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tavolo {
	
	private int numeroTavolo;
	private int numeroCoperti;
	private boolean disponibilita = true;


}
