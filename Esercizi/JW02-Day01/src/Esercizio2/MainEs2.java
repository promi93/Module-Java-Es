package Esercizio2;

import java.util.Scanner;

public class MainEs2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.print("Quanti km hai percorso?\n");
            double km = scan.nextDouble();
            
            System.out.print("Quanti litri del carburante hai consumati?\n");
            double litri = scan.nextDouble();
            
            double kmPerLitro = km / litri;
            System.out.println("Il numero di km/litro percorsi è: " + kmPerLitro);
        } catch (ArithmeticException e) {
            System.out.println("Errore! Inserire un valore diverso da 0 per i litri di carburante consumati.");
        } catch (Exception e) {
            System.out.println("Errore: inserire un valore numerico valido.");
        } finally {
            scan.close();
        }
    }

}
