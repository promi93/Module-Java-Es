package com.epicode.esercizi.GodfatherPizza.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.epicode.esercizi.GodfatherPizza.configuration.MenuConfiguration;
import com.epicode.esercizi.GodfatherPizza.moodel.Menu;


@Component
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		

		configWith_Bean_Menu();
		
	}

	
	public static void configWith_Bean_Menu() {
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
	
}
