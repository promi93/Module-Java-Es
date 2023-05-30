package com.epicode.esercizi.GodfatherPizza.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.esercizi.GodfatherPizza.moodel.Menu;
import com.epicode.esercizi.GodfatherPizza.moodel.Pizza;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaFamilySize;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaHawaian;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaMargherita;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaSalami;

@Configuration
public class MenuConfiguration {

	@Bean
	public Menu menu() {
		Menu m = new Menu();
		
//		List<Pizza> listaPizze = m.getMenuPizza();
//		PizzaMargherita pm = pizzaMargherita();
//		listaPizze.add(pm);
;		
		 m.getMenuPizza().add(pizzaMargherita());
		 m.getMenuPizza().add(pizzaHawaian());
		 m.getMenuPizza().add(pizzaSalami());
		 m.getMenuPizza().add(pizzaFamilySize(pizzaMargherita()));
		 
		 m.getMenuDrink().add(drinkLemonade());
		 m.getMenuDrink().add(drinkWater());
		 
		return m;
	}
	
	
	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	public PizzaHawaian pizzaHawaian() {
		return new PizzaHawaian();
	}
	
	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	@Bean
	public PizzaFamilySize pizzaFamilySize(Pizza p) {
		return new PizzaFamilySize(p);
	}
	
	@Bean
	public DrinkLemonade drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	public DrinkWater drinkWater() {
		return new DrinkLemonade();
	}
	
	
 }
