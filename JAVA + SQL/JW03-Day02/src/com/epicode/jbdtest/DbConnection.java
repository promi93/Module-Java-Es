package com.epicode.jbdtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "DBPrimoEs"; 
	String user = "postgres";
	String pass = "bologna93";
	Connection conn;
	Statement st;
	
	
	public DbConnection() throws SQLException {
		 conn =  DriverManager.getConnection(url + dbName, user, pass);
		 st = conn.createStatement();
	}
	
	
	public void inserisciCLiente(Cliente c) throws SQLException{
		String sql = "INSERTI INTO clienti(nome, cognome, dataNascita, regioneResidenza)" +
	    "VALUES ('" + c.getNome() + "', "
			  + "'" + c.getCognome() + "',"
			  + "'" + c.getDataNascita() + "', "
			  + "'" + c.getRegioneResidenza() + "')";
		st.executeUpdate(sql);
		System.out.println();
	}
	
	public Cliente leggiCliente(Integer id) throws SQLException {
		String sql = "SELECT * FROM clienti WHERE numeroCliente = " + id;
		ResultSet rs = st.executeQuery(sql);
	
		
		Cliente c = null;
		if(rs.next()) {
			int numeroCliente = rs.getInt("numeroCliente");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			String dataNascita = rs.getString("dataNascita");
			String regioneResidenza = rs.getString("regioneResidenza");
			c = new Cliente(numeroCliente, nome, cognome, LocalDate.parse(dataNascita), regioneResidenza);
			
		}
		return c;
	}



	
	
}
