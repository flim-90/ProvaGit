package it.begear.esercizi.giorno3.esercizio3;

public abstract class Biglietto  {
	
	private int numero;

// il costruttore che genero sempre nelle classi, così posso creare dei
//	biglietti (source generate costructor)
// anche qui va privatizzato
	public Biglietto(int numero) {
		
		setNumero(numero); 
	}

// ho creato un metodo per avere in ritorno la validità di ogni tipo
// di validità
	
	public abstract int getValidita();
	
//cosi ho un modo sicuro per settare e ricevere questo int
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
