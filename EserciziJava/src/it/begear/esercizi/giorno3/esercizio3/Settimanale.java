package it.begear.esercizi.giorno3.esercizio3;

public class Settimanale extends Biglietto {

//attributo

	private int settimanaDiValidita;

// Costruttore, però manca la settimanaDiValidità, la aggiungo nei parametri
// in entrata e la assegno come attributo this.

	public Settimanale(int numero, int settimanaDiValidita) throws BigliettoInvalido {
		super(numero);
		if (settimanaDiValidita > 0 && settimanaDiValidita < 5) {
			setSettimanaDiValidita(settimanaDiValidita);
		} else {
			throw new BigliettoInvalido("Settimana selezionata inesistente");
		}

	}

	public int getSettimanaDiValita() {
		return settimanaDiValidita;
	}

	public void setSettimanaDiValidita(int settimanaDiValidita) {
		this.settimanaDiValidita = settimanaDiValidita;
	}

	@Override
	public int getValidita() {
		// TODO Auto-generated method stub
		return this.settimanaDiValidita;
	}

}
