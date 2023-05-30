package com.epicode.esercizi.GodfatherPizza.moodel;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ordine {

	private int numero_ordine;
	private Tavolo tavolo;
	private List<FoodItem> foodList;
	private StatoOrdine stato_ordine;
	private LocalDateTime orario;
	private int numero_coperti;
	private double conto_finale;
	@Value("${tavolo.coperto.costo}") private String costo_coperto;
	
	
}
