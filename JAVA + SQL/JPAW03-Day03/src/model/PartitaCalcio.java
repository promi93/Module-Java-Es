package model;

public class PartitaCalcio extends Evento {

	private String squadraCasa;
	private String squadraOspite;
	private String squadraVincente = null;
	private Integer numeroGolCasa = 0;
	private Integer numeroGolOspite = 0;
	public String getSquadraCasa() {
		return squadraCasa;
	}
	public void setSquadraCasa(String squadraCasa) {
		this.squadraCasa = squadraCasa;
	}
	public String getSquadraOspite() {
		return squadraOspite;
	}
	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}
	public String getSquadraVincente() {
		return squadraVincente;
	}
	public void setSquadraVincente(String squadraVincente) {
		this.squadraVincente = squadraVincente;
	}
	public Integer getNumeroGolCasa() {
		return numeroGolCasa;
	}
	public void setNumeroGolCasa(Integer numeroGolCasa) {
		this.numeroGolCasa = numeroGolCasa;
	}
	public Integer getNumeroGolOspite() {
		return numeroGolOspite;
	}
	public void setNumeroGolOspite(Integer numeroGolOspite) {
		this.numeroGolOspite = numeroGolOspite;
	}
	@Override
	public String toString() {
		return "PartitaCalcio [squadraCasa=" + squadraCasa + ", squadraOspite=" + squadraOspite + ", squadraVincente="
				+ squadraVincente + ", numeroGolCasa=" + numeroGolCasa + ", numeroGolOspite=" + numeroGolOspite + "]";
	}
	
	
	
}
