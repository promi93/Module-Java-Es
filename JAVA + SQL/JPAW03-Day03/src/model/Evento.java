package model;


import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import Enumaration.TipoEvento;

@Entity
@Table(name = "evento")
@Inheritance(strategy = )
@NamedQuery(name = "findAllEvento", query = "SELECT ev FROM Evento ev")
public class Evento {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(nullable = false)
	private String titolo;

	@Column(nullable = false)
	private LocalDate dataEvento;

	@Column (name = "tipoEvento")
	@Enumerated (EnumType.STRING)
	private TipoEvento tipoEvento;

	@Column(nullable = false)
	private Integer numeroMassimoPartecipanti;
	
	@ManyToOne
	@Column(nullable = false)
	private Location location;
	
	@Column(nullable = false)
	private Set<Partecipazione> partecipazione;
	
	

	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}
public Evento(String titolo, LocalDate dataEvento, TipoEvento tipoEvento, Integer numeroMassimoPartecipanti, Location location, Set<Partecipazione> partecipazione) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
		this.location = location;
		this.partecipazione = partecipazione;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}



	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public Integer getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", tipoEvento=" + tipoEvento
				+ ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + ", location=" + location
				+ ", partecipazione=" + partecipazione + "]";
	}

	
	
}