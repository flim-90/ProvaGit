package it.begear.esercizi.giorno3.esercizio3;

public class Mensile extends Biglietto  {

// attributo
	
	int meseDiValidita;
	
// costruttore
	
	public Mensile(int numero, int meseDiValidita) throws BigliettoInvalido {

// come al solito mi tocca il super per ereditare il valore numero da passare 
// al costruttore 
		
		
		super(numero);
		if (meseDiValidita > 0 && meseDiValidita < 13) {
		setMeseDiValidita(meseDiValidita);
		} else {
			
			throw new BigliettoInvalido("Mese selezionato non esistente");
			
		}
		

	}

// metto int meseDiValidita a private e costruisco i setter e getter
	
	public int getMeseDiValidita() {
		return meseDiValidita;
	}

	public void setMeseDiValidita(int meseDiValidita) {
		this.meseDiValidita = meseDiValidita;
	}

	@Override
	public int getValidita() {
		// TODO Auto-generated method stub
		return this.meseDiValidita;
	}

	
	

	
	
	
	
}
