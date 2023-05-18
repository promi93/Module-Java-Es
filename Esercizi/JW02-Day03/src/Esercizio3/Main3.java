package Esercizio3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main3 {



	public static void main(String[] args) {
		

		try {
			leggiRegistro();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void scriviPresenze() throws IOException {
		String presenze = "Mario Rossi";
		File file = new File("Presenze/test.txt");
		FileUtils.writeStringToFile(file, presenze, "UTF-8"); 
	}
	
	public static void leggiRegistro() throws IOException {
		File file = new File("Presenze/test.txt");
		String read = FileUtils.readFileToString(file, "UTF-8");
		System.out.println(read);
		
	}
	
	public static void cancellaRegistro() throws IOException {
		File file = new File("Registro/");
		
		FileUtils.deleteDirectory(file);
		
	}
	
	

}
