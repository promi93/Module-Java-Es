package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import Enumaration.Stato;


@Entity
@Table(name = "partecipazione")
@NamedQuery(name = "findAllPartecipazioni", query = "SELECT pa FROM Partecipazione pa")
public class Partecipazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;
	
	
	@ManyToOne
	@Column(nullable = false)
	private Persona persona;
	
	
	@ManyToOne
	@Column(nullable = false)
	private Evento evento;
	
	@Enumerated(EnumType.STRING)
	private Stato stato;

	
	
	
	public Partecipazione() {
		super();
	}




	public Partecipazione(Integer id, Persona persona, Evento evento, Stato stato) {
		super();
		this.id = id;
		this.persona = persona;
		this.evento = evento;
		this.stato = stato;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Persona getPersona() {
		return persona;
	}




	public void setPersona(Persona persona) {
		this.persona = persona;
	}




	public Evento getEvento() {
		return evento;
	}




	public void setEvento(Evento evento) {
		this.evento = evento;
	}




	public Stato getStato() {
		return stato;
	}




	public void setStato(Stato stato) {
		this.stato = stato;
	}




	@Override
	public String toString() {
		return "Partecipazione [id=" + id + ", persona=" + persona + ", evento=" + evento + ", stato=" + stato + "]";
	}
	
	
	
	
	
}
