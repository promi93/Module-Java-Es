package model;

import java.util.Set;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class GaraAtletica extends Evento {

	@ManyToMany
	private Set<Persona> SetAtleti;
	
	@ManyToOne
	private Persona vincitore;

	public Set<Persona> getSetAtleti() {
		return SetAtleti;
	}

	public void setSetAtleti(Set<Persona> setAtleti) {
		SetAtleti = setAtleti;
	}

	public Persona getVincitore() {
		return vincitore;
	}

	public void setVincitore(Persona vincitore) {
		this.vincitore = vincitore;
	}
	
	
}
