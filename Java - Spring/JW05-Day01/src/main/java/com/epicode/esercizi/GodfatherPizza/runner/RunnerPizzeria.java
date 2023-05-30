package com.epicode.esercizi.GodfatherPizza.runner;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.esercizi.GodfatherPizza.configuration.MenuConfiguration;
import com.epicode.esercizi.GodfatherPizza.configuration.OrdineConfiguration;
import com.epicode.esercizi.GodfatherPizza.configuration.TavoloConfiguration;
import com.epicode.esercizi.GodfatherPizza.moodel.Menu;
import com.epicode.esercizi.GodfatherPizza.moodel.Ordine;
import com.epicode.esercizi.GodfatherPizza.moodel.StatoOrdine;
import com.epicode.esercizi.GodfatherPizza.moodel.Tavolo;


@Component
public class RunnerPizzeria implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		configWith_Bean();
		configWith_BeanOrdine();
		
		
	}
	
	public static void configWith_Bean() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		
		// Recupero il Bean Menu
		Menu menu = (Menu) appContext.getBean("menu");
		System.out.println("\n****** Menu ******");
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
	
	public static void configWith_BeanOrdine() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(OrdineConfiguration.class);
		
		Tavolo tavolo = (Tavolo) appContext.getBean("tavolo");
		tavolo.setDisponibilita(true);
		tavolo.setNumeroCoperti(4);
		tavolo.setNumeroTavolo(1);
		
		
		Ordine ordine = (Ordine) appContext.getBean("ordineTavolo");
		ordine.setTavolo(tavolo);
		ordine.setOrario(LocalDateTime.now());
		ordine.setStato_ordine(StatoOrdine.IN_CORSO);
		ordine.setNumero_ordine(3);
		ordine.setNumero_coperti(4);
		
		
		System.out.println(tavolo);
		System.out.println(ordine);
		
		
		
	}
 
	
	
}
