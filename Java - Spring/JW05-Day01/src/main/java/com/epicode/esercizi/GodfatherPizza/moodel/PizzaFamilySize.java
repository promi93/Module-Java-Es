package com.epicode.esercizi.GodfatherPizza.moodel;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaFamilySize extends Pizza {

	private Pizza pizza;
	private String name;
	private double calories;
	private double price;
	
	public PizzaFamilySize(Pizza pizza) {
		super();
		this.name = "Family Size for Pizza";
		this.price = 4.15;
		this.calories = 1.95;
		this.pizza = pizza;
	}
	
	public String getMenuItemLine() {
		return this.name + " - calories: x" + this.calories + " - price: " + this.price;
	}
	
	
}
