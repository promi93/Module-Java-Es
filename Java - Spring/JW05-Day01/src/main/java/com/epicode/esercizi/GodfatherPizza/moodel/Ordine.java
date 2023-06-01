package com.epicode.esercizi.GodfatherPizza.moodel;


import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

import lombok.Data;


@Data
public class Ordine {

	private int numero_ordine;
	private Tavolo tavolo;
	private List<FoodItem> ordinato;
	private StatoOrdine stato_ordine;
	private LocalDateTime orario;
	private int numero_coperti;
	private Double costo_coperto;
	
	
	public Ordine(int numero_ordine, Tavolo tavolo, int numero_coperti, Double costo_coperto) {
		super();
		this.numero_ordine = numero_ordine;
		this.tavolo = tavolo;
		this.ordinato = new ArrayList<FoodItem>();
		this.stato_ordine = StatoOrdine.IN_CORSO;
		this.orario = LocalDateTime.now();
		this.numero_coperti = numero_coperti;
		this.costo_coperto = costo_coperto;
	}

	
	public Double getTotale() {
		double totale = 0;
		double costoCoperti = costo_coperto * numero_coperti;
		
		for(FoodItem f : ordinato) {
			totale += f.getPrice();
		}
		return totale + costoCoperti;

	}
	
	
	
}
