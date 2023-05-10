package Esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainProject {

	private static Logger log = LoggerFactory.getLogger(MainProject.class);
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
	}
	
	

	private static List<Integer> listaRandom(int a) {
		
		List<Integer> lista = new ArrayList <Integer>();
	
		Random rand = new Random();

			for(int i = 0; i < a; i++) {
			
			lista.add(rand.nextInt(101));
				
			}
			return lista;
	}
	
}

					

