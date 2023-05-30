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
		System.out.println("PIZZA");
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuItemLine()));
		System.out.println("DRINK");
		menu.getMenuPizza().forEach(d -> System.out.println(d.getMenuItemLine()));
		
		appContext.close();
	}
	
}
