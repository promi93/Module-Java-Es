package com.epicode.esercizi.GodfatherPizza.moodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // si può utilizzare al posto di scrivere singolarmente Gettere e Setter
@Builder
public class Franchise {

	private String name;
	private double price;
	
	public String getMenuItemLine() {
		return this.name + " - price: " + this.price;
	}

}
