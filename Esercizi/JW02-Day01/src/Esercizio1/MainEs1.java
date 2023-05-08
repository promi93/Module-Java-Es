package Esercizio1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;



public class MainEs1 {

	public static void main(String[] args) {
		
		
		int[] arrValori = new int[5];
		Random randomize = new Random();
		
		for (int i = 0; i < arrValori.length; i++) {
            arrValori[i] = randomize.nextInt(10) + 1;

	}
		
	     Scanner scanner = new Scanner(System.in);

	        while (true) {

	        	System.out.print("Scegli un numero tra questi: \n"); 
	            System.out.println(Arrays.toString(arrValori));
	            System.out.print("Altrimenti digita 0 per uscire! \n");

	            try {

	               
	                String numeroString = scanner.nextLine();
	                int numero = Integer.parseInt(numeroString);
	                
	                if (numero == 0) {
	                    break; 
	                }

	                System.out.print("Scegli posizione da 0 a 4:\n");
	                String posizioneString = scanner.nextLine();
	                int posizione = Integer.parseInt(posizioneString);

	                
	                arrValori[posizione] = numero;

	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Posizione non trovata! Per favore scegli tra le opzioni indicate (0-4)");
	                scanner.nextLine(); 
	            } catch (Exception e) {
	                System.out.println("Input non valido!");
	                scanner.nextLine(); 
	            }

	        }

	        System.out.println("Programma terminato!");
	        
	        scanner.close();
	
	}


}
