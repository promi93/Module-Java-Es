package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_cliente")
	private Integer numeroCliente;
	
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Column(name = "data_nascita")
	private LocalDate dataNascita;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(name = "regione_residenza")
	private String regioneResidenza;
	
	
	
	
	
	public Integer getNumeroCliente() {
		return numeroCliente;
	}
	
	
	
	
	public void setNumeroCliente(Integer numeroCliente) {
		this.numeroCliente = numeroCliente;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCognome() {
		return cognome;
	}




	public void setCognome(String cognome) {
		this.cognome = cognome;
	}




	public LocalDate getDataNascita() {
		return dataNascita;
	}




	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}




	public String getRegioneResidenza() {
		return regioneResidenza;
	}




	public void setRegioneResidenza(String regioneResidenza) {
		this.regioneResidenza = regioneResidenza;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
