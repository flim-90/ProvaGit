package it.begear.esercizi.giorno3.esercizio3;

public class Giornaliero extends Biglietto {

// attributo 
	private int giornoDiValidita;

// ecco il costruttore

	public Giornaliero(int numero, int giornoDiValidita) throws BigliettoInvalido {
// qui creiamo il super in modo che possa vedere il numero di biglietto da 
// Biglietto (Classe) per ereditarietà, da questo aggiungi col quickfix
// di passare anche il parametro int numero
		super(numero);
		if (giornoDiValidita > 0 && giornoDiValidita < 31) {
			setGiornoDiValidita(giornoDiValidita);
		} else {
			throw new BigliettoInvalido("Giorno selezionato non valido");
		}
		
// incapsuliamo ora il parametro giornoDiValidità

	}

	@Override
	public String toString() {
		return "Giornaliero [giornoDiValidita=" + giornoDiValidita + ", toString()=" + super.getNumero() + "]";
	}

	public int getGiornoDiValidita() {
		return giornoDiValidita;
	}

	public void setGiornoDiValidita(int giornoDiValidita) {
		this.giornoDiValidita = giornoDiValidita;
	}

// overide del modoto validità
	@Override
	public int getValidita() {
		// TODO Auto-generated method stub
		return this.giornoDiValidita;
	}

}
