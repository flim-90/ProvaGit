package it.begear.esercizi.giorno4.esercizio5;

public class Distributore  {
	
	
	private String citta;
	private String proprietario;
	private int capacita;
	private int contenuto;
	
	public void erogazione (Distributore distributore, int erogato, int costoBenzinaOggi) {
		if (distributore.capacita > erogato) {
		System.out.println("Il distributore " + proprietario + " di " + citta + " ha erogato " + erogato + " l rimangono "
		+ (capacita - erogato) + " l per un guadagno di " + (erogato * costoBenzinaOggi) + " £ ");
		} else {
			
			System.out.println("Impossibile erogare la quantità selezionata");
			
			
		}
	
	
	
	
	
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getCapacita() {
		return capacita;
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}

	public int getContenuto() {
		return contenuto;
	}

	public void setContenuto(int contenuto) {
		this.contenuto = contenuto;
	} 

	
	
}
