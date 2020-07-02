package it.begear.esercizi.giorno8.esercizio3;
import java.util.HashMap;
import java.util.Map;
/*ESERCIZIO 3 - Degli utenti hanno un nome, cognome e codice fiscale.
Creare una mappa che assegni
ogni istanza di Utente a un singolo codice fiscale.
Chiedere in ingresso un codice fiscale e stampare tutti i dati relativi
(nome, cognome e codice stesso)*/

public class Ufficio {
	public static void main(String[] args) {
		
		Map<String, Utente> catalogoUtenti = new HashMap<String, Utente>();
		
		Utente utente1 = new Utente("Franco", "Rossi");
		Utente utente2 = new Utente("Alberto", "Bianchi");
		Utente utente3 = new Utente("Penelope", "Rossetti");
		Utente utente4 = new Utente("Dimitri", "Stakanov");
		Utente utente5 = new Utente("Jack","White");
			
		catalogoUtenti.put("frncrss90", utente1);
		catalogoUtenti.put("albtbnc86", utente2);
		catalogoUtenti.put("pnlprsst78", utente3);
		catalogoUtenti.put("dmtrstknv66", utente4);
		catalogoUtenti.put("jckwt97", utente5);
		
//		System.out.println(catalogoUtenti.size());		
		
		
		stampaDati(catalogoUtenti, "frncrss90");
	}
	
	
	// ciclo la lista di chiavi, verifico se è presente il cf//
	// rivediti bene le mappe ciccio
	public static void stampaDati (Map<String, Utente> catalogoUtenti, String codicefiscale) { 
		
		if (catalogoUtenti.containsKey(codicefiscale) == true) {
			
			System.out.println("Codice Fiscale : " + (codicefiscale) +" Nome : "+ catalogoUtenti.get(codicefiscale).getNome() + " Cognome : " +
					catalogoUtenti.get(codicefiscale).getCognome());
			
		}
	
	
	} 

}
