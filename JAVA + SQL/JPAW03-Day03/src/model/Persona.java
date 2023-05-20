package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import Enumaration.Sesso;


@Entity
@Table(name="persona")
@NamedQuery(name = "findAllPersona", query = "SELECT p FROM Persona p")


public class Persona {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private LocalDate dataNascita;
	
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Sesso sesso;
	
	
	@OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE)
	@OrderBy(value = "evento.dataEvento")
	@Column(nullable = false)
	private List<Partecipazione> listaPartecipanti;
	
	
	

	public Persona() {
		super();
	}

	public Persona(String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso,
			List<Partecipazione> listaPartecipanti) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
		this.listaPartecipanti = listaPartecipanti;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public List<Partecipazione> getListaPartecipanti() {
		return listaPartecipanti;
	}

	public void setListaPartecipanti(List<Partecipazione> listaPartecipanti) {
		this.listaPartecipanti = listaPartecipanti;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", dataNascita="
				+ dataNascita + ", sesso=" + sesso + ", listaPartecipanti=" + listaPartecipanti + "]";
	}

	public static EntityManagerFactory createEntityManagerFactory(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	
}
