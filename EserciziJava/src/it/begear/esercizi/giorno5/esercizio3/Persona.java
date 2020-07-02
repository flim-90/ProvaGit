package it.begear.esercizi.giorno5.esercizio3;

public class Persona {
	private String nome;
	private String cognome;
	private String email;
	
	
	
	
	public Persona(String nome, String cognome, String email) {
		super();
		setNome(nome);
		setCognome(cognome);
		setEmail(email);	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
