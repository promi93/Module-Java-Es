package Esercizio2;
import java.util.Random;

public class Main {
	
	private static int[] array ;

	public static void main(String[] args) {

		array = inizializzaArray(3000);
		
		Thread t1 = new Thread(new PrimoThread(array, 0, 1000));
		Thread t2 = new Thread(new PrimoThread(array, 1000, 1000));
		Thread t3 = new Thread(new PrimoThread(array, 2000, 1000));
		
		
		try {
		
		t1.start();
		t2.start();
		t3.start();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Integer sommaTotale= 0;
		
			for(Integer v : PrimoThread.ListaRisultati) {
				sommaTotale += v;
			}

	}
	
	private static int[] inizializzaArray(int size) {
		Random randomize = new Random();
		int[] arr1 = new int[size];
		for(int i = 0; i < 3000; i++) {
			arr1[i] = randomize.nextInt(100);
		}
		return arr1;
	}

}
