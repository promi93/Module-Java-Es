package com.epicode.esercizi.GodfatherPizza;

import org.springframework.boot.SpringApplication;
import com.epicode.esercizi.GodfatherPizza.moodel.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.esercizi.GodfatherPizza.configuration.MenuConfiguration;

@SpringBootApplication
public class GodfatherPizzaApplication {

	public static void main(String[] args) {
		// Creo un Container dove utilizzare i Bean sulla base del file di configurazione
		SpringApplication.run(GodfatherPizzaApplication.class, args);
		
		configWith_Bean();
	}

	public static void configWith_Bean() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		
		// Recupero il Bean Menu
		Menu menu = (Menu) appContext.getBean("menu");
		System.out.println("****** Menu ******");
		System.out.println("\nPIZZAS:");
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuItemLine()));
		System.out.println("\nTOPPINGS PIZZAS:");
		menu.getMenuTopping().forEach(t -> System.out.println(t.getMenuItemLine()));
		System.out.println("\nDRINKS:");
		menu.getMenuDrink().forEach(d -> System.out.println(d.getMenuItemLine()));
		System.out.println("\nFRANCHISE:");
		menu.getMenuFranchise().forEach(f -> System.out.println(f.getMenuItemLine()));
		
		
		appContext.close();
	}
	
}
