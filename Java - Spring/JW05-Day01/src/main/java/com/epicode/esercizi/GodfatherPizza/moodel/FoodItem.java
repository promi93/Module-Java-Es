package com.epicode.esercizi.GodfatherPizza.moodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data // si può utilizzare al posto di scrivere singolarmente Gettere e Setter
public abstract class FoodItem {

	protected String name;
	protected double price;
	protected double calories;
	

	
	public String getMenuItemLine() {
		return this.name + " - calories: " + " - price: " + this.price;
	}
	
	
}
