package it.begear.esercizi.giorno4.esercizio7;

public abstract class  Aereomobile {

	private String sigla;

	public Aereomobile(String sigla) {
		super();
		setSigla(sigla);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public abstract void superiorita(Aereomobile aereomobile);
	// definisco il metodo potenza comparazione
}
