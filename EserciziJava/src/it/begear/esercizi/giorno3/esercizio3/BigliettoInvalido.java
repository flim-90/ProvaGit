package it.begear.esercizi.giorno3.esercizio3;
// vclasse personalizzata di eccezioni
public class BigliettoInvalido extends Exception {
	private String messaggioDiErrore;

	public BigliettoInvalido(String messaggioDiErrore) {
		super();
		this.messaggioDiErrore = messaggioDiErrore;
	}

	public BigliettoInvalido() {
		messaggioDiErrore = "Biglietto Invalido";
	}

	public String getMessaggioDiErrore() {
		return messaggioDiErrore;
	}

	public void setMessaggioDiErrore(String messaggioDiErrore) {
		this.messaggioDiErrore = messaggioDiErrore;
	}

	


}
