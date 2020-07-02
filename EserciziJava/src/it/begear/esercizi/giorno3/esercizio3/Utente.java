package it.begear.esercizi.giorno3.esercizio3;

public class Utente {

	private Biglietto[] biglietti;
	
	private String nome;
// Costruttore, come in tutte le classi, con il nome della Classe pari pari	
	public Utente(String nome) {
		
		this.nome = nome; 
	}
// iniziano i setters e getters dell'attributo	
	public void getBiglietti() {
		
		for (int i = 0; i < biglietti.length; i++) {

			Biglietto biglietto = biglietti[i];
			System.out.println("numero del biglietto: " + biglietto.getNumero());
			System.out.println("validità del biglietto: " + biglietto.getValidita());
			// System.out.println(biglietto.getGiornoDivalidita());
			// System.out.println(biglietto.getSettimanaDivalidita());
			// System.out.println(biglietto.getMeseDivalidita());
		}
		
		
		

	}

	public void setBiglietti(Biglietto[] biglietti) {
		this.biglietti = biglietti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
// ecco il metodo +++ 
	public void acquista (Biglietto[] biglietti) {
	
		setBiglietti(biglietti);
	
	
	}	
	
}


