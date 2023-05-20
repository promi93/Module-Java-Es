package com.epicode.jbdtest;

import java.time.LocalDate;

public class Cliente {

	private Integer numeroCliente;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String regioneResidenza;
	
	
	public Cliente(String nome, String cognome, LocalDate dataNascita, String regioneResidenza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.regioneResidenza = regioneResidenza;
	}


	public Cliente(Integer numeroCliente, String nome, String cognome, LocalDate dataNascita, String regioneResidenza) {
		super();
		this.numeroCliente = numeroCliente;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.regioneResidenza = regioneResidenza;
	}


	public String getNome() {
		// TODO Auto-generated method stub
		return getNome();
	}


	public String getCognome() {
		// TODO Auto-generated method stub
		return getCognome();
	}


	public String getDataNascita() {
		// TODO Auto-generated method stub
		return getDataNascita();
	}


	public String getRegioneResidenza() {
		// TODO Auto-generated method stub
		return getRegioneResidenza();
	}
	
	
	
	
	
}
