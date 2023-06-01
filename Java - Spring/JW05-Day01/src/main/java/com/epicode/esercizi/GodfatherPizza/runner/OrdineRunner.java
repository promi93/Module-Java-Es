package com.epicode.esercizi.GodfatherPizza.runner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.esercizi.GodfatherPizza.configuration.MenuConfiguration;
import com.epicode.esercizi.GodfatherPizza.configuration.OrdineConfiguration;
import com.epicode.esercizi.GodfatherPizza.moodel.Drink;
import com.epicode.esercizi.GodfatherPizza.moodel.Ordine;
import com.epicode.esercizi.GodfatherPizza.moodel.Pizza;
import com.epicode.esercizi.GodfatherPizza.moodel.Tavolo;

@Component
public class OrdineRunner implements CommandLineRunner {

	Map<Integer, Tavolo> listaTavoli = new HashMap<Integer, Tavolo>();
	
	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(OrdineConfiguration.class);
	
	AnnotationConfigApplicationContext appMenuContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		

		configWith_Bean_Tavolo();
		configWith_Bean_Ordine();
		
		
		appContext.close();
		appMenuContext.close();
	}
	

	
	public void configWith_Bean_Tavolo() {
		
		
		System.out.println("\n********* Tavoli *********");
		
		Tavolo tavolo1 = (Tavolo) appContext.getBean("tavolo", 1, 4);
		Tavolo tavolo2 = (Tavolo) appContext.getBean("tavolo", 2, 6);
		Tavolo tavolo3 = (Tavolo) appContext.getBean("tavolo", 3, 2);

		
		listaTavoli.put(tavolo1.getNumeroTavolo(), tavolo1);
		listaTavoli.put(tavolo2.getNumeroTavolo(), tavolo2);
		listaTavoli.put(tavolo3.getNumeroTavolo(), tavolo3);
		
		
		System.out.println(listaTavoli.get(1));
		System.out.println(listaTavoli.get(2));
		System.out.println(listaTavoli.get(3));
		
//		System.out.println(tavolo1);
//		System.out.println(tavolo2);
//		System.out.println(tavolo3);
		
		
	}
	
	public  void configWith_Bean_Ordine() {
		
		System.out.println("\n********* Ordini *********");
		
		Ordine ordine1 = (Ordine) appContext.getBean("ordine", 1, listaTavoli.get(1), 2);
		
		Pizza margherita = (Pizza) appMenuContext.getBean("pizzaMargherita");
		Pizza salami = (Pizza) appMenuContext.getBean("pizzaSalami");
		
		Drink lemonade = (Drink) appMenuContext.getBean("drinkLemonade");
		Drink water = (Drink) appMenuContext.getBean("drinkWater");
		
		ordine1.getOrdinato().add(margherita);
		ordine1.getOrdinato().add(salami);
		ordine1.getOrdinato().add(lemonade);
		ordine1.getOrdinato().add(water);
		
		
		System.out.println(ordine1);
		
		System.out.println("\nIl conto totale è: " + ordine1.getTotale());
	}
 

}
