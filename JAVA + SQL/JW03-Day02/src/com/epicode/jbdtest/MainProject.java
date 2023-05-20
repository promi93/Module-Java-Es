package com.epicode.jbdtest;

import java.sql.SQLException;
//import java.time.LocalDate;

public class MainProject {

	public static void main(String[] args) {
		
		try {
			
			DbConnection db = new DbConnection();
//			Cliente c = new Cliente("Marco", "Viola", LocalDate.of(1980, 11, 22), "Toscana");
//			db.inserisciCLiente(c);
			
			Cliente c = db.leggiCliente(3);
			System.out.println(c);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
