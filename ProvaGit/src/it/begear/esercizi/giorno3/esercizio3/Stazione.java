package it.begear.esercizi.giorno3.esercizio3;

import java.util.Arrays;

//Costruire una stuttura di classi Biglietto con field numero. Costruire tre sottoclassi gironaliero, settimanale e mensile 
//con attributi rispettivamente: giorno di validità (il numero del giorno del mese), settimana di validità e mese di validità.
//Implementare un controllo via incapsulamento che verifichi che i giorni o settimane o mesi inseriti siano sensati.
//Classe Utente con attributo array di biglietti e metodo acquista. 
//Far acquistare tre bigietti a un utente e stampare numero, tipo e validità di ognuno.
public class Stazione {

	public static void main(String[] args) {

		
		Utente utente1 = new Utente("federico");

		try {
//le tonde ovviamente perchè una funione che riceverà il nome federico quindi
//avrebbe una stringa in entrata e aggiungo federico come ci dice eclipse
// stringa necessaria in utente per definire come attributo dell'oggetto
// il nome // 

			

//	System.out.print(federico.getNome());	

// ora devo far acquistare a federico dei biglietti quindi un array di
// Bigllietto[], creandolo e instanziamo anche la lunghezza poi assegno
// una nuova instanza di biglietti in bigliettiFederico ciclando uno
// per uno i suoi elementi che a default sono null

			Biglietto[] carnet = new Biglietto[3];

			// for( int i = 0; i < bigliettiFederico.length; i++) {
			//
			// bigliettiFederico[i] = new Biglietto(i);
			// dopo che abbiamo avuto la necessità di far diventare
			// biglietto una classe astratta non puo' piu' funzionare

//			System.out.println(bigliettiFederico[i].getNumero());
//		}

// ora creo biglietti specifici che passo all'utente li stampo  e vedo di che tipo
// e che nome hanno e per verificare che siano corretti creo le eccezioni
// nel costruttore delle sottoclassi di biglietto 

			Settimanale settimanale1 = new Settimanale(1, 4);
			Giornaliero giornaliero1 = new Giornaliero(2, 1);
			Mensile mensile1 = new Mensile(3, 12);

// Assegno i biglietti che Federico compra all' array

			carnet[0] = settimanale1;
			carnet[1] = giornaliero1;
			carnet[2] = mensile1;

// ora compro i bigliettiFederico utilizzando il metodo acquista di utente 

			utente1.acquista(carnet);

// ora voglio vedere i biglietti di federico uno ad uno quindi un bel ciclo
// for e per ogni biglietto nell'array biglietti stampo il suo numero

/*			Biglietto[] biglietti = utente1.getBiglietti();
			for (int i = 0; i < biglietti.length; i++) {

				Biglietto biglietto = biglietti[i];
				System.out.println("numero del biglietto: " + biglietto.getNumero());
				System.out.println("validità del biglietto: " + biglietto.getValidita());
//				System.out.println(biglietto.getGiornoDivalidita());
//				System.out.println(biglietto.getSettimanaDivalidita());
//				System.out.println(biglietto.getMeseDivalidita());
			} */

			System.out.println("valori dei biglietti dell'utente " + utente1.getNome() + ":");
			utente1.getBiglietti();
		} catch (BigliettoInvalido e) {
			
			System.out.println(e.getMessaggioDiErrore());
			e.printStackTrace();
			
		
		}

// e cerco di stamparli mostrando i loro valori interni

		
		
		
	}
}
