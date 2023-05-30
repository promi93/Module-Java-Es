package com.epicode.esercizi.GodfatherPizza.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.esercizi.GodfatherPizza.moodel.Ordine;
import com.epicode.esercizi.GodfatherPizza.moodel.Tavolo;

@Configuration
public class OrdineConfiguration {
	
	@Bean
	@Scope("prototype")
	public Ordine ordineTavolo() {
		return new Ordine();
	}
	
	@Bean
	@Scope("prototype")
	public Tavolo tavolo() {
		return new Tavolo();
	}
	

	
}
