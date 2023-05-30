package com.epicode.esercizi.GodfatherPizza.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.esercizi.GodfatherPizza.moodel.DrinkLemonade;
import com.epicode.esercizi.GodfatherPizza.moodel.DrinkWater;
import com.epicode.esercizi.GodfatherPizza.moodel.FranchiseMug;
import com.epicode.esercizi.GodfatherPizza.moodel.FranchiseShirt;
import com.epicode.esercizi.GodfatherPizza.moodel.Menu;
import com.epicode.esercizi.GodfatherPizza.moodel.Pizza;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaFamilySize;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaHawaian;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaMargherita;
import com.epicode.esercizi.GodfatherPizza.moodel.PizzaSalami;
import com.epicode.esercizi.GodfatherPizza.moodel.ToppingCheese;
import com.epicode.esercizi.GodfatherPizza.moodel.ToppingHam;
import com.epicode.esercizi.GodfatherPizza.moodel.ToppingOnions;
import com.epicode.esercizi.GodfatherPizza.moodel.ToppingPineapple;
import com.epicode.esercizi.GodfatherPizza.moodel.Wine;

@Configuration
public class MenuConfiguration {

	@Bean
	public Menu menu() {
		Menu m = new Menu();
		
//		List<Pizza> listaPizze = m.getMenuPizza();
//		PizzaMargherita pm = pizzaMargherita();
//		listaPizze.add(pm);
;		

		// PIZZE
		 m.getMenuPizza().add(pizzaMargherita());
		 m.getMenuPizza().add(pizzaHawaian());
		 m.getMenuPizza().add(pizzaSalami());
		 m.getMenuPizza().add(pizzaFamilySize(pizzaMargherita()));
		 
		 // DRINK
		 m.getMenuDrink().add(drinkLemonade());
		 m.getMenuDrink().add(drinkWater());
		 m.getMenuDrink().add(wine());
		 
		 // TOPPINGPIZZA
		 m.getMenuTopping().add(toppingCheese());
		 m.getMenuTopping().add(toppingPineapple());
		 m.getMenuTopping().add(toppingHam());
		 m.getMenuTopping().add(toppingOnions());
		 
		 // FRANCHISE
		 m.getMenuFranchise().add(franchiseMug());
		 m.getMenuFranchise().add(franchiseShirt());
		 
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
		return new DrinkWater();
	}
	
	@Bean
	public Wine wine() {
		return new Wine();
	}
	
	@Bean
	public ToppingCheese toppingCheese() {
		return new ToppingCheese();
	}
	
	@Bean
	public ToppingPineapple toppingPineapple() {
		return new ToppingPineapple();
	}
	
	@Bean
	public ToppingHam toppingHam() {
		return new ToppingHam();
	}
	
	@Bean
	public ToppingOnions toppingOnions() {
		return new ToppingOnions();
	}
	
	@Bean
	public FranchiseMug franchiseMug() {
		return new FranchiseMug();
	}
	
	@Bean
	public FranchiseShirt franchiseShirt() {
		return new FranchiseShirt();
	}
	
	
	
 }
