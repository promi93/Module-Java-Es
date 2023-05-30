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
		
		
	}


}
