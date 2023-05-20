package Esercizitazione;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Prima esercitazione con Java");
		
		// Esercizio #2
        // System.out.println("\nEsercizio #2");
		// - Moltiplicazione
		// System.out.println("\nDigita due numeri per eseguire una moltipilcazione: ");
		
		Scanner scan = new Scanner(System.in);
		
		// moltiplicazione(scan);		
		
		// - Concatena
		
		// concatena(scan);
		
		// - InserisciInArray
//		
//		String[] strArr = {"A", "B", "C", "D", "E", "F"};
//		String str = "A";
//		String[] returnArry = inserisciInArray(strArr, str);
//		System.out.println("La lunghezza del nuovo array è: " + returnArry.length);
//		for (int i = 0; i < returnArry.length; i++) {
//			System.out.println(i + ": " + returnArry[i]);
//		}
		
		// Esercizio #3
//		System.out.println("\nInserisci tre stringhe\n");
//		inserisciStringhe(scan);
		
		
		// #Esercizio #4
		//System.out.println("\nInserisci i dati per calcolare il perimetro del rettangolo\n");
		//perimetroRettangolo(scan);
		
		//System.out.println("\nInserisci un numero per determinare se è pari o dispari\n");
		//pariDispari(scan);
		
		System.out.println("\nCalcola il perimetro e l'area del triangolo (utilizzando la formula di Erone\n");
		areaTriangolo(2,3,2);
		
	}
	
	
	// ESERCIZIO #2
	
	public static int moltiplicazione(Scanner scan) {
		System.out.println("Inserisci il primo numero:");
		int a = scan.nextInt();
		System.out.println("Inserisci il secondo numero:");
		int b = scan.nextInt();
	
		System.out.println("Il risultato della moltiplicazione è: ");
		int result = a * b;
		
		System.out.println(result);
		
		return result;
		
	}
	
	public static String concatena(Scanner scan) {
		System.out.println("Inserisci stringa:");
		String a = scan.nextLine();
		
		System.out.println("Inserisci intero:");
		int b = scan.nextInt();
		
		System.out.println("Il risultato della concatenazione:");
		String result = a + b;
		
		System.out.println(result);
		return result;
		
	}
	
	public static String[] inserisciInArray (String[] arr, String strArr) {
		
		String str = "A";

		
		String[] result3 = {arr[0], arr[1], str, arr[2], arr[3], arr[4]};
		
		
		return result3;
	}
	
	
	
	// ESERCIZIO #3

	public static String inserisciStringhe(Scanner scan) {
		
		System.out.println("Inserisci la prima stringa: ");
		String a = scan.next();
		
		System.out.println("Inserisci la seconda stringa: ");
		String b = scan.next();
		
		System.out.println("Inserisci la terza stringa: ");
		String c = scan.next();
		
		System.out.println("Ecco la tua concatenazione: ");
		String result = a + "-" + b + "-" + c;
		
		String inverso = new StringBuilder(result).reverse().toString();
		
		System.out.println(result + " stringa inversa: " + inverso);

		
		return inverso;
	}
	
	
	// Esercizio #4
	
	public static double perimetroRettangolo(Scanner scan) {
		System.out.println("Inserisci base: ");
		double a = scan.nextInt();;
		
		System.out.println("Inserisci altezza: ");
		double b = scan.nextInt();;
		
		System.out.println("hai calcolato il perimetro del tuo rettangolo che è equivalente a: ");
		double calcolaP = (a+b)*2;
		
		
		System.out.println(calcolaP);
		return calcolaP;
		
	}
	
	public static int pariDispari (Scanner scan) {
		System.out.println("Inserisci numero intero: ");
		int numero = scan.nextInt();
		
		if(numero  % 2 == 0) {
			System.out.println("hai inserito un numero pari");
		} else {
			System.out.println("hai inserito un numero dispari");
		}
		
		System.out.println(numero % 2);
		return numero % 2;
	}
	

	public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
	    double perimetro = lato1 + lato2 + lato3;
	    return perimetro;
	}

	public static double areaTriangolo(double lato1, double lato2, double lato3) {
	    double semiperimetro = perimetroTriangolo(lato1, lato2, lato3) / 2;
	    double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
	    System.out.println(area);
	    return area;
	}

	

	
	

}
