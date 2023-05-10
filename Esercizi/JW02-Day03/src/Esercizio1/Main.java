package Esercizio1;


public class Main {

	
	public static void main(String[] args) {
		

		Thread t1  = new Thread(new starThread("*"));
		Thread t2  = new Thread(new starThread("#"));
		
		t1.start();
		t2.start();
	}
	
 

}
