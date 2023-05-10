package Esercizio3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main3 {

	public static void main(String[] args) throws IOException {

		scriviPresenze();
		
	}
	
	public static void scriviPresenze() throws IOException {
		String presenze = "";
		File file = new File("Registro /test.txt");
		FileUtils.writeStringToFile(file, presenze, "UTF-8"); 
	}
	
	public static void leggiRegistro() throws IOException {
		File file = new File("Registro/test.txt");
		String read = FileUtils.readFileToString(file, "UFT-8");
		System.out.println(read);
		
	}
	
	public static void cancellaRegistro() throws IOException {
		File file = new File("Registro/");
		
		FileUtils.deleteDirectory(file);
		
	}
	
	

}
