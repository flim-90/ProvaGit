package it.begear.esercizi.giorno8.esercizio3;

public class Utente {

	private String nome;
	private String cognome;
	
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
	public Utente(String nome, String cognome) {
		super();
		setNome(nome);
		setCognome(cognome);
	}
	
	
}
