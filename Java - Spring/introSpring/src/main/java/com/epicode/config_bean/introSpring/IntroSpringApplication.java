package com.epicode.config_bean.introSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.config_bean.configuration.ConfigTestBean;
import com.epicode.config_bean.configuration.Test;

@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringApplication.class, args);
		
		System.out.println("Run...");
		
		// Metodo 1
		// Configurazione tramite classe @Configuration
		configWith_Bean();
		
	}

	public static void configWith_Bean() {
		
		// Creo un  Container dove utilizzare i Bean
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigTestBean.class);
		
		// Recupero il Bean test
		Test t1 = (Test) appContext.getBean("test");
		System.out.println(t1.readTxt());
		
		// Recupero il Bean paramTest
		Test t2 = (Test) appContext.getBean("paramTest", "Costruzione bean con parametri");
		System.out.println(t2.readTxt());
		
		// Recuero il Bean paramTest
		Test t3 = (Test) appContext.getBean("paramAllTest", "Terzo Bean", "Costruzione bean con tutti i parametri");
		System.out.println(t3.readTxt());
		
		// Chiudo il Context
		appContext.close();
	}
	
}
