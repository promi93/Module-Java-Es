package com.epicode.esercizi.GodfatherPizza;

import org.springframework.boot.SpringApplication;
import com.epicode.esercizi.GodfatherPizza.moodel.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.esercizi.GodfatherPizza.configuration.MenuConfiguration;

@SpringBootApplication
public class GodfatherPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfatherPizzaApplication.class, args);
		
		configWith_Bean();
	}

	public static void configWith_Bean() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		
		
		Menu menu = (Menu) appContext.getBean("menu");
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuItemLine()));
		
		appContext.close();
	}
	
}
