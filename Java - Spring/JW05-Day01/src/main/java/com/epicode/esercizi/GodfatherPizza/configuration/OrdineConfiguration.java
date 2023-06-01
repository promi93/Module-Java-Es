package com.epicode.esercizi.GodfatherPizza.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.esercizi.GodfatherPizza.moodel.Ordine;
import com.epicode.esercizi.GodfatherPizza.moodel.Tavolo;

@Configuration
@PropertySource("classpath:application.properties")
public class OrdineConfiguration {
	
	
	// DA QUI SI LEGGE IL PARAMETRO COSTO_COPERTO ESSENDO STATO DICHIARATO NEL FILE "application.properties" come variabile Globale e fisso 
	
	@Value("${costo.coperto}") private Double costo_coperto;
	
	@Bean
	@Scope("prototype")
	public Tavolo tavolo(int numeroTavolo, int numeroCoperti) {
		return new Tavolo(numeroTavolo, numeroCoperti);
	}
	
	
	@Bean
	@Scope("prototype")
	public Ordine ordine(int numero_ordine, Tavolo tavolo, int numero_coperti) {
		
		return new Ordine(numero_ordine, tavolo, numero_coperti, costo_coperto);
	}

	
}
