package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class MainProject {

	private static Logger log = LoggerFactory.getLogger(MainProject.class);
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		stampaDoppia();
//		testList();
//		testSet();
//		testMap();
//		testQueue();
	}
	
	

	public static void stampaDoppia() {
		
		Set<String> arr = new HashSet <String>();
	

		System.out.println("Inserisci il numero (da 1 a 2) di parole che vuoi generare : ");
		
		
		int a = Integer.parseInt(scanner.nextLine());
		
			for(int i = 0; i < a; i++) {
			
				if(a == 0) {
					log.error("Arrivederci");
				} else {				
				System.out.println("Inserisci parola: ");
				String parola = scanner.nextLine();
				boolean setParola = arr.add(parola);
				
					
					if(!setParola) {
						
						System.out.print("Parola duplicata: " + parola);
					}
					
                }
				
				System.out.println("Parole distinte: " + arr.size());
				
				System.out.println("Elenco parole distinte: ");
				
			}
	}
}
					

