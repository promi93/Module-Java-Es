package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("Esercizi primo giorno JAVA");
		
		
		//ESERCIZIO #2
		Moltiplicazione(3, 5);
		
		
		//ESERCIZIO #3
		Concact("ciao", 2);
		
		
		//ESERCIZIO #4
		String[] strArr = {"A", "B", "C", "D", "E", "F"};
		String str = "A";
		String[] returnArry = inserisciInArray(strArr, str);
		System.out.println("La lunghezza del nuovo array è: " + returnArry.length);
		for (int i = 0; i < returnArry.length; i++) {
			System.out.println(i + ": " + returnArry[i]);
		}
		
		//ESERCIZIO #5
		perimetroRettangolo(2, 3);
		
				
		//ESERCIZIO #6
		pariDispari(10);
		
		
		//ESERCIZIO #7
		areaTriangolo(4, 3, 4);
		
		}



//ESERCIZIO #2
public static void Moltiplicazione (int n1, int n2) {
	
	int result = n1 * n2;
	
	System.out.println(result);
}


//ESERCIZIO #3
public static String Concact (String str, int num1) {
	
	String result2 = str + num1;
	
	
	System.out.println(result2);
	
	return result2;
	
}

//ESERCIZIO #4
public static String[] inserisciInArray (String[] arr, String strArr) {
	
	String str = "A";
	
	
	//result3[0] = arr[0];
	//result3[1] = arr[1];
	//result3[2] = str;
	//result3[3] = arr[2];
	//result3[4] = arr[3];
	//result3[5] = arr[4];
	
	String[] result3 = {arr[0], arr[1], str, arr[2], arr[3], arr[4]};
	
	
	return result3;
}


//ESERCIZIO #5
public static double perimetroRettangolo(double n1, double n2) {
	
	 double result4 = n1 * 2 + n2 * 2;
	 System.out.println(result4);
	 return result4;
	
}

//ESERCIZIO #6
public static int pariDispari(int n1) {
	
	int result5 = n1 % 2;
	System.out.println(result5);
	
	return result5;
}

//ESERCIZIO #7
public static double areaTriangolo(double n1, double n2, double n3) {
	
	double result6 = n1 * n2 / n3;
	System.out.println(result6);
	return result6;
}

}


